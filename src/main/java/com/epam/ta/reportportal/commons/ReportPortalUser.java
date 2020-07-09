/*
 * Copyright 2019 EPAM Systems
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.ta.reportportal.commons;

import com.epam.ta.reportportal.entity.project.ProjectRole;
import com.epam.ta.reportportal.entity.user.UserRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

/**
 * ReportPortal user representation
 *
 * @author <a href="mailto:andrei_varabyeu@epam.com">Andrei Varabyeu</a>
 */

@AllArgsConstructor
@Data
@Builder
public class ReportPortalUser implements UserDetails {
    private String username;
    private String password;
    private Long userId;
    private UserRole userRole;
    private String email;
    private Map<String, ProjectDetails> projectDetails;
    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Data
    @Builder
    @AllArgsConstructor
    public static class ProjectDetails implements Serializable {
        @JsonProperty(value = "id")
        private Long projectId;
        @JsonProperty(value = "name")
        private String projectName;
        @JsonProperty("role")
        private ProjectRole projectRole;
    }

    public ReportPortalUser fromUser(com.epam.ta.reportportal.entity.user.User user) {
        this.username = user.getLogin();
        this.email = user.getPassword();
        this.userId = user.getId();
        this.userRole = user.getRole();
        this.password = ofNullable(user.getPassword()).orElse("");
        this.authorities = Collections.singletonList(new SimpleGrantedAuthority(user.getRole().getAuthority()));
        this.projectDetails = user.getProjects().stream().collect(Collectors.toMap(
                it -> it.getProject().getName(),
                it -> ProjectDetails.builder()
                        .projectId(it.getProject().getId())
                        .projectRole(it.getProjectRole())
                        .projectName(it.getProject().getName())
                        .build()
        ));
        return ReportPortalUser.builder().build();
    }
}


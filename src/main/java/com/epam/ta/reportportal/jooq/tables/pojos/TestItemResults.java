/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.pojos;

import com.epam.ta.reportportal.jooq.enums.StatusEnum;

import javax.annotation.Generated;
import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestItemResults implements Serializable {

    private static final long serialVersionUID = -865913896;

    private Long       itemId;
    private StatusEnum status;
    private Float      duration;

    public TestItemResults() {}

    public TestItemResults(TestItemResults value) {
        this.itemId = value.itemId;
        this.status = value.status;
        this.duration = value.duration;
    }

    public TestItemResults(
        Long       itemId,
        StatusEnum status,
        Float      duration
    ) {
        this.itemId = itemId;
        this.status = status;
        this.duration = duration;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public StatusEnum getStatus() {
        return this.status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Float getDuration() {
        return this.duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TestItemResults (");

        sb.append(itemId);
        sb.append(", ").append(status);
        sb.append(", ").append(duration);

        sb.append(")");
        return sb.toString();
    }
}

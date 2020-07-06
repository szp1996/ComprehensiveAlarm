package com.comprehensiveAlarm.po;

import java.util.Date;

public class WorkorderFlow {
    private String workorder_id;

    private String contact_person;

    private Date time;

    private String status;

    public String getWorkorder_id() {
        return workorder_id;
    }

    public void setWorkorder_id(String workorder_id) {
        this.workorder_id = workorder_id == null ? null : workorder_id.trim();
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person == null ? null : contact_person.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}
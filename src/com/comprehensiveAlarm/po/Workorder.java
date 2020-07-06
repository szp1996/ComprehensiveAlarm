package com.comprehensiveAlarm.po;

public class Workorder {
    private String workorder_id;

    private String title;

    private String alarm_codes;

    private Integer type;

    private String contact_person;

    private String contact_org;

    private Integer status;

    private String feedback;

    private String knowledge_id;

    public String getWorkorder_id() {
        return workorder_id;
    }

    public void setWorkorder_id(String workorder_id) {
        this.workorder_id = workorder_id == null ? null : workorder_id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAlarm_codes() {
        return alarm_codes;
    }

    public void setAlarm_codes(String alarm_codes) {
        this.alarm_codes = alarm_codes == null ? null : alarm_codes.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person == null ? null : contact_person.trim();
    }

    public String getContact_org() {
        return contact_org;
    }

    public void setContact_org(String contact_org) {
        this.contact_org = contact_org == null ? null : contact_org.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }

    public String getKnowledge_id() {
        return knowledge_id;
    }

    public void setKnowledge_id(String knowledge_id) {
        this.knowledge_id = knowledge_id == null ? null : knowledge_id.trim();
    }
}
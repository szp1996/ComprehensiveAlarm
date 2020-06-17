package com.comprehensiveAlarm.po;

import java.util.Date;

public class AlarmInfo {
    private String alarm_id;

    private String alarm_title;

    private Date alarm_time;

    private String alarm_code_id;

    private String alarm_status;

    private String scene_id;

    private String workorder_id;

    private String monitor_type;

    private String origin;

    public String getAlarm_id() {
        return alarm_id;
    }

    public void setAlarm_id(String alarm_id) {
        this.alarm_id = alarm_id == null ? null : alarm_id.trim();
    }

    public String getAlarm_title() {
        return alarm_title;
    }

    public void setAlarm_title(String alarm_title) {
        this.alarm_title = alarm_title == null ? null : alarm_title.trim();
    }

    public Date getAlarm_time() {
        return alarm_time;
    }

    public void setAlarm_time(Date alarm_time) {
        this.alarm_time = alarm_time;
    }

    public String getAlarm_code_id() {
        return alarm_code_id;
    }

    public void setAlarm_code_id(String alarm_code_id) {
        this.alarm_code_id = alarm_code_id == null ? null : alarm_code_id.trim();
    }

    public String getAlarm_status() {
        return alarm_status;
    }

    public void setAlarm_status(String alarm_status) {
        this.alarm_status = alarm_status == null ? null : alarm_status.trim();
    }

    public String getScene_id() {
        return scene_id;
    }

    public void setScene_id(String scene_id) {
        this.scene_id = scene_id == null ? null : scene_id.trim();
    }

    public String getWorkorder_id() {
        return workorder_id;
    }

    public void setWorkorder_id(String workorder_id) {
        this.workorder_id = workorder_id == null ? null : workorder_id.trim();
    }

    public String getMonitor_type() {
        return monitor_type;
    }

    public void setMonitor_type(String monitor_type) {
        this.monitor_type = monitor_type == null ? null : monitor_type.trim();
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }
}
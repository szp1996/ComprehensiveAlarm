package com.comprehensiveAlarm.po;

public class AlarmBussiness {
    private String alarm_bussiness_id;

    private String alarm_bussiness_name;

    private String scene_id;

    public String getAlarm_bussiness_id() {
        return alarm_bussiness_id;
    }

    public void setAlarm_bussiness_id(String alarm_bussiness_id) {
        this.alarm_bussiness_id = alarm_bussiness_id == null ? null : alarm_bussiness_id.trim();
    }

    public String getAlarm_bussiness_name() {
        return alarm_bussiness_name;
    }

    public void setAlarm_bussiness_name(String alarm_bussiness_name) {
        this.alarm_bussiness_name = alarm_bussiness_name == null ? null : alarm_bussiness_name.trim();
    }

    public String getScene_id() {
        return scene_id;
    }

    public void setScene_id(String scene_id) {
        this.scene_id = scene_id == null ? null : scene_id.trim();
    }
}
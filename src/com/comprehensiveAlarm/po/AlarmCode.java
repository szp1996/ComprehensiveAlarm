package com.comprehensiveAlarm.po;

public class AlarmCode {
    private String alarm_code_id;

    private String alarm_code_name;

    private String level;

    private String description;

    private Integer min_threshold;

    private Integer max_threshold;

    private String scene_id;

    private String threshold;

    public String getAlarm_code_id() {
        return alarm_code_id;
    }

    public void setAlarm_code_id(String alarm_code_id) {
        this.alarm_code_id = alarm_code_id == null ? null : alarm_code_id.trim();
    }

    public String getAlarm_code_name() {
        return alarm_code_name;
    }

    public void setAlarm_code_name(String alarm_code_name) {
        this.alarm_code_name = alarm_code_name == null ? null : alarm_code_name.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getMin_threshold() {
        return min_threshold;
    }

    public void setMin_threshold(Integer min_threshold) {
        this.min_threshold = min_threshold;
    }

    public Integer getMax_threshold() {
        return max_threshold;
    }

    public void setMax_threshold(Integer max_threshold) {
        this.max_threshold = max_threshold;
    }

    public String getScene_id() {
        return scene_id;
    }

    public void setScene_id(String scene_id) {
        this.scene_id = scene_id == null ? null : scene_id.trim();
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold == null ? null : threshold.trim();
    }
}
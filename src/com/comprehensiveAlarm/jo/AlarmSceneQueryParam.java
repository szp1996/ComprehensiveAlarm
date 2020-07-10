package com.comprehensiveAlarm.jo;

public class AlarmSceneQueryParam {
    private int page;
    private int page_size;
    private String scene_name;
    private String alarm_code_id;
    private String level;
    private int offset;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void offset(){
        offset= (page-1)*page_size;
    }
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public String getScene_name() {
        return scene_name;
    }

    public void setScene_name(String scene_name) {
        this.scene_name = scene_name;
    }

    public String getAlarm_code_id() {
        return alarm_code_id;
    }

    public void setAlarm_code_id(String alarm_code_id) {
        this.alarm_code_id = alarm_code_id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

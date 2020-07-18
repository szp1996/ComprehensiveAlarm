package com.comprehensiveAlarm.jo;

public class AlarmBussinessQueryParam {
    private String scene_name;
    private String alarm_bussiness_name;
    private int page;
    private int page_size;
    private int offset;

    public void offset(){
        offset = page_size * (page - 1);
    }

    public String getScene_name() {
        return scene_name;
    }

    public void setScene_name(String scene_name) {
        this.scene_name = scene_name;
    }

    public String getAlarm_bussiness_name() {
        return alarm_bussiness_name;
    }

    public void setAlarm_bussiness_name(String alarm_bussiness_name) {
        this.alarm_bussiness_name = alarm_bussiness_name;
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

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}

package com.comprehensiveAlarm.po;

public class Knowledge {
    private String id;

    private String title;

    private String content;

    private String scene_id;

    private String alarm_codes;

    private Integer origin_flag;

    private Integer share_num;

    private Integer search_num;

    private Integer feedback_num;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getScene_id() {
        return scene_id;
    }

    public void setScene_id(String scene_id) {
        this.scene_id = scene_id == null ? null : scene_id.trim();
    }

    public String getAlarm_codes() {
        return alarm_codes;
    }

    public void setAlarm_codes(String alarm_codes) {
        this.alarm_codes = alarm_codes == null ? null : alarm_codes.trim();
    }

    public Integer getOrigin_flag() {
        return origin_flag;
    }

    public void setOrigin_flag(Integer origin_flag) {
        this.origin_flag = origin_flag;
    }

    public Integer getShare_num() {
        return share_num;
    }

    public void setShare_num(Integer share_num) {
        this.share_num = share_num;
    }

    public Integer getSearch_num() {
        return search_num;
    }

    public void setSearch_num(Integer search_num) {
        this.search_num = search_num;
    }

    public Integer getFeedback_num() {
        return feedback_num;
    }

    public void setFeedback_num(Integer feedback_num) {
        this.feedback_num = feedback_num;
    }
}
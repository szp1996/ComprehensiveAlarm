package com.comprehensiveAlarm.po;

public class WorkorderType {
    private Integer id;

    private String name;

    private String scene_ids;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getScene_ids() {
        return scene_ids;
    }

    public void setScene_ids(String scene_ids) {
        this.scene_ids = scene_ids == null ? null : scene_ids.trim();
    }
}
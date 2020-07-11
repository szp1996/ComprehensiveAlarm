package com.comprehensiveAlarm.jo;

import com.comprehensiveAlarm.po.AlarmCode;

public class AlarmCodeCustom extends AlarmCode {
	private String scene_id;

    private String scene_name;

    public String getScene_id() {
        return scene_id;
    }

    public void setScene_id(String scene_id) {
        this.scene_id = scene_id == null ? null : scene_id.trim();
    }

    public String getScene_name() {
        return scene_name;
    }

    public void setScene_name(String scene_name) {
        this.scene_name = scene_name == null ? null : scene_name.trim();
    }

}

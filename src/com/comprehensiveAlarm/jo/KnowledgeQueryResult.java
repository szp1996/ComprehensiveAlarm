package com.comprehensiveAlarm.jo;

import com.comprehensiveAlarm.po.Knowledge;

public class KnowledgeQueryResult extends Knowledge {
    private String scene_name;

    private String alarm_code_id;
    
    private String alarm_code_name;
    
    private String scene_id;

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

	public String getAlarm_code_name() {
		return alarm_code_name;
	}

	public void setAlarm_code_name(String alarm_code_name) {
		this.alarm_code_name = alarm_code_name;
	}

	public String getScene_id() {
		return scene_id;
	}

	public void setScene_id(String scene_id) {
		this.scene_id = scene_id;
	}
    
    
}

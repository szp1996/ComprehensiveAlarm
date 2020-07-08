package com.comprehensiveAlarm.jo;

import com.comprehensiveAlarm.po.AlarmInfo;

public class AlarmInfoCustom extends AlarmInfo {
	
	private String alarm_code_name;
	private String scene_name;
	public String getAlarm_code_name() {
		return alarm_code_name;
	}
	public void setAlarm_code_name(String alarm_code_name) {
		this.alarm_code_name = alarm_code_name;
	}
	public String getScene_name() {
		return scene_name;
	}
	public void setScene_name(String scene_name) {
		this.scene_name = scene_name;
	}
	

}

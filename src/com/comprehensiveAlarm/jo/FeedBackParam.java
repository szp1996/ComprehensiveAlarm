package com.comprehensiveAlarm.jo;

public class FeedBackParam {
	private String workorder_id;//	工单id
	private String feedback	;//	反馈
	private String alarm_codes;//	告警类型（多个用-连接）
	private String title;//	标题
	private String scene_id;//对象
	
	public String getScene_id() {
		return scene_id;
	}
	public void setScene_id(String scene_id) {
		this.scene_id = scene_id;
	}
	public String getWorkorder_id() {
		return workorder_id;
	}
	public void setWorkorder_id(String workorder_id) {
		this.workorder_id = workorder_id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getAlarm_codes() {
		return alarm_codes;
	}
	public void setAlarm_codes(String alarm_codes) {
		this.alarm_codes = alarm_codes;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	
}

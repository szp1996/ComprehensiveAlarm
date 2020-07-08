package com.comprehensiveAlarm.jo;

//告警信息查询参数
public class AlarmInformationQueryParam {

	private String origin;
	private String scene_name;
	private String alarm_code_name;
	private String alarm_status;
	private String level;
	private String begin_alarm_time;
	private String end_alarm_time;
	private int page;
	private int page_size;
	private int offset;
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getScene_name() {
		return scene_name;
	}
	public void setScene_name(String scene_name) {
		this.scene_name = scene_name;
	}
	public String getAlarm_code_name() {
		return alarm_code_name;
	}
	public void setAlarm_code_name(String alarm_code_name) {
		this.alarm_code_name = alarm_code_name;
	}
	public String getAlarm_status() {
		return alarm_status;
	}
	public void setAlarm_status(String alarm_status) {
		this.alarm_status = alarm_status;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
 
	public String getBegin_alarm_time() {
		return begin_alarm_time;
	}
	public void setBegin_alarm_time(String begin_alarm_time) {
		this.begin_alarm_time = begin_alarm_time;
	}
	public String getEnd_alarm_time() {
		return end_alarm_time;
	}
	public void setEnd_alarm_time(String end_alarm_time) {
		this.end_alarm_time = end_alarm_time;
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
	
	public void offset() {
		offset= (page-1)*page_size;
	}
	
}

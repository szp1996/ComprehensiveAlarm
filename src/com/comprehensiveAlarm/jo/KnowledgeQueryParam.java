package com.comprehensiveAlarm.jo;

public class KnowledgeQueryParam {
	private int page;//页数
	private int page_size;//每页数量
	private int offset;//偏移量
	private String key	;//关键字
	private String id;//知识编号
	private String scene_id;//告警对象编号
	private String alarm_code_id;//告警类型编号
	
	public void offset() {
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
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getScene_id() {
		return scene_id;
	}
	public void setScene_id(String scene_id) {
		this.scene_id = scene_id;
	}
	public String getAlarm_code_id() {
		return alarm_code_id;
	}
	public void setAlarm_code_id(String alarm_code_id) {
		this.alarm_code_id = alarm_code_id;
	}
	

}

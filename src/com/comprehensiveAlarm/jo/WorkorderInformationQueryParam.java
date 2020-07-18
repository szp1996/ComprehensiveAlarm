package com.comprehensiveAlarm.jo;

public class WorkorderInformationQueryParam {

	private String title;	//标题,模糊搜索
	private String alarm_code;	//关联告警类型编号,精确查找
	private String contact_person;	//维护人,模糊搜索
	private int status;//(待响应1；维护中2；待核验3；已完成4)	
	private int page;
	private int page_size;
	private int offset;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlarm_code() {
		return alarm_code;
	}
	public void setAlarm_code(String alarm_code) {
		this.alarm_code = alarm_code;
	}
	public String getContact_person() {
		return contact_person;
	}
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return page_size;
	}
	public void setPageSize(int pageSize) {
		this.page_size = pageSize;
	}
	public void offset() {
		offset= (page-1)*page_size;
	}
}

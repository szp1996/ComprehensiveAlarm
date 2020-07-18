package com.comprehensiveAlarm.jo;

public class DispatchParam {

	private String  contact_person	;//	维护人
	private String contact_org	;//	维护单位
	private int way	;//	派发方式(短信1，邮件2，首页通知公告3)
	private String number	;//	手机号/邮箱号
	private String template_id	;//	模板id
	private String  workorder_id	;//	工单id
	public String getContact_person() {
		return contact_person;
	}
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	public String getContact_org() {
		return contact_org;
	}
	public void setContact_org(String contact_org) {
		this.contact_org = contact_org;
	}
	public int getWay() {
		return way;
	}
	public void setWay(int way) {
		this.way = way;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTemplate_id() {
		return template_id;
	}
	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}
	public String getWorkorder_id() {
		return workorder_id;
	}
	public void setWorkorder_id(String workorder_id) {
		this.workorder_id = workorder_id;
	}

}

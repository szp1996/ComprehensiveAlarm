package com.comprehensiveAlarm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comprehensiveAlarm.jo.WorkorderInformationQueryParam;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.Workorder;
import com.comprehensiveAlarm.po.WorkorderTemplate;
import com.comprehensiveAlarm.po.WorkorderType;
import com.comprehensiveAlarm.service.WorkOrderInformationDisplayService;


@Controller
public class WorkOrderInformationDisplayController {

	@Autowired
	private WorkOrderInformationDisplayService  workOrderInformationDisplayService;

	//得到工单信息查询条件下拉框
	@RequestMapping("/getQueryConditionsForWorkorder")
	@ResponseBody
	public Object  getQueryConditionsForWorkorder() {
		List<AlarmCode> list=workOrderInformationDisplayService.getAllAlarmCode();
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("result", 1);
		result.put("data", list);
		return workOrderInformationDisplayService;
	}
	
	//根据条件查询告工单信息
	@RequestMapping("/getWorkorder")
	@ResponseBody
	public Object  getWorkorder(@RequestBody WorkorderInformationQueryParam param) {
		
		Map<String,Object> result=new HashMap<String,Object>();
		List<Workorder> list=workOrderInformationDisplayService.getWorkorder(param);
		result.put("result", 1);
		result.put("data", list);
		return result;
	}
	//得到派发模板
	@RequestMapping("/getWorkorderTemplate")
	@ResponseBody
	public Object  getWorkorderTemplate() {
		List< WorkorderTemplate> list=workOrderInformationDisplayService.getWorkorderTemplate();
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("result", 1);
		result.put("data", list);
		return workOrderInformationDisplayService;
	}

}

package com.comprehensiveAlarm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comprehensiveAlarm.jo.AlarmInfoCustom;
import com.comprehensiveAlarm.jo.AlarmInformationQueryParam;
import com.comprehensiveAlarm.po.AlarmInfo;
import com.comprehensiveAlarm.service.AlarmInformationDisplayService;

@Controller
public class AlarmInformationDisplayController {

	@Autowired
	private AlarmInformationDisplayService alarmInformationDisplayService;

	//获取查询告警信息下拉框
	@RequestMapping("/getQueryConditionsForAlarmInformation")
	@ResponseBody
	public Object  getQueryConditionsForAlarmInformation() {
		List<String> originList=alarmInformationDisplayService.getQueryConditionsForAlarmInformationOrigin();
		List<String> sceneNameList=alarmInformationDisplayService.getQueryConditionsForAlarmInformationSceneName();
		List<String> alarmCodeNameList=alarmInformationDisplayService.getQueryConditionsForAlarmInformationAlarmCodeName();
		Map<String,List<String>> data=new HashMap<String,List<String>>();
		data.put("origin", originList);
		data.put("scene_name", sceneNameList);
		data.put("alarm_code_name", alarmCodeNameList);
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("result", 1);
		result.put("data", data);
		return result;
	}
	
	//查询告警信息
	@RequestMapping("/getAlarmInformation")
	@ResponseBody
	public Object  getAlarmInformation(@RequestBody  AlarmInformationQueryParam  param) {
		
		List<AlarmInfoCustom> list=alarmInformationDisplayService.getAlarmInformation(param);
		Map<String,Object> result=new HashMap<String,Object>();
		Map<String,Object> data=new HashMap<String,Object>();
		data.put("list", list);
		result.put("result", 1);
		result.put("data", data);
		return result;
	}

}

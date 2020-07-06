package com.comprehensiveAlarm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.DOutdeviceinfo;
import com.comprehensiveAlarm.po.ETaskResult;
import com.comprehensiveAlarm.service.AlarmInterfaceService;

@Controller
public class AlarmInterfaceController {
	
	@Autowired
	private AlarmInterfaceService  alarmInterfaceService;


	//
	@RequestMapping(value="/ResponseEntitytriggerAlarm",method = RequestMethod.POST,params = {"alarmCode"})
	@ResponseBody
	public Map<String, Object> GetAlarmByAlarmCode(String alarmCode) {
		
		 
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("alarmCode", alarmCode);
		return map;
		
	}
	
	//
	@RequestMapping(value="/ResponseEntitytriggerAlarm",method = RequestMethod.POST,params = {"alarmCode","taskID","taskType"})
	@ResponseBody
	public Map<String, Object> GetAlarmByAlarmCodeTaskIDTaskType(String alarmCode,String taskID,int taskType) {
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("alarmCode", alarmCode);
		map.put("taskID", taskID);
		map.put("taskType", taskType);
		
		
		return map;
	 
		
	}
	
	
}

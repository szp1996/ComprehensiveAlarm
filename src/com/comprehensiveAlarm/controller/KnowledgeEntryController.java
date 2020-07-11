package com.comprehensiveAlarm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comprehensiveAlarm.jo.AlarmCodeCustom;
import com.comprehensiveAlarm.jo.AlarmInfoCustom;
import com.comprehensiveAlarm.jo.AlarmInformationQueryParam;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.KnowledgeTemp;
import com.comprehensiveAlarm.service.AlarmInformationDisplayService;
import com.comprehensiveAlarm.service.KnowledgeEntryService;

@Controller
public class KnowledgeEntryController {
	
	@Autowired
    private KnowledgeEntryService knowledgeEntryService;

	
	
	//知识录入时获取告警对象
	@RequestMapping("/getAlarmCode")
	@ResponseBody
	public Object  getAlarmCode() {
		
		List<AlarmCodeCustom> list=knowledgeEntryService.getAlarmCode();
		Map<String,Object> result=new HashMap<String,Object>();
		Map<String,Object> data=new HashMap<String,Object>();
		data.put("list", list);
		result.put("result", 1);
		result.put("data", data);
		return result;
	}
	
	//知识录入
	@RequestMapping("/addKnowledge")
	@ResponseBody
	public Object  addKnowledge(@RequestBody  KnowledgeTemp  param) {
		knowledgeEntryService.addKnowledge(param);
		Map<String,Object> result=new HashMap<String,Object>();
		result.put("result", 1);
		return result;
	}
}

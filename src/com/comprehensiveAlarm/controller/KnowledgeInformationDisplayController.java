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
import com.comprehensiveAlarm.jo.KnowledgeQueryParam;
import com.comprehensiveAlarm.jo.KnowledgeQueryResult;
import com.comprehensiveAlarm.service.AlarmInformationDisplayService;
import com.comprehensiveAlarm.service.KnowledgeInformationDisplayService;

@Controller
public class KnowledgeInformationDisplayController {
	
	@Autowired
    private KnowledgeInformationDisplayService knowledgeInformationDisplayService;
	

	//知识展示的下拉框信息
	@RequestMapping("/getQueryConditionsForKnowledge")
	@ResponseBody
	public Object  getQueryConditionsForKnowledge() {

		  List<String> idList = knowledgeInformationDisplayService.getQueryConditionsForKnowledgeId();
	        List<String> sceneIdList = knowledgeInformationDisplayService.getQueryConditionsForKnowledgeSceneIdList();
	        List<String> alarmCodeId = knowledgeInformationDisplayService.getQueryConditionsForKnowledgealarmAlarmCodeId();
	        Map<String, List<String>> data = new HashMap<String, List<String>>();
	        data.put("id", idList);
	        data.put("scene_id", sceneIdList);
	        data.put("alarm_code_id", alarmCodeId);
	        Map<String, Object> result = new HashMap<String, Object>();
	        result.put("result", 1);
	        result.put("data", data);
	        return result;
	}
	
	//根据条件获取知识列表
	@RequestMapping("/getKnowledge")
	@ResponseBody
	public Object  getKnowledge(@RequestBody  KnowledgeQueryParam  param) {
		
		List<KnowledgeQueryResult> list=knowledgeInformationDisplayService.getKnowledge(param);
		Map<String,Object> result=new HashMap<String,Object>();
		Map<String,Object> data=new HashMap<String,Object>();
		data.put("list", list);
		result.put("result", 1);
		result.put("data", data);
		return result;
	}

}

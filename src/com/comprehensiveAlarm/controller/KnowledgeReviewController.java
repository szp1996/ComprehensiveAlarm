package com.comprehensiveAlarm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comprehensiveAlarm.jo.JudgeKnowledgeParam;
import com.comprehensiveAlarm.jo.KnowledgeQueryParam;
import com.comprehensiveAlarm.jo.KnowledgeQueryResult;
import com.comprehensiveAlarm.po.KnowledgeTemp;
import com.comprehensiveAlarm.service.KnowledgeReviewService;

@Controller
public class KnowledgeReviewController {
	
	@Autowired
	private KnowledgeReviewService  knowledgeReviewService;

	//知识审核
	@RequestMapping("/judgeKnowledge")
	@ResponseBody
	public Object  judgeKnowledge(@RequestBody  JudgeKnowledgeParam  param) {
		Map<String,Object> result=new HashMap<String,Object>();
		
		if(param.getId().isEmpty()||(param.getType()!=1&&param.getType()!=2)) {
			result.put("result", 0);
			result.put("data","参数为空");
		}
		else {
			knowledgeReviewService.judgeKnowledge(param);
			
			result.put("result", 1);
			result.put("data", "");
		}
			
		
		return result;
	}
	
	//知识编辑
	@RequestMapping("/updateKnowledge")
	@ResponseBody
	public Object  updateKnowledge(@RequestBody  KnowledgeTemp  param) {
		Map<String,Object> result=new HashMap<String,Object>();

		knowledgeReviewService.updateKnowledge(param);
			
		result.put("result", 1);
		result.put("data", "");
	
		return result;
	}
}

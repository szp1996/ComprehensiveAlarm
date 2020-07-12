package com.comprehensiveAlarm.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.comprehensiveAlarm.jo.JudgeKnowledgeParam;
import com.comprehensiveAlarm.po.KnowledgeTemp;


public interface KnowledgeReviewService {

	//知识审核
	void judgeKnowledge(JudgeKnowledgeParam  param);
	
	//知识编辑
	void updateKnowledge(KnowledgeTemp param);
}

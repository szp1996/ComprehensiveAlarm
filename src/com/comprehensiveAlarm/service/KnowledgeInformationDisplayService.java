package com.comprehensiveAlarm.service;

import java.util.List;

import com.comprehensiveAlarm.jo.AlarmInfoCustom;
import com.comprehensiveAlarm.jo.KnowledgeQueryParam;
import com.comprehensiveAlarm.jo.KnowledgeQueryResult;

public interface KnowledgeInformationDisplayService {
	
	//知识展示的下拉框信息
	 List<String> getQueryConditionsForKnowledgeId();
     List<String> getQueryConditionsForKnowledgeSceneIdList();
     List<String> getQueryConditionsForKnowledgealarmAlarmCodeId();
     
     
     List<KnowledgeQueryResult> getKnowledge(KnowledgeQueryParam param);

}

package com.comprehensiveAlarm.service;

import java.util.List;

public interface KnowledgeInformationDisplayService {
	
	//知识展示的下拉框信息
	 List<String> getQueryConditionsForKnowledgeId();
     List<String> getQueryConditionsForKnowledgeSceneIdList();
     List<String> getQueryConditionsForKnowledgealarmAlarmCodeId();

}

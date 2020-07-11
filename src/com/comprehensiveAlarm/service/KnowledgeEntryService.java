package com.comprehensiveAlarm.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.comprehensiveAlarm.jo.AlarmCodeCustom;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.KnowledgeTemp;

public interface KnowledgeEntryService {
	//得到告警类型信息
	List<AlarmCodeCustom> getAlarmCode();
	//知识录入
	void addKnowledge(KnowledgeTemp  param);
}

package com.comprehensiveAlarm.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.AlarmInfoMapper;
import com.comprehensiveAlarm.dao.KnowledgeMapper;
import com.comprehensiveAlarm.service.KnowledgeInformationDisplayService;

@Service
public class KnowledgeInformationDisplayServiceImpl implements KnowledgeInformationDisplayService {

	@Autowired
	private KnowledgeMapper knowledgeMapper;
	
	
	
	//知识展示的下拉框信息
	@Override
	public List<String> getQueryConditionsForKnowledgeId() {
		// TODO Auto-generated method stub
		return knowledgeMapper.getQueryConditionsForKnowledgeId();
	}
	//知识展示的下拉框信息
	@Override
	public List<String> getQueryConditionsForKnowledgeSceneIdList() {
		// TODO Auto-generated method stub
		return knowledgeMapper.getQueryConditionsForKnowledgeSceneIdList();
	}
	//知识展示的下拉框信息
	@Override
	public List<String> getQueryConditionsForKnowledgealarmAlarmCodeId() {
		// TODO Auto-generated method stub
		Set<String> res=new HashSet<>();
		 List<String> list=knowledgeMapper.getQueryConditionsForKnowledgealarmAlarmCodeId();
		 //有可能关联的告警类型有多个，多个用“-”连接
		 for(String str:list) {
			 if(str.contains("-")) {
				 String[] strs=str.split("-");
				 for(int i=0;i<strs.length;i++) {
					 res.add(strs[i]);
				 }
			 }
			 else {
				 res.add(str);
			 }
		 }
		return new ArrayList<String>(res);
	}

}

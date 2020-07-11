package com.comprehensiveAlarm.serviceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.AlarmCodeMapper;
import com.comprehensiveAlarm.dao.AlarmInfoMapper;
import com.comprehensiveAlarm.dao.AlarmSceneMapper;
import com.comprehensiveAlarm.dao.KnowledgeMapper;
import com.comprehensiveAlarm.jo.KnowledgeQueryParam;
import com.comprehensiveAlarm.jo.KnowledgeQueryResult;
import com.comprehensiveAlarm.service.KnowledgeInformationDisplayService;

@Service
public class KnowledgeInformationDisplayServiceImpl implements KnowledgeInformationDisplayService {

	@Autowired
	private KnowledgeMapper knowledgeMapper;
	
	@Autowired
	private AlarmCodeMapper alarmCodeMapper;
 
	@Autowired
	private AlarmSceneMapper alarmSceneMapper;
	
	
	
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
	@Override
	public List<KnowledgeQueryResult> getKnowledge(KnowledgeQueryParam param) {
		// TODO Auto-generated method stub
		param.offset();
		List<KnowledgeQueryResult> list=knowledgeMapper.getKnowledge(param);
		List<KnowledgeQueryResult> res=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAlarm_codes().contains("-")) {
				String str=list.get(i).getAlarm_codes();
				String[] strs=str.split("-");
				for(int j=0;j<strs.length;j++ ) {
					KnowledgeQueryResult knowResult=new KnowledgeQueryResult();
					knowResult.setId(list.get(i).getId());
					knowResult.setAlarm_code_id(strs[j]);
					knowResult.setAlarm_code_name(alarmCodeMapper.getAlarmCodeById(strs[j]).getAlarm_code_name());
					knowResult.setContent(list.get(i).getContent());
					knowResult.setFeedback_num(list.get(i).getFeedback_num());
					knowResult.setOrigin_flag(list.get(i).getOrigin_flag());
					knowResult.setScene_id(list.get(i).getScene_id());
					knowResult.setScene_name(alarmSceneMapper.getAlarmSceneById(list.get(i).getScene_id()).getScene_name());
					knowResult.setSearch_num(list.get(i).getSearch_num());
					knowResult.setShare_num(list.get(i).getShare_num());
					knowResult.setTitle(list.get(i).getTitle());
					res.add(knowResult);
				}
			} else {
				KnowledgeQueryResult knowResult=new KnowledgeQueryResult();
				knowResult.setId(list.get(i).getId());
				knowResult.setAlarm_code_id(list.get(i).getAlarm_codes());
				knowResult.setAlarm_code_name(alarmCodeMapper.getAlarmCodeById(list.get(i).getAlarm_codes()).getAlarm_code_name());
				knowResult.setContent(list.get(i).getContent());
				knowResult.setFeedback_num(list.get(i).getFeedback_num());
				knowResult.setOrigin_flag(list.get(i).getOrigin_flag());
				knowResult.setScene_id(list.get(i).getScene_id());
				knowResult.setScene_name(alarmSceneMapper.getAlarmSceneById(list.get(i).getScene_id()).getScene_name());
				knowResult.setSearch_num(list.get(i).getSearch_num());
				knowResult.setShare_num(list.get(i).getShare_num());
				knowResult.setTitle(list.get(i).getTitle());
				res.add(knowResult);
			}
		}
		return res;
	}

}

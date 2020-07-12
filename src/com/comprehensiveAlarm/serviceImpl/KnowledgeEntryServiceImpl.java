package com.comprehensiveAlarm.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.AlarmCodeMapper;
import com.comprehensiveAlarm.dao.AlarmInfoMapper;
import com.comprehensiveAlarm.dao.KnowledgeTempMapper;
import com.comprehensiveAlarm.jo.AlarmCodeCustom;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.KnowledgeTemp;
import com.comprehensiveAlarm.service.KnowledgeEntryService;

@Service
public class KnowledgeEntryServiceImpl implements KnowledgeEntryService {
	
	@Autowired
	private AlarmCodeMapper alarmCodeMapper;
	
	
	@Autowired
	private KnowledgeTempMapper knowledgeTempMapper;
	

	@Override
	public List<AlarmCodeCustom> getAlarmCode() {
		// TODO Auto-generated method stub
		return alarmCodeMapper.getAlarmCode();
	}


	@Override
	public void addKnowledge(KnowledgeTemp param) {
		// TODO Auto-generated method stub
		String uuid = UUID.randomUUID().toString();
		param.setId(String.format("%s%s", param.getScene_id(),uuid));
		param.setStatus(1);//1表示待审核
		param.setAbandon(0);
		param.setOrigin_flag(0);
		knowledgeTempMapper.insert(param);
	}

}

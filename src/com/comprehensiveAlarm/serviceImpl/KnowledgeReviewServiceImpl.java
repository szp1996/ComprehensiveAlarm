package com.comprehensiveAlarm.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.KnowledgeMapper;
import com.comprehensiveAlarm.dao.KnowledgeTempMapper;
import com.comprehensiveAlarm.jo.JudgeKnowledgeParam;
import com.comprehensiveAlarm.po.Knowledge;
import com.comprehensiveAlarm.po.KnowledgeTemp;
import com.comprehensiveAlarm.service.KnowledgeReviewService;

@Service
public class KnowledgeReviewServiceImpl implements KnowledgeReviewService {

	@Autowired
	private KnowledgeMapper knowledgeMapper;
	
	@Autowired
	private KnowledgeTempMapper knowledgeTempMapper;
	
	
	
	@Override
	public void judgeKnowledge(JudgeKnowledgeParam param) {
		// TODO Auto-generated method stub
		if(param.getType()==1) {//通过，将知识从待审核表转到知识表里
			KnowledgeTemp temp=knowledgeTempMapper.selectByPrimaryKey(param.getId());
			Knowledge know=new Knowledge();
			know.setAlarm_codes(temp.getAlarm_codes());
			know.setContent(temp.getContent());
			know.setFeedback_num(0);
			know.setId(temp.getId());
			know.setOrigin_flag(temp.getOrigin_flag());
			know.setScene_id(temp.getScene_id());
			know.setSearch_num(0);
			know.setShare_num(0);
			know.setTitle(temp.getTitle());
			knowledgeMapper.insert(know);
			knowledgeTempMapper.deleteByPrimaryKey(param.getId());
		} else if(param.getType()==2) {//不通过
			knowledgeTempMapper.updateStatusToNoPassById(param.getId());
		}else {
			
		}
	}



	@Override
	public void updateKnowledge(KnowledgeTemp param) {
		// TODO Auto-generated method stub
		knowledgeTempMapper.updateByPrimaryKey(param);
	}

}

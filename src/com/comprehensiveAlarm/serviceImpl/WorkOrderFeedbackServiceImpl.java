package com.comprehensiveAlarm.serviceImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.KnowledgeTempMapper;
import com.comprehensiveAlarm.dao.WorkorderFlowMapper;
import com.comprehensiveAlarm.dao.WorkorderMapper;
import com.comprehensiveAlarm.jo.FeedBackParam;
import com.comprehensiveAlarm.po.KnowledgeTemp;
import com.comprehensiveAlarm.po.Workorder;
import com.comprehensiveAlarm.po.WorkorderFlow;
import com.comprehensiveAlarm.service.WorkOrderFeedbackService;

@Service
public class WorkOrderFeedbackServiceImpl implements WorkOrderFeedbackService {

	
	@Autowired
	private WorkorderMapper workorderMapper;
	
	@Autowired
	private WorkorderFlowMapper workorderFlowMapper;
	
	@Autowired
	private KnowledgeTempMapper knowledgeTempMapper;
	
	
	@Override
	public void getOrders(String Workorder_id) {
		// TODO Auto-generated method stub
		//向workorder_flow插入一条维护中的信息
		WorkorderFlow workorderFlow=new WorkorderFlow();
		workorderFlow.setWorkorder_id(Workorder_id);
		workorderFlow.setStatus("维护中");
		workorderFlow.setTime(new Date());
		Workorder workorder=workorderMapper.selectByPrimaryKey(Workorder_id);
		workorderFlow.setContact_person(workorder.getContact_person());
		workorderFlowMapper.insert(workorderFlow);
		
		
		//更新workorder的状态为维护中2
		workorderMapper.getOrdersUpdateStatus(Workorder_id);
		
		
	}
	//反馈
	@Override
	public void feedback(FeedBackParam param) {
		// TODO Auto-generated method stub
		//向workorder_flow插入一条维护中的信息
				WorkorderFlow workorderFlow=new WorkorderFlow();
				workorderFlow.setWorkorder_id(param.getWorkorder_id());
				workorderFlow.setStatus("已完成");
				workorderFlow.setTime(new Date());
				Workorder workorder=workorderMapper.selectByPrimaryKey(param.getWorkorder_id());
				workorderFlow.setContact_person(workorder.getContact_person());
				workorderFlowMapper.insert(workorderFlow);
				//更新workorder的状态为维护中3
				workorderMapper.feedbackUpdateStatus(param.getWorkorder_id());
				//生成知识
				KnowledgeTemp knowledgeTemp=new KnowledgeTemp();
				knowledgeTemp.setAlarm_codes(param.getAlarm_codes());
				knowledgeTemp.setContent(param.getFeedback());
				knowledgeTemp.setStatus(1);
				knowledgeTemp.setScene_id(param.getScene_id());
				knowledgeTempMapper.insert(knowledgeTemp);
	}

}

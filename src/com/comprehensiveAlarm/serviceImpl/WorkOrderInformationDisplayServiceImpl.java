package com.comprehensiveAlarm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.AlarmCodeMapper;
import com.comprehensiveAlarm.dao.DispatchRecordMapper;
import com.comprehensiveAlarm.dao.WorkorderMapper;
import com.comprehensiveAlarm.dao.WorkorderTemplateMapper;
import com.comprehensiveAlarm.jo.DispatchParam;
import com.comprehensiveAlarm.jo.WorkorderInformationQueryParam;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.DispatchRecord;
import com.comprehensiveAlarm.po.Workorder;
import com.comprehensiveAlarm.po.WorkorderTemplate;
import com.comprehensiveAlarm.service.WorkOrderInformationDisplayService;

@Service
public class WorkOrderInformationDisplayServiceImpl implements WorkOrderInformationDisplayService {

	@Autowired
	private AlarmCodeMapper alarmCodeMapper;
 
	@Autowired
	private WorkorderMapper workorderMapper;
	
	@Autowired
	private WorkorderTemplateMapper workorderTemplateMapper;

	@Autowired
	private DispatchRecordMapper dispatchRecordMapper;

	@Override
	public List<AlarmCode> getAllAlarmCode() {
		// TODO Auto-generated method stub
		return alarmCodeMapper.getAllAlarmCode();
	}


	@Override
	public List<Workorder> getWorkorder(WorkorderInformationQueryParam param) {
		// TODO Auto-generated method stub
		param.offset();
		return workorderMapper.getWorkorder(param);
	}


	@Override
	public List<WorkorderTemplate> getWorkorderTemplate() {
		// TODO Auto-generated method stub
		return workorderTemplateMapper.getWorkorderTemplate();
	}


	@Override
	public void dispatch(DispatchParam param) {
		// TODO Auto-generated method stub
		//更新工单信息workorder中的维护人、维护单位、状态
		Workorder workorder =new Workorder();
		workorder.setWorkorder_id(param.getWorkorder_id());
		workorder.setStatus(1);//1表示待响应
		workorder.setContact_org(param.getContact_org());
		workorder.setContact_person(param.getContact_person());
		workorderMapper.dispatchUpdateWorkorder(workorder);
		
		//添加派发表dispatch_record
		DispatchRecord dispatchRecord=new DispatchRecord();
		dispatchRecord.setWorkorder_id(param.getWorkorder_id());
		dispatchRecord.setWay(param.getWay());
		//
		//此处接短信、邮箱接口
		//
		dispatchRecord.setSuccess(1);
		dispatchRecordMapper.insert(dispatchRecord);
	}

}

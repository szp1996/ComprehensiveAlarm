package com.comprehensiveAlarm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.AlarmCodeMapper;
import com.comprehensiveAlarm.dao.WorkorderMapper;
import com.comprehensiveAlarm.dao.WorkorderTemplateMapper;
import com.comprehensiveAlarm.jo.WorkorderInformationQueryParam;
import com.comprehensiveAlarm.po.AlarmCode;
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

}

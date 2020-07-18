package com.comprehensiveAlarm.service;

import java.util.List;

import com.comprehensiveAlarm.jo.WorkorderInformationQueryParam;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.Workorder;
import com.comprehensiveAlarm.po.WorkorderTemplate;

public interface WorkOrderInformationDisplayService {

	List<AlarmCode> getAllAlarmCode();
	
	//根据条件查询工单信息
	List<Workorder> getWorkorder(WorkorderInformationQueryParam param);
	
	//得到派发模板
	List< WorkorderTemplate> getWorkorderTemplate();
}

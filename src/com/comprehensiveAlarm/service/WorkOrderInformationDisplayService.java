package com.comprehensiveAlarm.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.comprehensiveAlarm.jo.DispatchParam;
import com.comprehensiveAlarm.jo.WorkorderFlowResult;
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
	
	//派发
	void dispatch(DispatchParam param);
	
	//得到处理进度
	List<WorkorderFlowResult> dispatchRecord(String Workorder_id);
	
	//完成工单
	void overOrders(String Workorder_id);
	
}

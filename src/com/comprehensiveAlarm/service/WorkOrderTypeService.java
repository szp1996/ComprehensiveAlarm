package com.comprehensiveAlarm.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.comprehensiveAlarm.po.AlarmScene;
import com.comprehensiveAlarm.po.WorkorderType;

public interface WorkOrderTypeService {

	//得到整改类型
	List<WorkorderType> getWorkorderType();
	
	 //根据id获取告警对象（场景）信息
    AlarmScene getAlarmSceneById(String scene_id);
    
    //根据id更新工单类型
    void updateWorkorderType(WorkorderType param);
}

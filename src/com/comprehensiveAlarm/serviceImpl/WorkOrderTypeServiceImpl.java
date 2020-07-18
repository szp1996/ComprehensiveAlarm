package com.comprehensiveAlarm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.AlarmSceneMapper;
import com.comprehensiveAlarm.dao.WorkorderTypeMapper;
import com.comprehensiveAlarm.po.AlarmScene;
import com.comprehensiveAlarm.po.WorkorderType;
import com.comprehensiveAlarm.service.WorkOrderTypeService;

@Service
public class WorkOrderTypeServiceImpl implements WorkOrderTypeService{

	@Autowired
	private WorkorderTypeMapper  workorderTypeMapper;
	
	@Autowired
	private AlarmSceneMapper  alarmSceneMapper;
	
	
	//得到整改类型
	@Override
	public List<WorkorderType> getWorkorderType() {
		// TODO Auto-generated method stub
		return workorderTypeMapper.getWorkorderType();
	}


	@Override
	public AlarmScene getAlarmSceneById(String scene_id) {
		// TODO Auto-generated method stub
		return alarmSceneMapper.getAlarmSceneById(scene_id);
	}


	//根据id更新工单类型
	@Override
	public void updateWorkorderType(WorkorderType param) {
		// TODO Auto-generated method stub
		workorderTypeMapper.updateByPrimaryKey(param);
	}
	

	
}

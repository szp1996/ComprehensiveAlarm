package com.comprehensiveAlarm.jo;

import java.util.List;

import com.comprehensiveAlarm.po.AlarmScene;
import com.comprehensiveAlarm.po.WorkorderType;


public class WorkorderTypeResult extends WorkorderType {
	
	private List<AlarmScene> alarmSceneList;

	public List<AlarmScene> getAlarmSceneList() {
		return alarmSceneList;
	}

	public void setAlarmSceneList(List<AlarmScene> alarmSceneList) {
		this.alarmSceneList = alarmSceneList;
	}

	
	
	
}

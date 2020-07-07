package com.comprehensiveAlarm.service;

import java.util.List;

public interface AlarmInformationDisplayService {
	
	//告警信息展示得到下拉框的信息
	List<String> getQueryConditionsForAlarmInformationOrigin();
	List<String>  getQueryConditionsForAlarmInformationSceneName();
	List<String> getQueryConditionsForAlarmInformationAlarmCodeName();
	
	

}

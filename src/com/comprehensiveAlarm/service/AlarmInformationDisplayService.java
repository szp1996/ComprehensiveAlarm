package com.comprehensiveAlarm.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.comprehensiveAlarm.jo.AlarmInfoCustom;
import com.comprehensiveAlarm.jo.AlarmInformationQueryParam;
import com.comprehensiveAlarm.po.AlarmInfo;

public interface AlarmInformationDisplayService {

    //告警信息展示得到下拉框的信息
    List<String> getQueryConditionsForAlarmInformationOrigin();
    List<String> getQueryConditionsForAlarmInformationSceneName();
    List<String> getQueryConditionsForAlarmInformationAlarmCodeName();
	//根据参数获取告警信息
	List<AlarmInfoCustom> getAlarmInformation(AlarmInformationQueryParam  param);
		
	

}

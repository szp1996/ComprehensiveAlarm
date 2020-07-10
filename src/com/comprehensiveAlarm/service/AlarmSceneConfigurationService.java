package com.comprehensiveAlarm.service;

import com.comprehensiveAlarm.jo.AlarmSceneQueryEntity;
import com.comprehensiveAlarm.jo.AlarmSceneQueryParam;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AlarmSceneConfigurationService {

    // 告警场景配置得到下拉框信息
    List<String> getQueryConditionsForAlarmSceneSceneName();

    List<String> getQueryConditionsForAlarmSceneAlarmCodeId();

    // 根据条件得到告警场景信息
    List<AlarmSceneQueryEntity> getAlarmSceneByConditions(AlarmSceneQueryParam alarmSceneQueryParam);
}

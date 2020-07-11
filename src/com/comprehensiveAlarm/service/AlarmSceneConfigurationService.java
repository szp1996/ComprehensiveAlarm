package com.comprehensiveAlarm.service;

import com.comprehensiveAlarm.jo.AlarmCodeCustom;
import com.comprehensiveAlarm.jo.AlarmSceneQueryEntity;
import com.comprehensiveAlarm.jo.AlarmSceneQueryParam;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.AlarmScene;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


public interface AlarmSceneConfigurationService {

    // 告警场景配置得到下拉框信息
    List<String> getQueryConditionsForAlarmSceneSceneName();
    List<String> getQueryConditionsForAlarmSceneAlarmCodeId();

    // 根据条件得到告警场景信息
    List<AlarmSceneQueryEntity> getAlarmSceneByConditions(AlarmSceneQueryParam alarmSceneQueryParam);

    // 新增告警对象
    Map<String, Object> addAlarmScene(AlarmScene alarmScene);

    // 新增告警类型/获取告警对象
    List<AlarmScene> getAlarmScene();

    // 新增告警类型
    Map<String, Object> addAlarmCode(AlarmCodeCustom alarmCodeCustom);

    // 更新阈值
    boolean addThreshold(AlarmCode alarmCode);
}

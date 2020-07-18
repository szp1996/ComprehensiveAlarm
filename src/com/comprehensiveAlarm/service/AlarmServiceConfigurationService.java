package com.comprehensiveAlarm.service;

import com.comprehensiveAlarm.jo.AlarmBussinessQueryParam;
import com.comprehensiveAlarm.jo.AlarmBussinessQueryResult;
import com.comprehensiveAlarm.po.AlarmBussiness;

import java.util.List;

public interface AlarmServiceConfigurationService {

    // 获取下拉框信息
    List<String> getQueryConditionsAlarmBussinessName();
    // 根据条件获得信息
    List<AlarmBussinessQueryResult> getAlarmBussiness(AlarmBussinessQueryParam alarmBussinessQueryParam);

    // 新增告警业务
    int judgingAlarmBussinessName(String alarm_bussiness_name);
    int addAlarmBussiness(AlarmBussiness alarmBussiness);

    // 更新
    int judgingAlarmBussinessNameWhenUpdate(AlarmBussiness alarm_bussiness_name);
    int updateAlarmBussiness(AlarmBussiness alarmBussiness);

    // 删除
    int deleteAlarmBussiness(String alarm_bussiness_id);
}

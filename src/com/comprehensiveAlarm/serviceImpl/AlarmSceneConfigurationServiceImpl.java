package com.comprehensiveAlarm.serviceImpl;

import com.comprehensiveAlarm.dao.AlarmSceneMapper;
import com.comprehensiveAlarm.jo.AlarmSceneQueryEntity;
import com.comprehensiveAlarm.jo.AlarmSceneQueryParam;
import com.comprehensiveAlarm.service.AlarmSceneConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmSceneConfigurationServiceImpl implements AlarmSceneConfigurationService {

    @Autowired
    private AlarmSceneMapper alarmSceneMapper;

    @Override
    public List<String> getQueryConditionsForAlarmSceneSceneName() {
        return alarmSceneMapper.getQueryConditionsForAlarmSceneSceneName();
    }

    @Override
    public List<String> getQueryConditionsForAlarmSceneAlarmCodeId() {
        return alarmSceneMapper.getQueryConditionsForAlarmSceneAlarmCodeId();
    }

    @Override
    public List<AlarmSceneQueryEntity> getAlarmSceneByConditions(AlarmSceneQueryParam alarmSceneQueryParam) {
        alarmSceneQueryParam.offset();
        return alarmSceneMapper.getAlarmSceneByConditions(alarmSceneQueryParam);
    }
}

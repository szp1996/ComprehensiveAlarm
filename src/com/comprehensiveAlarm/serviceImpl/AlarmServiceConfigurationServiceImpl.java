package com.comprehensiveAlarm.serviceImpl;

import com.comprehensiveAlarm.dao.AlarmBussinessMapper;
import com.comprehensiveAlarm.jo.AlarmBussinessQueryParam;
import com.comprehensiveAlarm.jo.AlarmBussinessQueryResult;
import com.comprehensiveAlarm.po.AlarmBussiness;
import com.comprehensiveAlarm.po.AlarmBussinessExample;
import com.comprehensiveAlarm.service.AlarmServiceConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmServiceConfigurationServiceImpl implements AlarmServiceConfigurationService {

    @Autowired
    private AlarmBussinessMapper alarmBussinessMapper;

    @Override
    public List<String> getQueryConditionsAlarmBussinessName() {
        List<String> list = alarmBussinessMapper.getQueryConditionsAlarmBussinessName();
        return list;
    }

    @Override
    public List<AlarmBussinessQueryResult> getAlarmBussiness(AlarmBussinessQueryParam alarmBussinessQueryParam) {
        alarmBussinessQueryParam.offset();
        List<AlarmBussinessQueryResult> list = alarmBussinessMapper.getAlarmBussiness(alarmBussinessQueryParam);
        return list;
    }

    @Override
    public int judgingAlarmBussinessName(String alarm_bussiness_name) {
        AlarmBussiness alarmBussiness = alarmBussinessMapper.selectByName(alarm_bussiness_name);
        if (alarmBussiness == null)
            return 0;
        else return 1;
    }

    @Override
    public int addAlarmBussiness(AlarmBussiness alarmBussiness) {
        try {
            alarmBussinessMapper.insert(alarmBussiness);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int judgingAlarmBussinessNameWhenUpdate(AlarmBussiness alarmBussiness) {
        AlarmBussiness alarmBussinessExample = alarmBussinessMapper.selectByName(alarmBussiness);
        if (alarmBussinessExample == null)
            return 0;
        else return 1;
    }

    @Override
    public int updateAlarmBussiness(AlarmBussiness alarmBussiness) {
        try {
            alarmBussinessMapper.updateByPrimaryKey(alarmBussiness);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteAlarmBussiness(String alarm_bussiness_id) {
        try {
            alarmBussinessMapper.deleteByPrimaryKey(alarm_bussiness_id);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}

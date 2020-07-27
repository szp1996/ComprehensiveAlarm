package com.comprehensiveAlarm.serviceImpl;

import com.comprehensiveAlarm.dao.AlarmCodeMapper;
import com.comprehensiveAlarm.dao.AlarmSceneMapper;
import com.comprehensiveAlarm.jo.AlarmCodeCustom;
import com.comprehensiveAlarm.jo.AlarmSceneQueryEntity;
import com.comprehensiveAlarm.jo.AlarmSceneQueryParam;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.AlarmScene;
import com.comprehensiveAlarm.service.AlarmSceneConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AlarmSceneConfigurationServiceImpl implements AlarmSceneConfigurationService {

    @Autowired
    private AlarmSceneMapper alarmSceneMapper;
    @Autowired
    private AlarmCodeMapper alarmCodeMapper;

    @Override
    public List<String> getQueryConditionsSceneName() {
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


    @Override
    public Map<String, Object> addAlarmScene(AlarmScene alarmScene) {
        Map<String, Object> data = new HashMap<>();
        int flag1 = 0, flag2 = 0;
        AlarmScene scene_example = alarmSceneMapper.selectByPrimaryKey(alarmScene.getScene_id());
        if (scene_example != null) {
            flag1 = 1;
            data.put("scene_id_type", 1);
        } else {
            data.put("scene_id_type", 0);
        }
        AlarmScene scene_example2 = alarmSceneMapper.selectBySceneName(alarmScene.getScene_id());
        if (scene_example2 != null) {
            flag2 = 1;
            data.put("scene_name_type", 1);
        } else {
            data.put("scene_name_type", 0);
        }
        if (flag1 == 0 && flag2 == 0)
            try {
                alarmSceneMapper.insert(alarmScene);
            } catch (Exception e) {
                e.printStackTrace();
            }

        return data;
    }

    @Override
    public List<AlarmScene> getAlarmScene() {
        return alarmSceneMapper.getAlarmScene();
    }

    @Override
    public int judgingAlarmCodeId(String alarm_code_id) {
        AlarmCode alarmCode = alarmCodeMapper.selectByPrimaryKey(alarm_code_id);
        if (alarmCode == null) {
            return 0;
        } else
            return 1;
    }

    @Override
    public int judgingAlarmCodeName(String alarm_code_name) {
        AlarmCode alarmCode = alarmCodeMapper.selectByAlarmCodeName(alarm_code_name);
        if (alarmCode == null) {
            return 0;
        } else
            return 1;
    }

    @Override
    public int addAlarmCode(AlarmCodeCustom alarmCodeCustom) {
        try {
            alarmCodeMapper.insertNew(alarmCodeCustom);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public boolean addThreshold(AlarmCode alarmCode) {
        try {
            alarmCodeMapper.updateThreshold(alarmCode);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public int deleteAlarmCode(String alarmCodeId) {
        try {
            alarmCodeMapper.deleteByPrimaryKey(alarmCodeId);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

}

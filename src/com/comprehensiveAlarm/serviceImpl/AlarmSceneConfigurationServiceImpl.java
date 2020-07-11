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
    private AlarmCodeMapper alarmCodeMapper;

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
    public Map<String, Object> addAlarmCode(AlarmCodeCustom alarmCodeCustom) {
        Map<String, Object> data = new HashMap<>();
        int flag1 = 0, flag2 = 0;
        AlarmCode alarmCode1 = alarmCodeMapper.selectByPrimaryKey(alarmCodeCustom.getAlarm_code_id());
        if (alarmCode1 != null){
            flag1 = 1;
            data.put("scene_code_id_type", 1);
        } else
            data.put("scene_code_id_type", 0);
        AlarmCode alarmCode2 = alarmCodeMapper.selectByPrimaryKey(alarmCodeCustom.getAlarm_code_name());
        if (alarmCode2 != null){
            flag2 = 1;
            data.put("scene_code_name_type", 1);
        } else
            data.put("scene_code_name_type", 0);
        if (flag1 == 0 && flag2 ==0)
            try{
                alarmCodeMapper.insert(alarmCodeCustom);
            }catch (Exception e){
                e.printStackTrace();
            }
        return data;
    }

    @Override
    public boolean addThreshold(AlarmCode alarmCode) {
        try{
            alarmCodeMapper.updateThreshold(alarmCode);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}

package com.comprehensiveAlarm.controller;

import com.comprehensiveAlarm.jo.AlarmSceneQueryEntity;
import com.comprehensiveAlarm.jo.AlarmSceneQueryParam;
import com.comprehensiveAlarm.service.AlarmSceneConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AlarmSceneConfigurationController {

    @Autowired
    private AlarmSceneConfigurationService alarmSceneConfigurationService;

    // 告警场景配置得到下拉框信息
    @RequestMapping("/getQueryConditionsForAlarmScene")
    @ResponseBody
    public Map<String, Object> getQueryConditionsForAlarmScene() {
        Map<String, Object> result = new HashMap<>();
        List<String> sceneNameList = alarmSceneConfigurationService.getQueryConditionsForAlarmSceneSceneName();
        List<String> alarmCodeIdList = alarmSceneConfigurationService.getQueryConditionsForAlarmSceneAlarmCodeId();
        Map<String, List<String>> data = new HashMap<>();
        data.put("scene_name", sceneNameList);
        data.put("alarm_code_id", alarmCodeIdList);
        result.put("result", 1);
        result.put("data", data);
        return result;
    }

    // 根据条件得到告警场景信息
    @RequestMapping("/getAlarmScene")
    @ResponseBody
    public Map<String, Object> getAlarmScene(@RequestBody AlarmSceneQueryParam alarmSceneQueryParam) {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        List<AlarmSceneQueryEntity> alarmSceneList = alarmSceneConfigurationService.getAlarmSceneByConditions(alarmSceneQueryParam);
        data.put("list", alarmSceneList);
        result.put("result", 1);
        result.put("data", data);
        return result;
    }
}

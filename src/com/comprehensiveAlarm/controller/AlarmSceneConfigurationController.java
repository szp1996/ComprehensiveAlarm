package com.comprehensiveAlarm.controller;

import com.comprehensiveAlarm.jo.AlarmCodeCustom;
import com.comprehensiveAlarm.jo.AlarmSceneQueryEntity;
import com.comprehensiveAlarm.jo.AlarmSceneQueryParam;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.AlarmScene;
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
        List<String> sceneNameList = alarmSceneConfigurationService.getQueryConditionsSceneName();
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

    // 新增告警对象
    @RequestMapping("/addAlarmScene")
    @ResponseBody
    public Map<String, Object> addAlarmScene(@RequestBody AlarmScene alarmScene) {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = alarmSceneConfigurationService.addAlarmScene(alarmScene);
        result.put("result", 1);
        result.put("data", data);
        return result;
    }

    // 新增告警类型/获取告警对象
    @RequestMapping("/getAlarmScene")
    @ResponseBody
    public Map<String, Object> addAlarmScene() {
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        List<AlarmScene> alarmSceneList = alarmSceneConfigurationService.getAlarmScene();
        data.put("list", alarmSceneList);
        result.put("result", 1);
        result.put("data", data);
        return result;
    }

    // 新增告警类型
    @RequestMapping("/addAlarmCode")
    @ResponseBody
    public Map<String, Object> addAlarmCode(@RequestBody AlarmCodeCustom alarmCodeCustom){
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        int flag1 = alarmSceneConfigurationService.judgingAlarmCodeId(alarmCodeCustom.getAlarm_code_id());
        data.put("scene_code_id_type", flag1);
        int flag2 = alarmSceneConfigurationService.judgingAlarmCodeName(alarmCodeCustom.getAlarm_code_name());
        data.put("scene_code_name_type", flag2);
        int success = 0;
        if (flag1 == 0 && flag2 == 0){
           success =  alarmSceneConfigurationService.addAlarmCode(alarmCodeCustom);
        }
        result.put("data", data);
        result.put("result", success);
        return result;
    }

    // 更新阈值
    @RequestMapping("/addThreshold")
    @ResponseBody
    public Map<String, Object> addThreshold(@RequestBody AlarmCode alarmCode){
        Map<String, Object> result = new HashMap<>();
        boolean success = alarmSceneConfigurationService.addThreshold(alarmCode);
        if (success){
            result.put("result", 1);
        }else
            result.put("result", 0);
        return result;
    }

    // 删除
    @RequestMapping("/deleteAlarmCode")
    @ResponseBody
    public Map<String, Integer> deleteAlarmCode(String alarmCodeId){
        Map<String, Integer> result = new HashMap<>();
        int flag = alarmSceneConfigurationService.deleteAlarmCode(alarmCodeId);
        result.put("result", flag);
        return result;
    }
}

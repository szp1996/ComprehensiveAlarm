package com.comprehensiveAlarm.controller;

import com.comprehensiveAlarm.jo.AlarmBussinessQueryParam;
import com.comprehensiveAlarm.jo.AlarmBussinessQueryResult;
import com.comprehensiveAlarm.po.AlarmBussiness;
import com.comprehensiveAlarm.service.AlarmSceneConfigurationService;
import com.comprehensiveAlarm.service.AlarmServiceConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AlarmServiceConfigurationController {

    @Autowired
    private AlarmServiceConfigurationService alarmServiceConfigurationService;
    private AlarmSceneConfigurationService alarmSceneConfigurationService;

    @RequestMapping("/getQueryConditionsForAlarmBussiness")
    @ResponseBody
    public Map<String, Object> getQueryConditionsForAlarmBussiness() {
        Map<String, Object> result = new HashMap<>();
        List<String> sceneNameList = alarmSceneConfigurationService.getQueryConditionsSceneName();
        List<String> alarmBussinessNameList = alarmServiceConfigurationService.getQueryConditionsAlarmBussinessName();
        Map<String,Object> data = new HashMap<>();
        data.put("alarm_bussiness_name", alarmBussinessNameList);
        data.put("scene_name", sceneNameList);
        result.put("result", 1);
        result.put("data", data);
        return result;
    }
    @RequestMapping("/getAlarmBussiness")
    @ResponseBody
    public Map<String, Object> getAlarmBussiness(@RequestBody AlarmBussinessQueryParam alarmBussinessQueryParam){
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        List<AlarmBussinessQueryResult> list = alarmServiceConfigurationService.getAlarmBussiness(alarmBussinessQueryParam);
        data.put("list", list);
        result.put("data", data);
        result.put("result", 1);
        return result;
    }
    // 新增告警业务/获取告警对象
    // 同 新增告警类型

    // 新增告警业务
    @RequestMapping("/addAlarmBussiness")
    @ResponseBody
    public Map<String, Object> addAlarmBussiness(@RequestBody AlarmBussiness alarmBussiness){
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        int success = 0;
        int flag = alarmServiceConfigurationService.judgingAlarmBussinessName(alarmBussiness.getAlarm_bussiness_name());
        data.put("alarm_bussiness_name", flag);
        if (flag == 0)
            success = alarmServiceConfigurationService.addAlarmBussiness(alarmBussiness);
        result.put("result", success);
        return result;
    }
    // 更新
    @RequestMapping("/updateAlarmBussiness")
    @ResponseBody
    public Map<String, Object> updateAlarmBussiness(@RequestBody AlarmBussiness alarmBussiness){
        Map<String, Object> result = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        int success = 0;
        int flag = alarmServiceConfigurationService.judgingAlarmBussinessNameWhenUpdate(alarmBussiness);
        data.put("alarm_bussiness_name", flag);
        if (flag == 0)
            success = alarmServiceConfigurationService.updateAlarmBussiness(alarmBussiness);
        result.put("result", success);
        return result;
    }
    // 删除
    @RequestMapping("/deleteAlarmBussiness")
    @ResponseBody
    public Map<String, Object> deleteAlarmBussiness(String alarm_bussiness_id){
        Map<String, Object> result = new HashMap<>();
        int success = alarmServiceConfigurationService.deleteAlarmBussiness(alarm_bussiness_id);
        if (success == 1)
            result.put("result", 1);
        else result.put("result", 0);

        return result;
    }
}

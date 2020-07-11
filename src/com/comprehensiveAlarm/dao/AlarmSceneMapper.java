package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.jo.AlarmSceneQueryEntity;
import com.comprehensiveAlarm.jo.AlarmSceneQueryParam;
import com.comprehensiveAlarm.po.AlarmScene;
import com.comprehensiveAlarm.po.AlarmSceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmSceneMapper {

    // 告警场景配置得到下拉框信息
    List<String> getQueryConditionsForAlarmSceneSceneName();
    List<String> getQueryConditionsForAlarmSceneAlarmCodeId();

    // 根据条件得到告警场景信息
    List<AlarmSceneQueryEntity> getAlarmSceneByConditions(AlarmSceneQueryParam alarmSceneQueryParam);


    //根据id获取告警对象（场景）信息
    AlarmScene getAlarmSceneById(String scene_id);
    

    // 新增告警对象
    AlarmScene selectBySceneName(String scene_id);

    // 新增告警类型/获取告警对象
    List<AlarmScene> getAlarmScene();

    int countByExample(AlarmSceneExample example);

    int deleteByExample(AlarmSceneExample example);

    int deleteByPrimaryKey(String scene_id);

    int insert(AlarmScene record);

    int insertSelective(AlarmScene record);

    List<AlarmScene> selectByExample(AlarmSceneExample example);

    AlarmScene selectByPrimaryKey(String scene_id);

    int updateByExampleSelective(@Param("record") AlarmScene record, @Param("example") AlarmSceneExample example);

    int updateByExample(@Param("record") AlarmScene record, @Param("example") AlarmSceneExample example);

    int updateByPrimaryKeySelective(AlarmScene record);

    int updateByPrimaryKey(AlarmScene record);
}

package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.jo.AlarmBussinessQueryParam;
import com.comprehensiveAlarm.jo.AlarmBussinessQueryResult;
import com.comprehensiveAlarm.po.AlarmBussiness;
import com.comprehensiveAlarm.po.AlarmBussinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmBussinessMapper {
    // 下拉菜单信息
    List<String> getQueryConditionsAlarmBussinessName();
    // 根据条件获取信息
    List<AlarmBussinessQueryResult> getAlarmBussiness(AlarmBussinessQueryParam alarmBussinessQueryParam);
    // 新增告警业务
    AlarmBussiness selectByName(String alarm_bussiness_name);
    AlarmBussiness selectByName(AlarmBussiness alarmBussiness);

    int countByExample(AlarmBussinessExample example);

    int deleteByExample(AlarmBussinessExample example);

    int deleteByPrimaryKey(String alarm_bussiness_id);

    int insert(AlarmBussiness record);

    int insertSelective(AlarmBussiness record);

    List<AlarmBussiness> selectByExample(AlarmBussinessExample example);

    AlarmBussiness selectByPrimaryKey(String alarm_bussiness_id);

    int updateByExampleSelective(@Param("record") AlarmBussiness record, @Param("example") AlarmBussinessExample example);

    int updateByExample(@Param("record") AlarmBussiness record, @Param("example") AlarmBussinessExample example);

    int updateByPrimaryKeySelective(AlarmBussiness record);

    int updateByPrimaryKey(AlarmBussiness record);
}
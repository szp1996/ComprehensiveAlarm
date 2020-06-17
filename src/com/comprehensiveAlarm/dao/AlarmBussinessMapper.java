package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.AlarmBussiness;
import com.comprehensiveAlarm.po.AlarmBussinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmBussinessMapper {
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
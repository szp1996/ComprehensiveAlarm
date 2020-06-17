package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.AlarmInfo;
import com.comprehensiveAlarm.po.AlarmInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmInfoMapper {
    int countByExample(AlarmInfoExample example);

    int deleteByExample(AlarmInfoExample example);

    int deleteByPrimaryKey(String alarm_id);

    int insert(AlarmInfo record);

    int insertSelective(AlarmInfo record);

    List<AlarmInfo> selectByExample(AlarmInfoExample example);

    AlarmInfo selectByPrimaryKey(String alarm_id);

    int updateByExampleSelective(@Param("record") AlarmInfo record, @Param("example") AlarmInfoExample example);

    int updateByExample(@Param("record") AlarmInfo record, @Param("example") AlarmInfoExample example);

    int updateByPrimaryKeySelective(AlarmInfo record);

    int updateByPrimaryKey(AlarmInfo record);
}
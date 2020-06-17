package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.AlarmCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmCodeMapper {
    int countByExample(AlarmCodeExample example);

    int deleteByExample(AlarmCodeExample example);

    int deleteByPrimaryKey(String alarm_code_id);

    int insert(AlarmCode record);

    int insertSelective(AlarmCode record);

    List<AlarmCode> selectByExample(AlarmCodeExample example);

    AlarmCode selectByPrimaryKey(String alarm_code_id);

    int updateByExampleSelective(@Param("record") AlarmCode record, @Param("example") AlarmCodeExample example);

    int updateByExample(@Param("record") AlarmCode record, @Param("example") AlarmCodeExample example);

    int updateByPrimaryKeySelective(AlarmCode record);

    int updateByPrimaryKey(AlarmCode record);
}
package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.jo.AlarmCodeCustom;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.AlarmCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmCodeMapper {

	
	// 获取告警类型
    List<AlarmCodeCustom> getAlarmCode() ;
	
	// 根据告警类型id获取告警类型信息
    AlarmCode getAlarmCodeById(String alarm_code_id);
    // 根据值选择
    AlarmCode selectByAlarmCodeName(String alarm_code_name);
    // 新增告警类型
    void insertNew(AlarmCodeCustom record);
    // 更新阈值
    void updateThreshold(AlarmCode alarmCode);


    int countByExample(AlarmCodeExample example);

    int deleteByExample(AlarmCodeExample example);

    int deleteByPrimaryKey(String alarm_code_id);

    int insert(AlarmCode record);

    int insertSelective(AlarmCode record);

    List<AlarmCode> selectByExampleWithBLOBs(AlarmCodeExample example);

    List<AlarmCode> selectByExample(AlarmCodeExample example);

    AlarmCode selectByPrimaryKey(String alarm_code_id);

    int updateByExampleSelective(@Param("record") AlarmCode record, @Param("example") AlarmCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") AlarmCode record, @Param("example") AlarmCodeExample example);

    int updateByExample(@Param("record") AlarmCode record, @Param("example") AlarmCodeExample example);

    int updateByPrimaryKeySelective(AlarmCode record);

    int updateByPrimaryKeyWithBLOBs(AlarmCode record);

    int updateByPrimaryKey(AlarmCode record);
}

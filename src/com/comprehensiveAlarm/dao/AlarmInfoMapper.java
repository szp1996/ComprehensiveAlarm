package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.jo.AlarmInfoCustom;
import com.comprehensiveAlarm.jo.AlarmInformationQueryParam;
import com.comprehensiveAlarm.po.AlarmInfo;
import com.comprehensiveAlarm.po.AlarmInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmInfoMapper {
	
	//告警信息展示得到下拉框的信息
	List<String> getQueryConditionsForAlarmInformationOrigin();
	List<String>  getQueryConditionsForAlarmInformationSceneName();
	List<String> getQueryConditionsForAlarmInformationAlarmCodeName();
	
	//根据条件查询告警信息
	List<AlarmInfoCustom> getAlarmInformation(AlarmInformationQueryParam param);
		
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
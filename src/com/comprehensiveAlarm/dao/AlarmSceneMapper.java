package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.AlarmScene;
import com.comprehensiveAlarm.po.AlarmSceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlarmSceneMapper {
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
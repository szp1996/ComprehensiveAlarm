package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.ETaskResult;
import com.comprehensiveAlarm.po.ETaskResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ETaskResultMapper {
    int countByExample(ETaskResultExample example);

    int deleteByExample(ETaskResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ETaskResult record);

    int insertSelective(ETaskResult record);

    List<ETaskResult> selectByExample(ETaskResultExample example);

    ETaskResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ETaskResult record, @Param("example") ETaskResultExample example);

    int updateByExample(@Param("record") ETaskResult record, @Param("example") ETaskResultExample example);

    int updateByPrimaryKeySelective(ETaskResult record);

    int updateByPrimaryKey(ETaskResult record);
}
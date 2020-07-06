package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.DispatchRecord;
import com.comprehensiveAlarm.po.DispatchRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DispatchRecordMapper {
    int countByExample(DispatchRecordExample example);

    int deleteByExample(DispatchRecordExample example);

    int deleteByPrimaryKey(String workorder_id);

    int insert(DispatchRecord record);

    int insertSelective(DispatchRecord record);

    List<DispatchRecord> selectByExample(DispatchRecordExample example);

    DispatchRecord selectByPrimaryKey(String workorder_id);

    int updateByExampleSelective(@Param("record") DispatchRecord record, @Param("example") DispatchRecordExample example);

    int updateByExample(@Param("record") DispatchRecord record, @Param("example") DispatchRecordExample example);

    int updateByPrimaryKeySelective(DispatchRecord record);

    int updateByPrimaryKey(DispatchRecord record);
}
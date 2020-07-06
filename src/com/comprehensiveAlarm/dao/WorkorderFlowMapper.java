package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.WorkorderFlow;
import com.comprehensiveAlarm.po.WorkorderFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkorderFlowMapper {
    int countByExample(WorkorderFlowExample example);

    int deleteByExample(WorkorderFlowExample example);

    int deleteByPrimaryKey(String workorder_id);

    int insert(WorkorderFlow record);

    int insertSelective(WorkorderFlow record);

    List<WorkorderFlow> selectByExample(WorkorderFlowExample example);

    WorkorderFlow selectByPrimaryKey(String workorder_id);

    int updateByExampleSelective(@Param("record") WorkorderFlow record, @Param("example") WorkorderFlowExample example);

    int updateByExample(@Param("record") WorkorderFlow record, @Param("example") WorkorderFlowExample example);

    int updateByPrimaryKeySelective(WorkorderFlow record);

    int updateByPrimaryKey(WorkorderFlow record);
}
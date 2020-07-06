package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.WorkorderType;
import com.comprehensiveAlarm.po.WorkorderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkorderTypeMapper {
    int countByExample(WorkorderTypeExample example);

    int deleteByExample(WorkorderTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkorderType record);

    int insertSelective(WorkorderType record);

    List<WorkorderType> selectByExample(WorkorderTypeExample example);

    WorkorderType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkorderType record, @Param("example") WorkorderTypeExample example);

    int updateByExample(@Param("record") WorkorderType record, @Param("example") WorkorderTypeExample example);

    int updateByPrimaryKeySelective(WorkorderType record);

    int updateByPrimaryKey(WorkorderType record);
}
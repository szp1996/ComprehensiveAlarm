package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.WorkorderType;
import com.comprehensiveAlarm.po.WorkorderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkorderTypeMapper {
	//得到整改类型
	 List<WorkorderType> getWorkorderType();
	 
	//跟新工单类型
	   int updateByPrimaryKeySelective(WorkorderType record);

    int countByExample(WorkorderTypeExample example);

    int deleteByExample(WorkorderTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkorderType record);

    int insertSelective(WorkorderType record);

    List<WorkorderType> selectByExample(WorkorderTypeExample example);

    WorkorderType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkorderType record, @Param("example") WorkorderTypeExample example);

    int updateByExample(@Param("record") WorkorderType record, @Param("example") WorkorderTypeExample example);

  
    
    int updateByPrimaryKey(WorkorderType record);
}
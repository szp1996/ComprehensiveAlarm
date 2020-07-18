package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.jo.WorkorderInformationQueryParam;
import com.comprehensiveAlarm.po.Workorder;
import com.comprehensiveAlarm.po.WorkorderExample;
import com.comprehensiveAlarm.po.WorkorderType;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkorderMapper {

	//根据条件查询工单
	List<Workorder> getWorkorder(WorkorderInformationQueryParam param);
	 
    int countByExample(WorkorderExample example);

    int deleteByExample(WorkorderExample example);

    int deleteByPrimaryKey(String workorder_id);

    int insert(Workorder record);

    int insertSelective(Workorder record);

    List<Workorder> selectByExample(WorkorderExample example);

    Workorder selectByPrimaryKey(String workorder_id);

    int updateByExampleSelective(@Param("record") Workorder record, @Param("example") WorkorderExample example);

    int updateByExample(@Param("record") Workorder record, @Param("example") WorkorderExample example);

    int updateByPrimaryKeySelective(Workorder record);

    int updateByPrimaryKey(Workorder record);
}
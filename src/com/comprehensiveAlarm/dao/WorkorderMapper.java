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
	 
	//派发更新Workorder的维护人、维护单位、状态
	void dispatchUpdateWorkorder(Workorder workorder);
	
	//完成工单
	void overOrders(String Workorder_id);
	
	//接单更新状态
	void getOrdersUpdateStatus(String Workorder_id);
	
	//反馈更新状态
	void feedbackUpdateStatus(String Workorder_id);
	
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
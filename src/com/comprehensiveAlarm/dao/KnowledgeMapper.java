package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.Knowledge;
import com.comprehensiveAlarm.po.KnowledgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgeMapper {
	  
	//知识展示的下拉框信息
	 List<String> getQueryConditionsForKnowledgeId();
    List<String> getQueryConditionsForKnowledgeSceneIdList();
    List<String> getQueryConditionsForKnowledgealarmAlarmCodeId();

    int countByExample(KnowledgeExample example);

    int deleteByExample(KnowledgeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Knowledge record);

    int insertSelective(Knowledge record);

    List<Knowledge> selectByExample(KnowledgeExample example);

    Knowledge selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Knowledge record, @Param("example") KnowledgeExample example);

    int updateByExample(@Param("record") Knowledge record, @Param("example") KnowledgeExample example);

    int updateByPrimaryKeySelective(Knowledge record);

    int updateByPrimaryKey(Knowledge record);
}
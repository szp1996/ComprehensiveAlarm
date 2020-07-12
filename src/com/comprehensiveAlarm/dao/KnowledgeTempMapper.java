package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.jo.KnowledgeQueryParam;
import com.comprehensiveAlarm.jo.KnowledgeQueryResult;
import com.comprehensiveAlarm.po.KnowledgeTemp;
import com.comprehensiveAlarm.po.KnowledgeTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgeTempMapper {
 
	 //根据条件获取知识
    List<KnowledgeQueryResult> getKnowledgeTemp(KnowledgeQueryParam param) ;

    int countByExample(KnowledgeTempExample example);

    //根据id查询
    KnowledgeTemp selectByPrimaryKey(String id);
   
    //根据id将状态置为不通过
    void updateStatusToNoPassById(String id);
    
    int deleteByExample(KnowledgeTempExample example);
    //根据id删除
    int deleteByPrimaryKey(String id);
    //知识录入
    int insert(KnowledgeTemp record);

    int insertSelective(KnowledgeTemp record);

    List<KnowledgeTemp> selectByExample(KnowledgeTempExample example);

   

    int updateByExampleSelective(@Param("record") KnowledgeTemp record, @Param("example") KnowledgeTempExample example);

    int updateByExample(@Param("record") KnowledgeTemp record, @Param("example") KnowledgeTempExample example);

    int updateByPrimaryKeySelective(KnowledgeTemp record);

    int updateByPrimaryKey(KnowledgeTemp record);
}
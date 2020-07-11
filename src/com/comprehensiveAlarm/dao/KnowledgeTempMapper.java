package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.KnowledgeTemp;
import com.comprehensiveAlarm.po.KnowledgeTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KnowledgeTempMapper {
    int countByExample(KnowledgeTempExample example);

    int deleteByExample(KnowledgeTempExample example);

    int deleteByPrimaryKey(String id);
    //知识录入
    int insert(KnowledgeTemp record);

    int insertSelective(KnowledgeTemp record);

    List<KnowledgeTemp> selectByExample(KnowledgeTempExample example);

    KnowledgeTemp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") KnowledgeTemp record, @Param("example") KnowledgeTempExample example);

    int updateByExample(@Param("record") KnowledgeTemp record, @Param("example") KnowledgeTempExample example);

    int updateByPrimaryKeySelective(KnowledgeTemp record);

    int updateByPrimaryKey(KnowledgeTemp record);
}
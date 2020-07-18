package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.WorkorderTemplate;
import com.comprehensiveAlarm.po.WorkorderTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkorderTemplateMapper {
	
	//得到派发模板
	List<WorkorderTemplate> getWorkorderTemplate();
	
    int countByExample(WorkorderTemplateExample example);

    int deleteByExample(WorkorderTemplateExample example);

    int deleteByPrimaryKey(String template_id);

    int insert(WorkorderTemplate record);

    int insertSelective(WorkorderTemplate record);

    List<WorkorderTemplate> selectByExample(WorkorderTemplateExample example);

    WorkorderTemplate selectByPrimaryKey(String template_id);

    int updateByExampleSelective(@Param("record") WorkorderTemplate record, @Param("example") WorkorderTemplateExample example);

    int updateByExample(@Param("record") WorkorderTemplate record, @Param("example") WorkorderTemplateExample example);

    int updateByPrimaryKeySelective(WorkorderTemplate record);

    int updateByPrimaryKey(WorkorderTemplate record);
}
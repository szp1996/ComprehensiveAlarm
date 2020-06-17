package com.comprehensiveAlarm.dao;

import com.comprehensiveAlarm.po.DOutdeviceinfo;
import com.comprehensiveAlarm.po.DOutdeviceinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DOutdeviceinfoMapper {
    int countByExample(DOutdeviceinfoExample example);

    int deleteByExample(DOutdeviceinfoExample example);

    int insert(DOutdeviceinfo record);

    int insertSelective(DOutdeviceinfo record);

    List<DOutdeviceinfo> selectByExampleWithBLOBs(DOutdeviceinfoExample example);

    List<DOutdeviceinfo> selectByExample(DOutdeviceinfoExample example);

    int updateByExampleSelective(@Param("record") DOutdeviceinfo record, @Param("example") DOutdeviceinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") DOutdeviceinfo record, @Param("example") DOutdeviceinfoExample example);

    int updateByExample(@Param("record") DOutdeviceinfo record, @Param("example") DOutdeviceinfoExample example);
}
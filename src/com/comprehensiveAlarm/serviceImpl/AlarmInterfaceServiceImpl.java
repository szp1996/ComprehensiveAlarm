package com.comprehensiveAlarm.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.AlarmCodeMapper;
import com.comprehensiveAlarm.dao.DOutdeviceinfoMapper;
import com.comprehensiveAlarm.dao.ETaskResultMapper;
import com.comprehensiveAlarm.po.AlarmCode;
import com.comprehensiveAlarm.po.DOutdeviceinfo;
import com.comprehensiveAlarm.po.ETaskResult;
import com.comprehensiveAlarm.service.AlarmInterfaceService;


@Service
public class AlarmInterfaceServiceImpl implements AlarmInterfaceService {

	
	@Resource
	private AlarmCodeMapper alarmCodeMapper;

	@Resource
	private ETaskResultMapper eTaskResultMapper;

	
	 
}

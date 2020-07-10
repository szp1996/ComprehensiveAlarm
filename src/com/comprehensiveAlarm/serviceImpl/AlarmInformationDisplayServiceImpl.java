package com.comprehensiveAlarm.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comprehensiveAlarm.dao.AlarmInfoMapper;
import com.comprehensiveAlarm.jo.AlarmInfoCustom;
import com.comprehensiveAlarm.jo.AlarmInformationQueryParam;
import com.comprehensiveAlarm.po.AlarmInfo;
import com.comprehensiveAlarm.service.AlarmInformationDisplayService;

@Service
public class AlarmInformationDisplayServiceImpl implements AlarmInformationDisplayService {

	@Autowired
	private AlarmInfoMapper alarmInfoMapper;

	@Override
	public List<String> getQueryConditionsForAlarmInformationOrigin() {
		// TODO Auto-generated method stub
		return alarmInfoMapper.getQueryConditionsForAlarmInformationOrigin();
	}

	@Override
	public List<String> getQueryConditionsForAlarmInformationSceneName() {
		// TODO Auto-generated method stub
		return alarmInfoMapper.getQueryConditionsForAlarmInformationSceneName();
	}

	@Override
	public List<String> getQueryConditionsForAlarmInformationAlarmCodeName() {
		// TODO Auto-generated method stub
		return alarmInfoMapper.getQueryConditionsForAlarmInformationAlarmCodeName();
	}

	//根据参数获取告警信息
	@Override
	public List<AlarmInfoCustom> getAlarmInformation(AlarmInformationQueryParam param) {
		// TODO Auto-generated method stub
		param.offset();
		return alarmInfoMapper.getAlarmInformation(param);
	}

}

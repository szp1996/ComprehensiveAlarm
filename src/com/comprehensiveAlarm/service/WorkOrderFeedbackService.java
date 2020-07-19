package com.comprehensiveAlarm.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.comprehensiveAlarm.jo.FeedBackParam;

public interface WorkOrderFeedbackService {

	//接单
	void getOrders(String Workorder_id);
	//反馈
	void feedback(FeedBackParam param);
}

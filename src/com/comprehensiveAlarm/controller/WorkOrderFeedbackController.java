package com.comprehensiveAlarm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comprehensiveAlarm.po.Workorder;
import com.comprehensiveAlarm.service.WorkOrderFeedbackService;

@Controller
public class WorkOrderFeedbackController {
	
	@Autowired
	private WorkOrderFeedbackService  workOrderFeedbackService;

	//接单
	@RequestMapping("/getOrders")
	@ResponseBody
	public Object  getOrders(@RequestBody Workorder param) {
		Map<String,Object> result=new HashMap<String,Object>();
		//workOrderFeedbackService.getOrders(param.getWorkorder_id());
		result.put("result", 1);
		return result;
	}
}

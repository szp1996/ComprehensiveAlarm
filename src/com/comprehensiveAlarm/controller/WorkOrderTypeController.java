package com.comprehensiveAlarm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.comprehensiveAlarm.jo.JudgeKnowledgeParam;
import com.comprehensiveAlarm.jo.WorkorderTypeResult;
import com.comprehensiveAlarm.po.AlarmScene;
import com.comprehensiveAlarm.po.WorkorderType;
import com.comprehensiveAlarm.service.WorkOrderTypeService;

@Controller
public class WorkOrderTypeController {
	
	@Autowired
	private WorkOrderTypeService  workOrderTypeService;

	//得到工单类型
	@RequestMapping("/getWorkorderType")
	@ResponseBody
	public Object  getWorkorderType() {
		
		Map<String,Object> result=new HashMap<String,Object>();
		List<WorkorderType> list=workOrderTypeService.getWorkorderType();
		List<WorkorderTypeResult> res_list=new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			WorkorderTypeResult workorderTypeResult=new WorkorderTypeResult();
			workorderTypeResult.setId(list.get(i).getId());
			workorderTypeResult.setName(list.get(i).getName());
			String[] strs=list.get(i).getScene_ids().split("-");
			List<AlarmScene> alarmSceneList=new ArrayList<>();
			for(int j=0;j<strs.length;j++) {
				AlarmScene alarmScene=workOrderTypeService.getAlarmSceneById(strs[i]);
				alarmSceneList.add(alarmScene);
			}
			workorderTypeResult.setAlarmSceneList(alarmSceneList);
			res_list.add(workorderTypeResult);
		}	
		result.put("result", 1);
		result.put("data", res_list);
		return result;
	}
	
	
	
	//更新工单类型
	@RequestMapping("/updateWorkorderType")
	@ResponseBody
	public Object  updateWorkorderType(@RequestBody WorkorderType param) {
		
		Map<String,Object> result=new HashMap<String,Object>();
		workOrderTypeService.updateWorkorderType(param);
		result.put("result", 1);
		return result;
	}

}

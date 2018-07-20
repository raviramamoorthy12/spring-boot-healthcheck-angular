package com.webtrixs.healthcheck.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.webtrixs.healthcheck.helper.CommonHelper;
import com.webtrixs.healthcheck.model.HealthCheck;
import com.webtrixs.healthcheck.model.HealthChecks;


@RestController
@RequestMapping("api/v1/")
public class HealthCheckController {
	 Gson gson = new Gson();
	 @Autowired
	 private CommonHelper commonHelper;
	 
	 
	@RequestMapping(value = "hc",method = RequestMethod.GET)
	public List<HealthCheck> getHealthCheck(){
		String jsonHCList=null;
		HealthChecks hcs = null;
		
		try {
			jsonHCList = commonHelper.readRequestFileAsStr("hc.json");
			hcs = gson.fromJson(jsonHCList, HealthChecks.class);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return hcs.getHealthChecks();
		
	}

}

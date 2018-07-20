package com.webtrixs.healthcheck.model;

import java.util.ArrayList;
import java.util.List;

public class HealthChecks {
	List<HealthCheck>  healthChecks = new ArrayList<HealthCheck>();

	public List<HealthCheck> getHealthChecks() {
		return healthChecks;
	}

	public void setHealthChecks(List<HealthCheck> healthChecks) {
		this.healthChecks = healthChecks;
	}
	
	

}

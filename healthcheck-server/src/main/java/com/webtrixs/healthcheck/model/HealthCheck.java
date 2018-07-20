package com.webtrixs.healthcheck.model;

import java.util.ArrayList;
import java.util.List;

public class HealthCheck {
	
String name;
String direction;
String url;
boolean secure;
boolean healthy;
boolean excepted;
boolean actual;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDirection() {
	return direction;
}
public void setDirection(String direction) {
	this.direction = direction;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public boolean isSecure() {
	return secure;
}
public void setSecure(boolean secure) {
	this.secure = secure;
}
public boolean isHealthy() {
	return healthy;
}
public void setHealthy(boolean healthy) {
	this.healthy = healthy;
}
public boolean isExcepted() {
	return excepted;
}
public void setExcepted(boolean excepted) {
	this.excepted = excepted;
}
public boolean isActual() {
	return actual;
}
public void setActual(boolean actual) {
	this.actual = actual;
}

List<HCStep> steps = new ArrayList<HCStep>();
public List<HCStep> getSteps() {
	return steps;
}
public void setSteps(List<HCStep> steps) {
	this.steps = steps;
}




}

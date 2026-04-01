package com.test.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "MyService")
public class MyServiceProperties {
	private boolean enabled = true;
	
	public boolean isENabled() {
		return enabled;
		
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}

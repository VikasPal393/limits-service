package com.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitController {
	
	@Autowired 
	private Configuration configuration;
	
	
//	@Value("${limits-service.maximum}")
//	int max;
//	
//	@Value("${limits-service.minimum}")
//	int min;
	
//	@Autowired 
//	private Environment env;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimits() {
		
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
		
	}

}

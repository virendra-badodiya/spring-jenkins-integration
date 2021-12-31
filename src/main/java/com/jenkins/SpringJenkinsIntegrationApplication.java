package com.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsIntegrationApplication {
	
	private static Logger logger=LoggerFactory.getLogger(SpringJenkinsIntegrationApplication.class);
	
	@PostConstruct
	public void inti() {
		
		logger.info("Application started");
	}
	

	public static void main(String[] args) {
	
		logger.info("Main Method started....");
		SpringApplication.run(SpringJenkinsIntegrationApplication.class, args);
	}

}

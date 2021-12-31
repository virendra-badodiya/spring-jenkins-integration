package com.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsIntegrationApplicationTests {
	
	private static Logger logger=LoggerFactory.getLogger(SpringJenkinsIntegrationApplicationTests.class);
	

	@Test
	void contextLoads() {
		
		logger.info("Test executed");
		
		
	}

}

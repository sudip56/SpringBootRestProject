package com.haud.svalinn.ss7.protocol.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages = {"com.haud"})
@EnableTransactionManagement
public class Application {
	
	 private static final Logger logger = LogManager.getLogger(Application.class);
	 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		logger.info("Service Started");
	}

}

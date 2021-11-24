package com.cg.dms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ComCgDmsApplication {
	
	private static final Logger LOG = LoggerFactory.getLogger(ComCgDmsApplication.class);

	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(ComCgDmsApplication.class, args);
		LOG.info("Welcome to project");
		LOG.info("Stop");
	}
}

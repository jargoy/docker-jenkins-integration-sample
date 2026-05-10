package com.docker_jenkins_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsIntegrationApplication {

	private static Logger logger = LoggerFactory.getLogger(DockerJenkinsIntegrationApplication.class);
    
	@PostConstruct
	public void init(){
	logger.info("Application Started...");
	}


	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsIntegrationApplication.class, args);
	}

}

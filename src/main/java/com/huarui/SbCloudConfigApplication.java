package com.huarui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //@EnableEurekaClient将它注册到服务中心
@EnableConfigServer //@EnableConfigServer注解说明了一个Config Server
public class SbCloudConfigApplication {

	//http://localhost:9002/application-dev.yml

	public static void main(String[] args) {
		SpringApplication.run(SbCloudConfigApplication.class, args);
	}

}

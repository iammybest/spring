package com.iammybest.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 服务注册中心
 * 负责管理 注册服务
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication  {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}

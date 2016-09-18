package com.love.life.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 项目的启动类，指定扫描的包路径
 * @author 
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
@EnableAutoConfiguration
public class ConfigApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigApplication.class, args);
	}
}

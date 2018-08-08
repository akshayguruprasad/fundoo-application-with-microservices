package com.indream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;



@EnableSwagger2
//@EnableEurekaClient
@SpringBootApplication
@EnableRedisRepositories(redisTemplateRef="redisTemplate")
//@EnableMongoRepositories(basePackages ="com.indream.userservice.repository")
@EnableCaching
public class UserModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserModuleApplication.class, args);
	}
}

package com.baidu.day0615;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.baidu.day0615.dao")
@EnableFeignClients
public class Day0615Application {

	public static void main(String[] args) {
		SpringApplication.run(Day0615Application.class, args);
	}

}

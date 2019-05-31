package com.zqb.web;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.annotations.Cacheable;

@SpringBootApplication(scanBasePackages = {"com.zqb"})
@EnableCaching
public class ZqbApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZqbApplication.class, args);
	}
}

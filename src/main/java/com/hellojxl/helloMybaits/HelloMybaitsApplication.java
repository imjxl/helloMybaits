package com.hellojxl.helloMybaits;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hellojxl.helloMybaits.Dao")
@SpringBootApplication
public class HelloMybaitsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloMybaitsApplication.class, args);
	}
}

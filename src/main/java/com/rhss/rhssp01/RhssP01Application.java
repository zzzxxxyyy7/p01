package com.rhss.rhssp01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rhss.rhssp01.Model.entiey.mapper")
public class RhssP01Application {
    public static void main(String[] args) {
        SpringApplication.run(RhssP01Application.class, args);
    }
}

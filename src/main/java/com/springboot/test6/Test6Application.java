package com.springboot.test6;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.springboot.test6.Dao"})
public class Test6Application {

    public static void main(String[] args) {
        SpringApplication.run(Test6Application.class, args);
    }

}

package com.learn.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Random;

/**
 * @Author: Keith
 * @Date: 2019-12-24 10:08
 */

@SpringBootApplication
@MapperScan(value = "com.learn.mall.dao")
public class MallApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }

}

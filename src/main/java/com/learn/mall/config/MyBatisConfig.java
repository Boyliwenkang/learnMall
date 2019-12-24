package com.learn.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 李文康
 * @Date: 2019-12-24 10:18
 * MyBatis配置类
 */

@Configuration
@MapperScan("com.learn.mall.mbg.mapper")
public class MyBatisConfig {

}

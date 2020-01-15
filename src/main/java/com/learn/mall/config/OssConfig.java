package com.learn.mall.config;

import com.aliyun.oss.OSSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Keith
 * @Date: 2020-01-10 15:58
 * 用于配置OSS的连接客户端OSSClient
 */

@Configuration
public class OssConfig {
    @Value("${aliyun.oss.endpoint}")
    private String ALIYUN_OSS_ENDPOINT;

    @Value("${aliyun.oss.accessKeyId}")
    private String ALIYUN_OSS_ACCESSKEYID;

    @Value("${aliyun.oss.accessKeySecret}")
    private String ALIYUN_OSS_ACCESSKEYSECRET;

    @Bean
    public OSSClient ossClient(){
        return new OSSClient(ALIYUN_OSS_ACCESSKEYID,ALIYUN_OSS_ACCESSKEYSECRET,ALIYUN_OSS_ENDPOINT);
    }

}

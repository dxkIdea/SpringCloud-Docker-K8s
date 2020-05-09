package com.dxk.spring.nacos.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: Nacos配置中心，启动类
 * @author: 丁杏凯
 * @create: 2020-05-09 13:51
 **/
@SpringBootApplication
public class NacosConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class,args);
    }
}

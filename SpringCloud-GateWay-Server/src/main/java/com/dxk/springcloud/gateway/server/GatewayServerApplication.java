package com.dxk.springcloud.gateway.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/6/4
 * Time: 22:51
 * Description: 基于SpringCloud Gateway实现微服务网关
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class,args);
    }
}

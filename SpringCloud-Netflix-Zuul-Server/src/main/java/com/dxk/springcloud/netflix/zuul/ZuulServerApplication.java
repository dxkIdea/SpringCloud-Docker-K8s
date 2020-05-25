package com.dxk.springcloud.netflix.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/5/25
 * Time: 22:30
 * Description: Zuul网关启动类
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class,args);
    }
}

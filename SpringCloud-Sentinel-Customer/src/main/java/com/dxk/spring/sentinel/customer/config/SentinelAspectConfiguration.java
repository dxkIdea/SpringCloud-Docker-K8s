package com.dxk.spring.sentinel.customer.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: SpringCloud-Docker-K8s
 * @description:  SentinelAspectConfiguration
 * @author: 丁杏凯
 * @create: 2020-05-12 22:00
 **/
@Configuration
public class SentinelAspectConfiguration {
    @Bean
    public SentinelResourceAspect sentinelResourceAspect() {
        return new SentinelResourceAspect();
    }
}

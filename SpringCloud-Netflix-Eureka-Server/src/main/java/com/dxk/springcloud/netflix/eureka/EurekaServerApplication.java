package com.dxk.springcloud.netflix.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
* @Description: EurekaServer启动类
* @Author: dxk
* @Date: 2020/5/24
*/

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }

    /**
    * @Description:  开启web安全，排除eureka/**路径，防止eureka client 服务注册异常
    * @Author: dxk
    * @Date: 2020/5/25 10:55
    */
    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().ignoringAntMatchers("/eureka/**");
            super.configure(http);
        }
    }
}

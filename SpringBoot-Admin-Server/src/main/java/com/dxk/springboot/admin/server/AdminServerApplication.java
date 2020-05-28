package com.dxk.springboot.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/5/28
 * Time: 22:14
 * Description: 服务监控
 */
@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class,args);
    }
}

package com.dxk.springcloud.netflix.eureka.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/5/25
 * Time: 11:20
 * Description: 测试类-接口层
 */
@FeignClient(value = "EUREKA-PROVIDER",fallback = HelloFallService.class)
public interface HelloService {

    /**
    * @Description: 打招呼、哈哈哈
    * @Author: dxk
    * @Date: 2020/5/25 11:21
    */
    @PostMapping(value = "/hello")
    String hello(@RequestParam(name = "name") String name);
}

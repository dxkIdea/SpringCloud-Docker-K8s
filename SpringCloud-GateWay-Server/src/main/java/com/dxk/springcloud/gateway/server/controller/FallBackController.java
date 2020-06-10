package com.dxk.springcloud.gateway.server.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/6/9
 * Time: 22:17
 * Description: 熔断、转发
 */
@RestController
public class FallBackController {

    @PostMapping(value = "/fallBack")
    public String fallBack(@RequestParam(name = "name") String name) {
        return "sorry " + name + "服务异常了！";
    }
}

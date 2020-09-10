package com.dxk.springcloud.netflix.eureka.provider.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description: 用户操作控制层
 * @Date: 2020/9/10 11:49
 * @Author: dingxingkai
 * @Version: 1.0
 */
@RestController
public class UserController {

    @PostMapping(value = "/login")
    public String userLogin(@RequestParam(name = "userName") String userName,
                            @RequestParam(name = "passWord") String passWord) {
        System.out.println("接收到用户提交信息， 用户名： " + userName + " 密码： " + passWord);
        return "success";
    }
}

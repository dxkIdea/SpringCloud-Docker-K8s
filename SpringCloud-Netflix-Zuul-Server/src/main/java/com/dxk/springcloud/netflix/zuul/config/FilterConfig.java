package com.dxk.springcloud.netflix.zuul.config;

import com.dxk.springcloud.netflix.zuul.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/5/27
 * Time: 21:53
 * Description: 过滤器统一配置类
 */
@Configuration
public class FilterConfig {
    /**
     * 权限过滤器
     * @return
     */
    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}

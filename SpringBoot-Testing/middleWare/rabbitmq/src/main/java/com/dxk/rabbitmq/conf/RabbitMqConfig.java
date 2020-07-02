package com.dxk.rabbitmq.conf;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/7/2
 * Time: 22:33
 * Description: rabbitmq初始化类
 */
@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue testQueue() {
        return new Queue("test");
    }
}

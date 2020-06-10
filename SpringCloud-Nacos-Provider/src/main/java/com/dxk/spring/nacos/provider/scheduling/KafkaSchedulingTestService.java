package com.dxk.spring.nacos.provider.scheduling;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/6/10
 * Time: 21:44
 * Description: kafka定时发送消息
 */
@Component
public class KafkaSchedulingTestService {
    @Resource
    private KafkaTemplate<String,Object> kafkaTemplate;

    /**
    * @Description:  kafka生产消息
    * @Author: dxk
    * @Date: 2020/6/10 21:45
    */
    @Scheduled(cron = "*/10 * * * * ?")
    public void sendMessage () {
        try{
            String msg = "当前时间戳为---" + System.currentTimeMillis();
            kafkaTemplate.send("testTopic",msg);
            System.out.println("发送消息：" + msg);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

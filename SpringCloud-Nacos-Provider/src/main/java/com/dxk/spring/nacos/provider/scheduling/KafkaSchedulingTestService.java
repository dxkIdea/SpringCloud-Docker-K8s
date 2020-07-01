package com.dxk.spring.nacos.provider.scheduling;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

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
            kafkaTemplate.send("testTopic", UUID.randomUUID().toString(),"时间戳- " + System.currentTimeMillis()).addCallback( success -> {
                // 消息发送到的topic
                String topic = success.getRecordMetadata().topic();
                // 消息发送到的分区
                int partition = success.getRecordMetadata().partition();
                // 消息在分区内的offset
                long offset = success.getRecordMetadata().offset();
                System.out.println("发送消息成功:" + topic + "-" + partition + "-" + offset);
            },failure -> {
                System.out.println("发送消息失败:" + failure.getMessage());
            });
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

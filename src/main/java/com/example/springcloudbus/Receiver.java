package com.example.springcloudbus;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Auther: wyx
 * @Date: 2019-05-03 18:34
 * @Description:
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    /**
     * 处理接收到的消息
     */
    @RabbitHandler
    public void process(String msg){
        System.out.println("Receiver: " + msg);
    }

}

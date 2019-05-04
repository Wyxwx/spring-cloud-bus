package com.example.springcloudbus;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auther: wyx
 * @Date: 2019-05-03 18:32
 * @Description:
 */
@Component
public class Sender {

    // 可以直接向某一个消息队列发送消息
    @Autowired
    private AmqpTemplate template;

    public void send(){
        String msg = "Hello RabbitMQ: " + new Date();
        System.out.println("Sender: " + msg);
        // 向一个名为 hello 的消息队列中发送消息。
        this.template.convertAndSend("hello", msg);
    }

}

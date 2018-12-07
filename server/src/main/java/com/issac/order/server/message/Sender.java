package com.issac.order.server.message;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 发送 mq 消息
 * author:  ywy
 * date:    2018-10-26
 * desc:
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTempalte;

    public void send() {
        String msg = "hello rabbitmq:" + new Date();
        System.out.println("Sender:" + msg);
        this.rabbitTempalte.convertAndSend("myQueue",msg);
    }

    public void sendComputer() {
        String msg = "computer rabbitmq:" + new Date();
        System.out.println("Sender:" + msg);
        this.rabbitTempalte.convertAndSend("myOrder","computer",msg);
    }
}

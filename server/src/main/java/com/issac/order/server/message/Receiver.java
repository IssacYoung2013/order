package com.issac.order.server.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 接收 mq 消息
 * author:  ywy
 * date:    2018-10-26
 * desc:
 */
@Component
@Slf4j
public class Receiver {

//    1. @RabbitListener(queues = "myQueue")
//    2. 自动创建队列 @RabbitListener(queuesToDeclare = @Queue("myQueue"))
//    3. 自动创建 Exchange和Queue 绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String msg) {
        log.info("MqReceiver:{}",msg);
    }

    /**
     * 数码供应商
     * @param msg
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("computerOrder"),
            key = "computer",
            exchange = @Exchange("myOrder")
    ))
    public void processComputer(String msg) {
        log.info("computer MqReceiver:{}",msg);
    }

    /**
     * 水果供应商
     * @param msg
     */
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("fruitOrder"),
            key = "fruit",
            exchange = @Exchange("myOrder")
    ))
    public void processFruit(String msg) {
        log.info("fruit MqReceiver:{}",msg);
    }
}

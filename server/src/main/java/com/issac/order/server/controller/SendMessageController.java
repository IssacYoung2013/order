package com.issac.order.server.controller;

import com.issac.order.server.dto.OrderDTO;
import com.issac.order.server.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * author:  ywy
 * date:    2018-10-30
 * desc:
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;



//    @GetMapping("/sendMessage")
//    public void process() {
//        String message = "hello " + new Date();
//        streamClient.output().send(MessageBuilder.withPayload(message).build());
//    }

    @GetMapping("/sendMessage")
    public void process() {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("1233");
        streamClient.input().send(MessageBuilder.withPayload(orderDTO).build());
    }
}

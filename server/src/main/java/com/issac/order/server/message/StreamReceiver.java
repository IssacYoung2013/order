package com.issac.order.server.message;

import com.issac.order.server.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * author:  ywy
 * date:    2018-10-30
 * desc:
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {



//    @StreamListener(StreamClient.OUTPUT)
//    public void processOutput(Object message) {
//
//        log.info("StreamReceiver:{}", new String((byte[]) message));
//    }

//    /**
//     * @param message
//     */
//    @StreamListener(StreamClient.OUTPUT)
//    public void processOutput(OrderDTO message) {
//
//        log.info("StreamReceiver:{}", message);
//    }

    @StreamListener(StreamClient.INPUT)
    @SendTo(StreamClient.OUTPUT)
    public Object processInput(Object message) {
        log.info("StreamReceiver0:{}", message.toString());
        return message;
    }

    /**
     * 接收 orderDTO
     *
     * @param message
     */
    @StreamListener(StreamClient.OUTPUT)
    @SendTo(StreamClient.INPUT2)
    public Object processOutput(OrderDTO message) {

        log.info("StreamReceiver1:{}", message);
        return message;
    }

    @StreamListener(StreamClient.INPUT2)
    @SendTo(StreamClient.OUTPUT2)
    public String processInput2(OrderDTO message) {

        log.info("StreamReceiver2:{}", message);
        return "received 2";
    }

    @StreamListener(StreamClient.OUTPUT2)
    public void processOutput2(String message) {
        log.info("StreamReceiver3:{}", message);
    }
}

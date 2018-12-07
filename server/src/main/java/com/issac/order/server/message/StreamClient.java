package com.issac.order.server.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 *
 * author:  ywy
 * date:    2018-10-30
 * desc:
 */
public interface StreamClient {

    String INPUT = "input";

    String OUTPUT = "output";

    @Input(INPUT)
    SubscribableChannel input();

    @Output(OUTPUT)
    MessageChannel output();

    String INPUT2 = "input2";

    String OUTPUT2 = "output2";

    @Input(INPUT2)
    SubscribableChannel input2();

    @Output(OUTPUT2)
    MessageChannel output2();
}

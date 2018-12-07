package com.issac.order.server.message;

import com.fasterxml.jackson.core.type.TypeReference;
import com.issac.order.server.util.JsonUtil;
import com.issac.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * author:  ywy
 * date:    2018-11-14
 * desc:
 */
@Component
@Slf4j
public class ProductInfoReceiver {

    public static final String PRODUCT_STOCK_TEMPLATE = "product_stock_%s";

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message) {

        // message = > ProductInfoOutput
        List<ProductInfoOutput> productInfoOutputList =(List<ProductInfoOutput>)
                JsonUtil.fromJson(message, new TypeReference<List<ProductInfoOutput>>(){});

        log.info("【从队列{}接收到消息】:{}","productInfo",productInfoOutputList);

        // 存储redis
        productInfoOutputList.forEach(productInfoOutput -> {
            stringRedisTemplate.opsForValue().set(String.format(PRODUCT_STOCK_TEMPLATE,productInfoOutput.getProductId()),
                    String.valueOf(productInfoOutput.getProductStock() ));
        });


    }
}

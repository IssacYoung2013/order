package com.issac.order.server.controller;

import com.issac.product.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 *
 * author:  ywy
 * date:    2018-10-10
 * desc:
 */
@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private ProductClient productClient;
//
//    @GetMapping("/getProductMsg")
//    public String getProductMsg() {
//        // 1. 第一种方式 url 写死 不适合多个地址
////        RestTemplate restTemplate = new RestTemplate();
////        String response = restTemplate.getForObject("http://localhost:8090/msg",String.class);
//
//        // 2. 第二种方式 利用loadBalancerClient 通过应用名获取url，然后再使用resttemplate
////        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
////        String url = String.format("http://%s:%s/msg",serviceInstance.getHost(),serviceInstance.getPort());
////        RestTemplate restTemplate = new RestTemplate();
////        String response = restTemplate.getForObject(url,String.class);
//
//        // 3. 第三种方式
////        String response = restTemplate.getForObject("http://Product/msg",String.class);
//
//        // Feign
//        String response = productClient.productMsg();
//
//        log.info("【获取商品消息】,msg=>{}",response);
//
//        return response;
//    }
//
//    @GetMapping("/getProductList")
//    public String getProductList() {
//        List<ProductInfo> productInfoList = productClient.listForOrder(Arrays.asList("123456"));
//        log.info("response => {}",productInfoList);
//        return "ok";
//    }
//
//    @PostMapping("/productDecreaseStock")
//    public  String productDecreaseStock() {
//        productClient.decreaseStock(Arrays.asList(new CartDTO("123457",3)));
//
//        return "ok";
//    }
}

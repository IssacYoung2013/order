package com.issac.order.server.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.issac.order.server.dataobject.OrderDetail;
import com.issac.order.server.enums.ResultEnum;
import com.issac.order.server.exception.OrderException;
import com.issac.order.server.form.OrderForm;
import lombok.extern.slf4j.Slf4j;
import com.issac.order.server.dto.OrderDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * author:  ywy
 * date:  2018-09-04
 * desc:
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {

        Gson gson = new Gson();

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();

        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误,string={}", orderForm.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }

}
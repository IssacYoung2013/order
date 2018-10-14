package com.issac.order.server.dto;

import lombok.Data;

/**
 *
 * author:  ywy
 * date:  2018-08-31
 * desc:
 *
 */
@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
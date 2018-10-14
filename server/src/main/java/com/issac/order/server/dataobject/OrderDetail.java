package com.issac.order.server.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 *
 * author:  ywy
 * date:  2018-08-30
 * desc:
 *
 */
@Entity
@Data
@DynamicUpdate
public class OrderDetail {

    /**
     * 订单明细id
     */
    @Id
    private String detailId;

    /**
     * 商品id
     */
    private String orderId;

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品jiage
     */
    private BigDecimal productPrice;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    /**
     * 小图
     */
    private String productIcon;

}
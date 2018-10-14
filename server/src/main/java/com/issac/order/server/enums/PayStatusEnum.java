package com.issac.order.server.enums;

import lombok.Getter;

/**
 *
 * author:  ywy
 * date:  2018-08-30
 * desc:
 *
 */
@Getter
public enum PayStatusEnum implements CodeEnum{
    WAIT(0,"未支付"),
    SUCCESS(1,"支付成功")
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

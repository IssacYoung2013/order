package com.issac.order.common.exception;

import com.issac.order.common.enums.ResultEnum;
import lombok.Getter;

/**
 * author:  ywy
 * date:  2018-08-31
 * desc:
 */
@Getter
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }


    public OrderException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}
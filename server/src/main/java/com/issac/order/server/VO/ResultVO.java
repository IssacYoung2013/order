package com.issac.order.server.VO;

import lombok.Data;

/**
 * author:  ywy
 * date:  2018-08-30
 * desc: http请求返回的最外层
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
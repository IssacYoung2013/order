package com.issac.order.server.util;

import java.util.Random;

/**
 * author:  ywy
 * date:  2018-08-31
 * desc:
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     *
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        Integer number = random.nextInt(9000000) + 1000000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
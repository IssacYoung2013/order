package com.issac.order.server.controller;

import com.issac.order.server.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * author:  ywy
 * date:    2018-10-15
 * desc:
 */
@RestController
@RefreshScope
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @RequestMapping("/girl/print")
    @RefreshScope
    public String print() {
        return girlConfig.getName() + ":" + girlConfig.getAge();
    }
}

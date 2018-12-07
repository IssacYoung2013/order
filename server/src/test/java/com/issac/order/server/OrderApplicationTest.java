package com.issac.order.server;

import com.issac.order.server.message.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 *
 * author:  ywy
 * date:    2018-10-26
 * desc:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class OrderApplicationTest {

    @Autowired
    private Sender sender;

    @Test
    public void contextLoads(){
//        sender.send();
        sender.sendComputer();
    }

}
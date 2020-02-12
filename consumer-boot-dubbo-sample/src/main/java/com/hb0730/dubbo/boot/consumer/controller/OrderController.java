package com.hb0730.dubbo.boot.consumer.controller;

import com.hb0730.dubbo.sample.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
@Controller
public class OrderController {
    @Autowired
    IOrderService orderService;

    @RequestMapping("/initOrder")
    public void initOrder(@RequestParam("uid") String userId) {
        orderService.initOrder(userId);
    }
}

package com.malibu.springioc.controller;

import com.malibu.springioc.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by qinyisheng on 16/9/2.
 */
@Component
public class OrderContorller {
    @Autowired
    private IOrderService orderService;
    public void orderTest(){
        orderService.printOrder();
    }

    public IOrderService getOrderService() {
        return orderService;
    }
}

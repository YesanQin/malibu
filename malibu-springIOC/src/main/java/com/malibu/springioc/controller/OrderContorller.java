package com.malibu.springioc.controller;

import com.malibu.springioc.service.IOrderService;
import com.malibu.springioc.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

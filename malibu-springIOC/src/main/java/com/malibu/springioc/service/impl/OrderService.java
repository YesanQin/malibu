package com.malibu.springioc.service.impl;

import com.malibu.springioc.service.IOrderService;
import org.springframework.stereotype.Component;

/**
 * Created by qinyisheng on 16/9/2.
 */
@Component
public class OrderService implements IOrderService {
    public void printOrder() {
        System.out.println("Hello MALIBU @caoye");
    }
}

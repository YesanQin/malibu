package com.malibu.springioc;

import com.malibu.springioc.controller.OrderContorller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qinyisheng on 16/9/2.
 */
public class TestMain {
    public static void main(String[] args) {
        String location = "spring-application.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(location);
        OrderContorller orderContorller = applicationContext.getBean(OrderContorller.class);
        System.out.println(orderContorller);
        if(null != orderContorller.getOrderService()){
            orderContorller.orderTest();
        }
    }
}

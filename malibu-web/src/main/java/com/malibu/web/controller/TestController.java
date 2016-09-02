package com.malibu.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qinyisheng on 16/9/2.
 */
@RestController
public class TestController {
    @RequestMapping(value = "/test.html")
    public String showIndex(){
        System.out.println("Hello MALIBU~");
        return "";
    }
}

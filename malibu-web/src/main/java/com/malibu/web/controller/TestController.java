package com.malibu.web.controller;

import com.malibu.web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qinyisheng on 16/9/2.
 */
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test.html")
    public String showIndex(){
        testService.testMethod();
        return "test";
    }
}

package com.malibu.web.controller;

import com.malibu.web.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qinyisheng on 16/9/2.
 */
@Controller
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test.html")
    public String showIndex(){
        LOGGER.info("info test");
        LOGGER.debug("debug test");
        LOGGER.error("Erroe test");
        testService.testMethod();
        return "test";
    }
}

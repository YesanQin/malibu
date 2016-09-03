package com.malibu.web.controller;

import com.malibu.web.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("/http.html")
    public String checkHttpRequest(HttpServletRequest httpServletRequest, @ModelAttribute("model") ModelMap modelMap){
        modelMap.put("url",httpServletRequest.getRequestURL());
        return "httpInformation";
    }

    @RequestMapping("/restful-{id:\\d+}.html")
    public String restfulCheck(@PathVariable("id") int restId,@ModelAttribute("model") ModelMap modelMap){
        modelMap.put("id",restId);
        return "restful";
    }
}

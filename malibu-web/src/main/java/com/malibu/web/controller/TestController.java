package com.malibu.web.controller;

import com.malibu.common.network.NetworkBaseHelper;
import com.malibu.web.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qinyisheng on 16/9/2.
 */
@Controller
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private TestService testService;


    /**
     *
     * @param parameter
     * @return
     */
    @RequestMapping(value = "/test.html")
    public String showIndex(@RequestParam(value="param",required = false) String parameter){
        LOGGER.info("============"+parameter);
        LOGGER.info("info test");
        LOGGER.debug("debug test");
        LOGGER.error("Erroe test");
        testService.testMethod();
        return "test";
    }

    /**
     *
     * @param httpServletRequest
     * @param modelMap
     * @return
     */
    @RequestMapping("/http.html")
    public String checkHttpRequest(HttpServletRequest httpServletRequest, @ModelAttribute("model") ModelMap modelMap){
        LOGGER.info("Parameter"+httpServletRequest.toString());
        LOGGER.info("Network"+NetworkBaseHelper.getRequest().toString());

        /*
            put和addAttribute的方法区别在于addAttribute会进行null验证,不允许放入空值
            modelMap继承自LinkedHashMap
         */
        modelMap.put("url",httpServletRequest.getRequestURL());
        modelMap.addAttribute("parameter",httpServletRequest.toString());

        return "httpInformation";
    }

    /**
     *
     * @param restId
     * @param modelMap
     * @param httpServletRequest
     * @return
     */
    @RequestMapping("/restful-{id:\\d+}.html")
    public String restfulCheck(@PathVariable("id") int restId,@ModelAttribute("model") ModelMap modelMap,HttpServletRequest httpServletRequest){
        LOGGER.info("Network:"+NetworkBaseHelper.getRequest().toString());
        LOGGER.info("Parameter:"+httpServletRequest.toString());
        modelMap.put("id",restId);
        return "restful";
    }

}

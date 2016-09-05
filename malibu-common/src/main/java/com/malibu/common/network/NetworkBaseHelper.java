package com.malibu.common.network;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by qinyisheng on 16/9/5.
 */
public class NetworkBaseHelper {
    public static HttpServletRequest getRequest(){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        if (null == requestAttributes){
            return null;
        }
        return ((ServletRequestAttributes)requestAttributes).getRequest();
    }
}

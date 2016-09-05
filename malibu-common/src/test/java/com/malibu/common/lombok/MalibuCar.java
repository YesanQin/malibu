package com.malibu.common.lombok;

import lombok.Data;

/**
 * Created by qinyisheng on 16/9/5.
 */
@Data
public class MalibuCar {
    private String manufacturer;
    private String name;
    private String version;
    private String level;
    private String engine;
    private String envirStandards;
    private String color;
    private String length;
    private String width;
    private String height;
    private String weight;
    private String confiLevel;
//    其实此处的字段设计不是很合理,只需要给每个Car说明品牌、型号就能根据厂商提供的配置参数说明查询到其具体的参数信息的
}

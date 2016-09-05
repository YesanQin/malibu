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
//    汽车在未转移到消费者手中之前,只有商品属性;
//    当转移到消费者手中之后,还会增加一些新的属性,比如说:车主、牌照等。这些属性可以统称为财产属性,因为其id关联了一个人
//    车管所主要管理者车辆与人的关联信息~

}

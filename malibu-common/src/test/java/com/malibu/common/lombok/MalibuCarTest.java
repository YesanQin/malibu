package com.malibu.common.lombok;

/**
 * Created by qinyisheng on 16/9/5.
 */
public class MalibuCarTest {
    static MalibuCar malibuCar= null;
    public static void main(String[] args) {
        init();
        System.out.println(malibuCar);
    }
    public static void init(){
        malibuCar = new MalibuCar();
        malibuCar.setManufacturer("上海通用雪弗兰");
        malibuCar.setName("迈锐宝");
        malibuCar.setColor("黑色");
        malibuCar.setEnvirStandards("国V");
        malibuCar.setLength("4855mm");
        malibuCar.setWidth("1854mm");
        malibuCar.setHeight("1476mm");
        malibuCar.setWeight("1520kg");
        malibuCar.setVersion("中型车");
        malibuCar.setEngine("1.6T 184马力 L4");
        malibuCar.setConfiLevel("1.6T 自动豪华");
    }
}

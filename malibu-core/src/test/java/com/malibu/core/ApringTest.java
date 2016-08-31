package com.malibu.core;

/**
 * Created by qinyisheng on 16/8/31.
 */
public class ApringTest {
    public static void main(String[] args) {
        springIOCTest();
    }

    public static void staticTest(){
//        this.springIOCTest();//eg:静态上下文不能应用非静态变量this
    }

    public void test(){
        this.springIOCTest();
    }

    public static void springIOCTest(){
    }
}

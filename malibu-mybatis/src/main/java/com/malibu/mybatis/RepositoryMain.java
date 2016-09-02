package com.malibu.mybatis;

import com.malibu.mybatis.dto.Order;
import com.malibu.mybatis.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by qinyisheng on 16/8/31.
 */
public class RepositoryMain {

    private static SqlSessionFactoryBuilder sqlSessionFactoryBuilder;
    private static SqlSessionFactory sqlSessionFactory;

    public static void main(String[] args) {
        init();
    }

    public static void init(){
        sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        String resource = "mybatis/mybatis-config.xml";
        Reader reader = null;
        try {
           reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            System.out.println("获取配置文件失败!");
            e.printStackTrace();
        }
        sqlSessionFactory = sqlSessionFactoryBuilder.build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

        Order order = orderMapper.selectOrderById(324235);
        System.out.println(order);

//        Order order1 = new Order();
//        order1.setOrderId(324240);
//        order1.setOrderNo("P89");
//        order1.setOrderPrice(23.0F);
//        int num = orderMapper.insertOrder(order1);
//        sqlSession.commit();//需要commit才能插入数据
//        System.out.println(num);
    }
}

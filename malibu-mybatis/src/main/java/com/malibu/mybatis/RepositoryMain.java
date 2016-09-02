package com.malibu.mybatis;

import com.malibu.mybatis.dto.Order;
import com.malibu.mybatis.mapper.OrderMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.ognl.ObjectElementsAccessor;
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
    private static SqlSession sqlSession;

    static {
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
        sqlSession = sqlSessionFactory.openSession();
    }

    public static void main(String[] args) {
        System.out.println(getOrderMapper().selectOrderById(324233));
        getOrderMapper().updateOrder(324233);
        sqlSession.commit();//这里需要手动提交
        System.out.println(getOrderMapper().selectOrderById(324233));
    }

    public static OrderMapper getOrderMapper(){
        return sqlSession.getMapper(OrderMapper.class);
    }
}

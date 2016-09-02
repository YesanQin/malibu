package com.malibu.mybatis;

import com.malibu.mybatis.dto.FlowTask;
import com.malibu.mybatis.mapper.ITestMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.Date;

/**
 * Created by qinyisheng on 16/8/31.
 */
public class TestApp {

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
       ITestMapper testMapper = sqlSession.getMapper(ITestMapper.class);
        FlowTask flowTask = new FlowTask();
        flowTask.setAddUser("qinys");
//        flowTasksk.setGmtCreate(java.sql.Date());
        flowTask.setIsDeleted(1);
        flowTask.setTaskModelId(1110);
        flowTask.setParentTaskId(3293);
        flowTask.setTaskType(3);
        testMapper.insertFlowTask(flowTask);
    }
}

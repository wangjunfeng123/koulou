package com.gz.koulouweb.service;

import org.apache.ibatis.executor.SimpleExecutor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.*;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.jdbc.JdbcTransaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class SqlSessionExector {

    Configuration configuration;
    Transaction transaction;
    SqlSessionFactory factory;

    private void  init() {
        try {
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            factory = sqlSessionFactoryBuilder.build(UserExtendService.class.getResourceAsStream("mybatis-config.xml"));
            configuration = factory.getConfiguration();
            Connection connection = DriverManager.getConnection("localhost", "root", "123456");
            transaction = new JdbcTransaction(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void simpleExecutor() {
        try {
            SimpleExecutor executor = new SimpleExecutor(configuration, transaction);
            MappedStatement ms = configuration.getMappedStatement("com...mapper.userMapper.getById");
            List<Object> result = executor.doQuery(ms, 1, RowBounds.DEFAULT, null, ms.getBoundSql(1));
            System.out.println(result.get(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sqlSessionTest() {
        try {
            SqlSession sqlSession = factory.openSession();
            List<Object> list = sqlSession.selectList("select * from user");
            System.out.println(list.get(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

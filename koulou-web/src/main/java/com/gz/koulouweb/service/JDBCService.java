package com.gz.koulouweb.service;

import java.sql.*;

/**
 * 创建jdbc应用程序
 * 1.注册驱动
 * 2.获取数据库链接
 * 3.执行SQL语句
 * 4.解析SQL返回值
 * 5.清理资源
 */
public class JDBCService {

    public static void main(String[] args) {
        Statement statement;
        Connection connection;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("localhost", "root", "123456");

            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select  * from user");

            // 遍历resultSet
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                System.out.println(id);
            }

            // 清理环境
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

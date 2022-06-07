package com.example.clientegestor.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/jardineria";
    public static final String USERNAME = "javafx";
    public static final String PASSWORD = "ClaveRoot#20";

    private static Connection instance = null;

    private DBConnection() { }

    public static Connection getConnection()  {
        if (instance == null) {
            Properties props = new Properties();
            props.put("user", USERNAME);
            props.put("password", PASSWORD);
            try {
                instance = DriverManager.getConnection(JDBC_URL, props);
                instance.setAutoCommit(false);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}

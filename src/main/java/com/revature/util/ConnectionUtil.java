package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getConnection() throws SQLException {

        String url = "jdbc:postgresql://34.71.200.147/postgres";
        String username = "postgres";
        String password = "p4ssw0rd";
        return DriverManager.getConnection(url, username,password);

    }
}

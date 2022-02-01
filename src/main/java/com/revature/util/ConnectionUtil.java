package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private static ConnectionUtil cu;



    private ConnectionUtil(){

    }

    public static synchronized ConnectionUtil getInstance(){
        if(cu == null){
            return new ConnectionUtil();
        }
        return cu;
    }

    //Create a database connection based off of our credentials and url
    public Connection getConnection(){
        Connection con;

        try{
            String dbUrl = "jdbc:postgresql://34.71.200.147:5432/postgres";
            con = DriverManager.getConnection(dbUrl, ("postgres"), ("password"));
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}

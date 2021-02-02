package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
    // JDBC driver name and database URL
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/demo_db";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "jaynepal";
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        //STEP 2: Register JDBC driver
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

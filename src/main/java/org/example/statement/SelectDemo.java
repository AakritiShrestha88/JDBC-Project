package org.example.statement;

import org.example.util.DbUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {
    static final String SQL = "select * from demo_tbl";

    public static void main(String[] args) {
        try{
            //STEP 4: Execute a query
            Statement stmt = DbUtil.getConnection().createStatement();
            ResultSet rs =stmt.executeQuery(SQL);
            while(rs.next()){ ;
                //Display values
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println(", Name: " + rs.getString("user_name"));
                System.out.println(", Password: " + rs.getString("password"));
                System.out.println("==================");

            }
            rs.close();

        }catch(SQLException | ClassNotFoundException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample


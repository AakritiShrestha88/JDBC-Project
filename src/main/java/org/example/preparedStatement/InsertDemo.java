package org.example.preparedStatement;

import org.example.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    static final String SQL = "insert into demo_tbl(user_name,password)values(?,?)";

    public static void main(String[] args) {
        try(//STEP 4: Execute a query
            PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);
        )
        {
            ps.setString(1,"mohan");
            ps.setString(2,"rr");
            ps.executeUpdate();
            System.out.println("Data Inserted...");
        }catch(SQLException | ClassNotFoundException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample

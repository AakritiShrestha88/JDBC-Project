package org.example.preparedStatement;

import org.example.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    static final String SQL = "update demo_tbl set user_name=?,password=? where id=?";

    public static void main(String[] args) {
        try(//STEP 4: Execute a query
            PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);)
        {
            ps.setString(1,"tina");
            ps.setString(2,"tt");
            ps.setInt(3,1);
            ps.executeUpdate();
            System.out.println("Data Updated...");
        }catch(SQLException | ClassNotFoundException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample



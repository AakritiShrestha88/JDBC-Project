package org.example.preparedStatement;

import org.example.util.DbUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
    static final String SQL = "delete from demo_tbl  where id=?";

    public static void main(String[] args) {
        try(//STEP 4: Execute a query
            PreparedStatement ps = DbUtil.getConnection().prepareStatement(SQL);)
        {
            ps.setInt(1,4);
            ps.executeUpdate();
            System.out.println("Data Deleted...");
        }catch(SQLException | ClassNotFoundException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample

package org.example.statement;

import org.example.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteDemo {
    static final String SQL = "delete from demo_tbl  where id=2";

    public static void main(String[] args) {


        try{

            //STEP 4: Execute a query
            Statement stmt = DbUtil.getConnection().createStatement();
            stmt.executeUpdate(SQL);
            System.out.println("Data deleted...");
        }catch(SQLException | ClassNotFoundException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample


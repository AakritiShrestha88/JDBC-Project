package org.example.statement;

import org.example.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    static final String SQL = "update demo_tbl set user_name='Krishan',password='pp' where id=2";

    public static void main(String[] args) {


        try{

            //STEP 4: Execute a query
            Statement stmt = DbUtil.getConnection().createStatement();
            stmt.executeUpdate(SQL);
            System.out.println("Data Updated...");
        }catch(SQLException | ClassNotFoundException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample

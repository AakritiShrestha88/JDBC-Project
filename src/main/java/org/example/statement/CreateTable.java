package org.example.statement;

import org.example.util.DbUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    static final String SQL = "Create table demo_tbl(id int not null auto_increment,user_name varchar(45),password varchar (45),primary key(id))";

    public static void main(String[] args) {


        try{

            //STEP 4: Execute a query
            System.out.println("Creating table in given database...");
            Statement stmt = DbUtil.getConnection().createStatement();

            stmt.executeUpdate(SQL);
            System.out.println("Created table in given database...");
        }catch(SQLException | ClassNotFoundException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }
        System.out.println("Goodbye!");
    }//end main
}//end JDBCExample

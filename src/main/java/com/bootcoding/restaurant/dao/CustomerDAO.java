package com.bootcoding.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME = "customer";
    public void createTable(){
        try {
            //1. Load JDBC Driver
            Class.forName( "org.postgresql.Driver");

            //2.
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "1404vinrush");
            //3.create statement object
            Statement stmt = con.createStatement();

            //4.execute query(statement)
            //TODO - Create Table Query
            String sql = "Select * from " +  TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);

            //5.traverse resultset (data)
            while (rs.next()){
                System.out.println("= " + rs.getString("name"));
                System.out.println(" = " + rs.getString("address"));
                System.out.println(" = " + rs.getString("phone_number"));
                System.out.println(" = " + rs.getString("city"));

            }


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}

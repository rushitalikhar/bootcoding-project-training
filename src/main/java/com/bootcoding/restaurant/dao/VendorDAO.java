package com.bootcoding.restaurant.dao;

import jdk.dynalink.beans.StaticClass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VendorDAO {
    public static final String TABLE_NAME = "vendor";
    public void createTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "1404vinrush");
            Statement stmt = con.createStatement();

            //4.execute query(statement)
            //TODO - Create Table Query
            String sql = "Select * from " +  TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);

            //5.traverse resultset (data)
            while (rs.next()){
                System.out.println("= " + rs.getString("name"));
                System.out.println(" = " + rs.getString("address"));
                System.out.println(" = " + rs.getString("email_id"));
                System.out.println(" = " + rs.getString("city"));

            }


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}


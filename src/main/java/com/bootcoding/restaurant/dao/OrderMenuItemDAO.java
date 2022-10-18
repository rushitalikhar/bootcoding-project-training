package com.bootcoding.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderMenuItemDAO {
    public static final String TABLE_NAME = "app_order_menu_item";
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

            String query = "CREATE TABLE IF  NOT EXISTS " + TABLE_NAME
                    + " ( id bigint NOT NULL , "
                    + " order_id bigint , "
                    + " quantity int , "
                    + " is_veg bool, "
                    + " menu_item_name text, "
                    + " total_price decimal, "
                    + " CONSTRAINT app_order_menu_item_pk PRIMARY KEY (id))";

            System.out.println(" Create Table Query : " + query);
            stmt.executeUpdate(query);

            ResultSet rs = stmt.executeQuery(sql);

            //5.traverse resultset (data)
            while (rs.next()){

                System.out.println(" = " + rs.getString("menu_item_name"));
                System.out.println(" = " + rs.getString("quantity"));
                System.out.println(" = " + rs.getString("total_price"));


            }


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}

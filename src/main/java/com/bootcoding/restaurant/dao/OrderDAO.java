package com.bootcoding.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderDAO {
    public static final String TABLE_NAME = "customer_order";
    public void crateTable(){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1404vinrush");
            Statement stmt = con.createStatement();
            String sql = "Select * from " + TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println("Total Amount = " + rs.getString("total_amount"));
                System.out.println("Order Date = " + rs.getString("order_date"));
                System.out.println("Status = " + rs.getString("status"));
                System.out.println("Delivery Address = " + rs.getString("delivery_address"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
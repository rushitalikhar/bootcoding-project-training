package com.bootcoding.restaurant.app;

import com.bootcoding.restaurant.Customer;
import com.bootcoding.restaurant.Order;
import com.bootcoding.restaurant.OrderMenuItem;
import com.bootcoding.restaurant.dao.CustomerDAO;
import com.bootcoding.restaurant.dao.OrderDAO;
import com.bootcoding.restaurant.dao.OrderMenuItemDAO;
import com.bootcoding.restaurant.dao.VendorDAO;
import com.bootcoding.restaurant.vendor;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        Customer rushita = new Customer();

        rushita.setName("Rushita");
        rushita.setCity("Nagpur");
        rushita.setAddress("New Nandanwan Nagpur");
        rushita.setState("Maharashtra");
        rushita.setEmailId("rushitalikhar18@gmail.com");
        rushita.setPhoneNumber(9284813754L);

        System.out.println("Name : " + rushita.getName());
        System.out.println("City : " + rushita.getCity());
        System.out.println("Address : " + rushita.getAddress());
        System.out.println("State : " + rushita.getState());
        System.out.println("EmailId : " + rushita.getEmailId());
        System.out.println("Phone : " + rushita.getPhoneNumber());

        vendor haldiram = new vendor();
        haldiram.setName("Haldiram veg Restaurant");
        haldiram.setAddress("Ajni Square, Nagpur");
        haldiram.setRating(5.0);
        haldiram.setState("maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Vendor Details:");
        System.out.println("Name : "+ haldiram.getName());
        System.out.println("Address : " + haldiram.getAddress());
        System.out.println("Category : " + haldiram.getCategory());
        System.out.println("Rating : " + haldiram.getRating());
        System.out.println("State : " + haldiram.getState());
        System.out.println("City : " + haldiram.getCity());

        Order order = new Order();
        order.setCustomer(rushita);
        order.setVendor(haldiram);
        order.setTotalAmount(999.0);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("101, Civil Line, Nagpur");

        System.out.println("Order Details : ");
        System.out.println("Total Amount: " + order.getTotalAmount());
        System.out.println("Orer Date : " + order.getOrderDate());
        System.out.println("Order Delivery Address : " + order.getDeliveryAddress());

        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.createTable();

        VendorDAO vendorDAO = new VendorDAO();
        vendorDAO.createTable();

        OrderDAO orderDAO = new OrderDAO();
        orderDAO.crateTable();

        OrderMenuItemDAO orderMenuItemDAO = new OrderMenuItemDAO();
        orderMenuItemDAO.createTable();
    }
}

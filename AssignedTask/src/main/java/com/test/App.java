package com.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction t = session.beginTransaction();

        // Create products
        Product p1 = new Product();
        p1.setP_name("Laptop");
        p1.setBrand("Dell");
        p1.setCategory("Electronics");
        p1.setPrice(55000);
        p1.setSku("SKU-001");

        Product p2 = new Product();
        p2.setP_name("Shoes");
        p2.setBrand("Nike");
        p2.setCategory("Fashion");
        p2.setPrice(4999);
        p2.setSku("SKU-002");

        // Create user
        User user = new User();
        user.setU_name("Arnam");
        user.setEmail("arnam@test.com");
        user.setPhone("9999999999");
        user.setCity("Bangalore");

        // Create address
        Address address = new Address();
        address.setStreet("MG Road");
        address.setArea("Central");
        address.setCity("Bangalore");
        address.setPincode("560001");
        address.setCountry("India");
        address.setUser(user);
        user.setAddress(address);

        // Create order
        Order order = new Order();
        order.setO_name("Online Purchase");
        order.setO_price("60000");
        order.setStatus("Paid");
        order.setCreatedOn("2026-03-26");
        order.setPaymentType("UPI");

        order.setUser(user);
        order.setProducts(Arrays.asList(p1, p2));

        user.setOrders(Arrays.asList(order));

        session.persist(user);

        t.commit();
        session.close();

        System.out.println("✅ Hibernate project executed successfully.");
    }
}
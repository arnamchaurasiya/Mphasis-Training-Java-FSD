package com.test;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class StoreData {
	
	public static void main(String[] args) {
//		Configuration cfg = new Configuration();
		
//		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = HibernateUtil.getSessionFactory();		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		
		Customers cus =new Customers();
		
		cus.setCus_name("Jay");
		cus.setCus_details("Watches");
		cus.setCus_city("Mumbai");
		
		session.persist(cus);
		
		t.commit();
		
		List<Customers> list = session.createQuery("from Customers", Customers.class).list();
		list.forEach(dt->System.out.println(dt.getid()+" "+ dt.getCus_name()+" "+dt.getCus_details()+" "+dt.getCus_city()));
		
		System.out.println("Done");
		
		
		session.close();
		
	}

}
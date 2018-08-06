package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		laptop l1=new laptop();
		l1.setLid(102);
		l1.setBrandName("hp");
		l1.setPrice(52000.00);
		
		Transaction tx=session.beginTransaction();
		tx.begin();
		
		session.save(l1);
		System.out.println("successfully inserted one row");
		
		tx.commit();
	}

}

package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteARow {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		tx.begin();
		
		laptop lt1=(laptop)session.get(laptop.class,102);
		
		session.delete(lt1);
		
		tx.commit();
		System.out.println("Successfully deleted a row");
	}

}

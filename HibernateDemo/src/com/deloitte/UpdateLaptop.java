package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateLaptop {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
			
		Transaction tx=session.beginTransaction();
		tx.begin();
		
		laptop lt1=(laptop)session.get(laptop.class, 101);
		lt1.setBrandName(lt1.getBrandName()+" India");
		session.update(lt1);
		
		tx.commit();
		System.out.println("Successfully updated");
	}

}

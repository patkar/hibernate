package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		passport pp=new passport();
		pp.setPpid(1);
		pp.setPpname("India");
		
		persons p=new persons();
		p.setName("Arvind");
		p.setPid(1);
		p.setPp(pp);
		
		Transaction tx=session.beginTransaction();
		session.save(pp);
		session.save(p);
		tx.commit();
		System.out.println("done");
		

	}

}

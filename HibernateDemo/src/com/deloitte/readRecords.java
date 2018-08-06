package com.deloitte;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class readRecords {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
			
		Query query=session.createQuery("from com.deloitte.laptop");
		List<?> listobj=query.list();
		
		Iterator<?> it=listobj.iterator();
		while(it.hasNext())
		{
			laptop lt=(laptop)it.next();
			System.out.println(lt.getLid()+" "+lt.getBrandName()+" "+lt.getPrice());
		}
	}

}

package com.deloitte;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class WhereCondition {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		
		Criteria c=session.createCriteria(laptop.class);
		c.add(Restrictions.gt("price", 100000.00));
		
		List<?> listobj=c.list();
		Iterator<?> it=listobj.iterator();
		while(it.hasNext())
		{
			laptop lt=(laptop)it.next();
			System.out.println(lt.getLid()+" "+lt.getBrandName()+" "+lt.getPrice());
		}
	}

}

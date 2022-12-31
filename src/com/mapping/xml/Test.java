package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Person p = new Person(1, "Ajaz", "Mumbai", "9930672571");
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		s.save(p);
		tx.commit();
		s.close();
		f.close();

	}

}

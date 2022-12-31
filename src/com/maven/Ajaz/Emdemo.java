package com.maven.Ajaz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emdemo {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		student s1 = new student();
		s1.setId(123);
		s1.setName("Mohammad Ajaz Shaikh");
		s1.setCity("Mumbai");
		
		student s2 = new student();
		s1.setId(145);
		s1.setName("Shaikh");
		s1.setCity("Tanda");
		
		
		Certificate c = new Certificate();
		c.setCourse("Java Development");
		c.setDuration("2 Months");
		s1.setCerti(c);
		
		Certificate c1 = new Certificate();
		c.setCourse("ASP.net");
		c.setDuration("1 Months");
		s2.setCerti(c1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//Saving the Object
		session.save(s1);
		//session.save(c);
		
		tx.commit();
		session.close();
		
		
		
		factory.close();

	}
	

}

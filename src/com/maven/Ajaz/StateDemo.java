package com.maven.Ajaz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {
	
	public static void main(String[] args) {
		
		//Practical of Hibernate Object States
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		//1. Transient State
		
		//Creating object of the Student which is not connected with database
		
		student s = new student();
		s.setId(1212);
		s.setName("Faizan");
		s.setCity("Doha,Qatar");
		s.setCerti(new Certificate("Java Hibernate Course","1 week"));
		
		
		//2. Persistent state
		Session session = f.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		s.setName("Ajaz");
		tx.commit();
		
		//3. Detached State
		
		
		//4. Removed State
		session.close(); //It will close the session data will present in the database
		s.setName("Guddu");
		System.out.println(s);
		f.close();
	}

}

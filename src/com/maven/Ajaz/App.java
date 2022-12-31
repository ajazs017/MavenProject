package com.maven.Ajaz;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws IOException{
		System.out.println("Project Started");
		
		//SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Configuration cfg  =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		student st = new student();
		st.setId(10);
		st.setName("Mohammad");
		st.setCity("Dubai"); 
		
		
		System.out.println(st);
		
		//Creating object of Address class
		
		Address ad = new Address();
		ad.setStreet("Bhendi Bazar");
		ad.setCity("Mumbai");
		ad.setisOpen(true);
		ad.setX(234566);
		ad.setAddedDate(new Date());
		
		FileInputStream fis = new FileInputStream("src/ajaz.jpg");
		byte[] b = new byte[fis.available()];
		fis.read(b);
		ad.setImage(b);
		
		
		//Opening and closing of session
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		session.save(ad);
		tx.commit();
		
		session.close();
		System.out.println("Done...");
		
		
		
	}

}

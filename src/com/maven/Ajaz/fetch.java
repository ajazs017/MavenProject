package com.maven.Ajaz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetch {
	public static void main(String[] args) {
		Configuration cfg  =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Session session = factory.openSession();
		
		student student = (student)session.get(student.class, 1);
		System.out.println(student);
		
		Address address = session.get(Address.class, 1);
		System.out.println(address);
		System.out.println(address.getStreet()+ ":"+address.getCity());
		
		session.close();
		factory.close();
	}

}

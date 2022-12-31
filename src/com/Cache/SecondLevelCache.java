package com.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.maven.Ajaz.student;

public class SecondLevelCache {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		
		Session s1 = f.openSession();
		student st = s1.get(student.class, 1);
		System.out.println(st);
		s1.close();
		
		Session s2 = f.openSession();
		student st2 = s2.get(student.class, 1);
		System.out.println(st2);
		s2.close();
		
		
		
		f.close();
	
	}

}

package com.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.maven.Ajaz.student;

public class FirstLevelCache {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		student st = s.get(student.class, 4);
		System.out.println(st);
		
		System.out.println("After adding the Cache");
		
		student st1 = s.get(student.class, 4);
		System.out.println(st1);
		
		System.out.println(s.contains(st1));
		
		student st2 = s.get(student.class, 1);
		System.out.println(st2);
		
		student st3 = s.get(student.class, 1);
		System.out.println(st3);
		
		
		
		s.close();
		factory.close();
	}

}

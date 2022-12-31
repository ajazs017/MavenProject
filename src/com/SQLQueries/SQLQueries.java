package com.SQLQueries;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.maven.Ajaz.student;

public class SQLQueries {

	public static void main(String[] args) {
		SessionFactory f = new Configuration().configure().buildSessionFactory();
		Session s = f.openSession();
		
		String q ="select * from student";
		NativeQuery nq = s.createSQLQuery(q);
		
		List<Object[]> l = nq.list();
		
		for(Object[] student: l)
		{
			System.out.println(student[2]+" "+student[4]);
		}
		
		s.close();
		f.close();
	}

}

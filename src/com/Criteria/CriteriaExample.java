package com.Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.mapping.xml.Person;
import com.maven.Ajaz.student;

public class CriteriaExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		 Session s = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Criteria c = s.createCriteria(student.class);
		//c.add(Restrictions.eq("certi.course", "spring"));
		c.add(Restrictions.isNull("Java"));
		List<student> l = c.list();
		for(student st:l)
		{
			System.out.println(l);
		}
		
		
		
		s.close();

	}

}

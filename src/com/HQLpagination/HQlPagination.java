package com.HQLpagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.maven.Ajaz.student;

public class HQlPagination {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		 Query q = s.createQuery("from student");
		 
		 //Pagination in hibernate
		 
		 q.setFirstResult(1);
		 q.setMaxResults(4);
		 
		 List<student> l = q.list();
		 
		 for(student st:l)
		 {
			System.out.println(st.getId()+" :"+st.getName()+" :"+st.getCity()); 
		 }
		 
		 
		 
		 
		
		s.close();
		factory.close();
	}

}

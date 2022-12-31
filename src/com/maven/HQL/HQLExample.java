package com.maven.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.maven.Ajaz.student;

public class HQLExample {
	public static void main(String[] args) {
		Configuration cfg  =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		
		String query = "from student as s where s.city=:x and s.name=:n";
		Query q = s.createQuery(query);
		 q.setParameter("x","Mumbai");
		 q.setParameter("n","Shaikh");
		//System.out.println(s1);
		
		List<student> l = q.list();
		
		  for (student st:l) 
		  { 
			  System.out.println(st.getName()+" "+st.getCity());
		  System.out.println(); 
		  }
		  
		  //Delete Query
		  System.out.println("------------------------------------------");
		  Transaction tx = s.beginTransaction();
//		  Query q2 = s.createQuery("delete from student as s where s.city=:c");
//		  q2.setParameter("c", "Kurla");
//		  int r = q2.executeUpdate();
//		  System.out.println("Delete");
//		  System.out.println(r);
		  
		  //Update Query
		  Query q3 = s.createQuery("update student set city=:c where name=:n");
		  q3.setParameter("c", "Dubai");
		  q3.setParameter("n", "Ajaz,Faizan");
		//  q3.setParameter("n", "Faizan");
		//  q3.setParameter("n", "Shaikh");
		  
		  int r2 = q3.executeUpdate();
		  System.out.println("Updated");
		  System.out.println(r2);
		  
		  
		  tx.commit();
		 
		s.close();
		factory.close();
	}

}

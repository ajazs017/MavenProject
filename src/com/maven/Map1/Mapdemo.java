package com.maven.Map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapdemo {
	public static void main(String[] args) {
	Configuration cfg = new	Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	
	//Creating object of the Emp class
	Emp e1 = new Emp();
	Emp e2 = new Emp();
	
	e1.setEid(7);
	e1.setName("Ajaz");
	
	e2.setEid(10);
	e2.setName("Mohd");
	
	
	//Creating object of the Product class
	Product p1 = new Product();
	Product p2 = new Product();
	
	p1.setPid(17);
	p1.setPname("Library Managaement System");
	
	p2.setPid(110);
	p2.setPname("Flight rerservation system");
	
	//Creating object of the list
	List<Emp> list1 = new ArrayList<Emp>();
	List<Product> list2 = new ArrayList<Product>();
	
	list1.add(e1);
	list1.add(e2);
	
	list2.add(p1);
	list2.add(p2);
	
	e1.setProd(list2);
	p2.setEmp(list1);
	
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();

	s.save(e1);
	s.save(e2);
	s.save(p1);
	s.save(p2);
	
	tx.commit();
	s.close();
	

	
	
	
	
	factory.close();
	}

}

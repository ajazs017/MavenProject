package com.maven.Map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

//		// Creating object of the Question class
//		Question q = new Question();
//		q.setQuestionID(11);
//		q.setQuestion("What is Java?");
//
//		// Creating object of the Answer class
//		answer a = new answer();
//		a.setAnswerid(224);
//		a.setAnswer("Java is a programming language");
//		a.setQuestion_id(q);
//		
//		answer a2 = new answer();
//		a2.setAnswerid(22);
//		a2.setAnswer("With the help of java we create softwares");
//		a2.setQuestion_id(q);
//		
//		answer a3 = new answer();
//		a3.setAnswerid(4);
//		a3.setAnswer("Robust");
//		a3.setQuestion_id(q);
//		
//		//Creating object of the List to store the answer
//		List<answer> list =new ArrayList<answer>();
//		list.add(a);
//		list.add(a2);
//		list.add(a3);
//		
//		q.setAnswers(list);

		
		// Session
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
//		s.save(q);
//		s.save(a);
//		s.save(a2);
//		s.save(a3);

		
		Question q  = (Question)s.get(Question.class, 11);
		System.out.println(q.getQuestion());
		
		for(answer a:q.getAnswers())
		{
			System.out.println(a.getAnswer());
		}
//		
		tx.commit();
		
		s.close();

		factory.close();
	}

}

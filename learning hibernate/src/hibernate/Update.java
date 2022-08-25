package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Car c = new Car();
		c.setOwner("shahil");
		c.setCar("creta");
		c.setSl(5);
		s.update(c);
		t.commit();
		s.close();
		System.out.println("Data is updated");
		
		
		
	}
}

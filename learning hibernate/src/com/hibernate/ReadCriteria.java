package com.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ReadCriteria {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Criteria cr = s.createCriteria(Car.class);
		List<Car> l = cr.list();
		System.out.println(l);
		for(Car c :l) {
			System.out.println(c);
		}
	}

}

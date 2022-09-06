package com.hibernate;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ConditionCriteria {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Criteria cr = s.createCriteria(Car.class);
		//cr.add(Restrictions.in("owner", "lokesh"));
		//cr.add(Restrictions.between("sl",2,4));
		//cr.add(Restrictions.eq("car", "ferrari"));
		//cr.add(Restrictions.ge("sl", 3));
		//cr.add(Restrictions.lt("sl",5 ));
		//cr.add(Restrictions.ne("sl", 5));
		List<Car> c = cr.list();
		//System.out.println(c.isEmpty());
		System.out.println(c);
		t.commit();
		s.close();
		
	}

}

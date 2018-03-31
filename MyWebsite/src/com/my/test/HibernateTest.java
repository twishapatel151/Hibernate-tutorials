package com.my.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.my.api.UserDetails;

public class HibernateTest {
	public static void main(String[] args) {
		UserDetails userdtls=new UserDetails();
		userdtls.setUid(3);
		userdtls.setUname("Binal");
		userdtls.setPassword("Binal123");
		userdtls.setEmail("binal@gmail.com");
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		session.beginTransaction();
		session.save(userdtls);
		session.getTransaction().commit();
		
	}
	
}

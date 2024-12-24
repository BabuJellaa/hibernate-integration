package com.tech.hbm.HibernateAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OperationConnections {
	public static void main(String[] args) {
		
		//creating configuration object  
		Configuration configuration= new Configuration();
		configuration.configure("com/tech/hbm/HibernateAnnotation/hibernatemapping.xml");  //populates the data of the configuration file  
		
		// creating session factory object
		SessionFactory factory = configuration.buildSessionFactory();
		
		//creating session object
		Session session = factory.openSession();
		
		//creating transaction object
		Transaction transaction = session.beginTransaction();
		
		UserData data= new UserData();
		data.setId(1);
		data.setName("Babu");
		data.setSurname("Jella");
		data.setCity("Siddipet");
		
		// persisting/saving the object
		session.persist(data);
		transaction.commit(); //transaction committed.
		System.out.println("Data Saved succesfully......");
		factory.close();
		session.close();
		
	}

}

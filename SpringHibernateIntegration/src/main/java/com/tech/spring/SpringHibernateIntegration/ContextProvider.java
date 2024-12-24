package com.tech.spring.SpringHibernateIntegration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextProvider {
	private static ApplicationContext applicationContext;
	
	public static ApplicationContext provideContext() {
		if(applicationContext==null) {
			applicationContext=new ClassPathXmlApplicationContext("com/tech/spring/SpringHibernateIntegration/SpringHbIntegration.xml");
		}
		return applicationContext;
	}
}

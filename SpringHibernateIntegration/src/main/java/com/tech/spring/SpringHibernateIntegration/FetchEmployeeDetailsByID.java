package com.tech.spring.SpringHibernateIntegration;

import org.springframework.context.ApplicationContext;

public class FetchEmployeeDetailsByID {
	public static void main(String[] args) {
		ApplicationContext applicationContext=ContextProvider.provideContext();
		EmployeeDao dao=applicationContext.getBean("employeeDao",EmployeeDao.class);
		Employee employee=dao.getDetailsByID(1);
		System.out.println(employee.getName()+" "+employee.getId()+" "+employee.getCity());
	}
}

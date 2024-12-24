package com.tech.spring.SpringHibernateIntegration;

import org.springframework.context.ApplicationContext;

public class InsertEmployeeDetails {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=ContextProvider.provideContext();
		
		EmployeeDao dao=applicationContext.getBean("employeeDao",EmployeeDao.class);
		Employee employee= new Employee(3,"Ajay Durgam","Bangalore");
		dao.insertintoDB(employee);
		
	}
}

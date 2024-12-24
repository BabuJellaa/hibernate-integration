package com.tech.spring.SpringHibernateIntegration;

import org.springframework.context.ApplicationContext;

public class DeleteEmployeeDetailsByID {
	public static void main(String[] args) {
		ApplicationContext applicationContext=ContextProvider.provideContext();
		
		EmployeeDao dao= applicationContext.getBean("employeeDao",EmployeeDao.class);
		dao.deleteByID(3);
	}
}

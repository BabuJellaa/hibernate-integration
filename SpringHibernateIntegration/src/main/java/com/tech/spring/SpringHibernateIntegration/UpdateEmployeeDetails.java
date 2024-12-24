package com.tech.spring.SpringHibernateIntegration;

import org.springframework.context.ApplicationContext;

public class UpdateEmployeeDetails {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=ContextProvider.provideContext();
		EmployeeDao dao=(EmployeeDao)applicationContext.getBean("employeeDao");
		
		Employee employee= dao.getDetailsByID(3);
		employee.setCity("Bangalore");
		dao.update(employee);
	}
}

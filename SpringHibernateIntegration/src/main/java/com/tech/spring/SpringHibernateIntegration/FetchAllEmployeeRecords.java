package com.tech.spring.SpringHibernateIntegration;

import java.util.List;

import org.springframework.context.ApplicationContext;

public class FetchAllEmployeeRecords {
	public static void main(String[] args) {
		ApplicationContext applicationContext=ContextProvider.provideContext();
		
		EmployeeDao dao=applicationContext.getBean("employeeDao",EmployeeDao.class);
		List<Employee> employees=dao.getAllEmployeeDetails();
		for(Employee employee : employees) {
			System.out.println(employee.getName()+" "+employee.getId()+" "+employee.getCity());
		}
	}
}

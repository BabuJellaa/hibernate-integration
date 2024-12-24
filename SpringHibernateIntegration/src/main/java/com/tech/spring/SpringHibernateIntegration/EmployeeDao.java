package com.tech.spring.SpringHibernateIntegration;

import java.util.List;

public interface EmployeeDao {
	public int insertintoDB(Employee employee);
	public void deleteByID(int id);
	public Employee getDetailsByID (int id);
	public void update(Employee employee);
	public List<Employee> getAllEmployeeDetails();
}

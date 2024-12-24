package com.tech.spring.SpringHibernateIntegration;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDaoImpl implements EmployeeDao{
	HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	@Transactional
	public int insertintoDB(Employee employee) {
		int details= (int) hibernateTemplate.save(employee);
		System.out.println("Inserted into DB Successfully..!!");	
		return details;
	}

	@Override
	@Transactional
	public void deleteByID(int id) {
		Employee employee=hibernateTemplate.get(Employee.class,id);
		hibernateTemplate.delete(employee);
		System.out.println("Successfully deleted employee record having id :"+id);
	}

	@Override
	@Transactional
	public Employee getDetailsByID(int id) {
		Employee employee= hibernateTemplate.get(Employee.class, id);
		System.out.println("Employee details by Id : "+employee.getName());
		return hibernateTemplate.get(Employee.class, id);
	}

	@Override
	@Transactional
	public void update(Employee employee) {
		 hibernateTemplate.update(employee);
		 System.out.println("Employee details updated successfully...!!!");
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> employees= hibernateTemplate.loadAll(Employee.class);
		System.out.println("Fetching all the employee details..."+employees);
		return employees;
	}
	
	
}

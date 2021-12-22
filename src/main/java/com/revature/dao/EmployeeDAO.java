package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Employee;
import com.revature.util.HibernateUtil;

public class EmployeeDAO {
	public int insert(Employee e) {
		Session ses = HibernateUtil.getSession();

		Transaction tx = ses.beginTransaction();

		int pk = (int) ses.save(e);

		tx.commit();

		return pk;
	}

	public List<Employee> findAll() {
		Session ses = HibernateUtil.getSession();
		// HQL Hibernate Query Language
		List<Employee> emps = ses.createQuery("From Employee", Employee.class).list();

		return emps;
	}
	
	public boolean update(Employee e) {
		return false;
	}
	
	public boolean delete(Employee e) {
		return false;
	}
	
}
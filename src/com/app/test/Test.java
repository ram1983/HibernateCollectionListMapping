package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		Session ses=HibernateUtil.getSf().openSession();
		Transaction tx=ses.beginTransaction();
		
		Employee emp= new Employee();
		emp.setEmpId(101);
		emp.setEmpName("Ajay");
		emp.setEmpSal(120.12);
		
		emp.getStdData().add("D1");
		emp.getStdData().add("D2");
		emp.getStdData().add("D3");
		ses.save(emp);
		tx.commit();
		ses.close();
	}
}

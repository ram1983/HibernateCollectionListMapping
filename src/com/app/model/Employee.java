package com.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "emptab")
public class Employee {

	@Id
	@Column(name = "eid")
	private int empId;

	@Column(name = "ename")
	private String empName;

	@Column(name = "esal")
	private double empSal;

	@ElementCollection
	@CollectionTable(name = "emp_details", joinColumns = @JoinColumn(name = "sid"))
	@OrderColumn(name = "pos")
	@Column(name = "Data")
	private List<String> stdData = new ArrayList<>();

	public Employee() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public List<String> getStdData() {
		return stdData;
	}

	public void setStdData(List<String> stdData) {
		this.stdData = stdData;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", stdData=" + stdData
				+ "]";
	}

}

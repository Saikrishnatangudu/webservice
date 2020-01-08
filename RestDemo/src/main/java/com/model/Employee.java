package com.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement
public class Employee implements Serializable {
	private String empname;
	private int empNo;
	
	private List<Employee> employees;

	public Employee() {
		super();

	}

	public Employee(String empname, int empNo) {
		super();
		this.empname = empname;
		this.empNo = empNo;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

}

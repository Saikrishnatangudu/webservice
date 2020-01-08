package com.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "employeerest")
public class Employee implements Serializable {
	private String empName;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empNo;

	public Employee() {
		super();

	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public Employee(String empName, int empNo) {
		super();
		this.empName = empName;
		this.empNo = empNo;
	}

}
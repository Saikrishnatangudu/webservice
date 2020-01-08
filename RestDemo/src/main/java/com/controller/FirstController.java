package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.omg.CORBA.Request;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;

@RestController
public class FirstController {
	@GetMapping(value = "/first") // URI
	public String fun() {
		return "WELCOME TO RESTFULL SERVICE";
	}

	@GetMapping(value = "/read")
	public Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmpname("saikrishna");
		employee.setEmpNo(51836162);
		return employee;
	}

	@GetMapping(value = "/second/{EmpNo}")
	public Employee firstPage(@PathVariable int EmpNo) {
		if (EmpNo > 0) {
			Employee employee = new Employee();
			if (EmpNo == 22) {
				employee.setEmpname("saikrishna");
				employee.setEmpNo(22);
			}
			if (EmpNo == 23) {
				employee.setEmpname("krishna");
				employee.setEmpNo(23);
			}
			if (EmpNo == 24) {
				employee.setEmpname("sk");
				employee.setEmpNo(24);
			}
			if (EmpNo == 25) {
				employee.setEmpname("sai");
				employee.setEmpNo(25);
			}
			return employee;
		} else {
			return null;
		}

	}

	@GetMapping(value="/readall",produces = { MediaType.APPLICATION_XML_VALUE })

	public List<Employee> getEmployees() {
		// egarloading
		// List<Employee> employees = new ArrayList<Employee>();

		Employee employee1 = new Employee("sai", 10);
		Employee employee2 = new Employee("krishna", 20);
		Employee employee3 = new Employee("venkat", 30);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);

		return employees;

	}
	@PostMapping(value="/create")
	public  Employee createOperation(@RequestBody Employee employee){
		System.out.println("recevied emp no:"+employee.getEmpNo());
		System.out.println("recevied emp name:"+employee.getEmpname());
		
		employee.setEmpname("created jdslkdj");
		System.out.println("recevied emp name:"+employee.getEmpname());
		return employee;
		
	}
	
	
	@PostMapping(value="/update")
	public  Employee updateOperation(@RequestBody Employee employee){
		System.out.println("recevied emp no:"+employee.getEmpNo());
		System.out.println("recevied emp name:"+employee.getEmpname());
		
		employee.setEmpname("created jdslkdj");
		System.out.println("recevied emp name:"+employee.getEmpname());
		return employee;
		
	}
	
	
	@DeleteMapping(value="/delete")
	public  String deleteOperation(@RequestBody Employee employee){
		System.out.println("recevied emp no:"+employee.getEmpNo());
		System.out.println("recevied emp name:"+employee.getEmpname());
		
		employee.setEmpname("created jdslkdj");
		System.out.println("recevied emp name:"+employee.getEmpname());
		return "Deleted"+employee.getEmpname();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

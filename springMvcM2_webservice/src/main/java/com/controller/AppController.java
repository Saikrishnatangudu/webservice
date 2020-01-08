package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.Student;

@Controller
@RequestMapping(value = "street")
public class AppController {
	@GetMapping(value = "/first")
	public String functionOne() {

		return "success";

	}

	@GetMapping(value = "/")
	public String welcome() {

		return "index";

	}

	@GetMapping(value = "/second/{userName}")
	public String firstPage(@PathVariable String userName, Model model) {
		Student student = new Student();
		student.setStuId(51836162);
		student.setStuName("saikrishna");
		
		model.addAttribute("key1", userName);
		model.addAttribute("key2",student);
		return "second";

	}

}

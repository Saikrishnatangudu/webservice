package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Customer;

@Controller
public class ValidationController {
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(){
		return "index";
	}
	
	
	
	
	private Map<String, Customer> customers = null;
//constructor
	public ValidationController() {
		customers = new HashMap<String, Customer>();
	}
//return new jsp page
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String saveCustomerPage(Model model) {

		model.addAttribute("customer", new Customer());
		return "custSave";
	}
//validate and save
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCustomerAction(@Valid Customer customer, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {

			return "custSave";
		}

		model.addAttribute("customer", customer);
	//	customers.put(customer.getEmail(), customer);
		return "custSaveSuccess";

	}
}

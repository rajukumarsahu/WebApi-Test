package com.nareshit.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nareshit.raghu.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
//1 Show employee register page
@GetMapping("/register")
	public String showEmp() {
		return "EmpRegister";
	}
	
	//2 read form data on click submit
@PostMapping("/create")
public String ReadFormData(@ModelAttribute Employee employee,Model model) {
	
	System.out.println("Model Data is:-"+employee);
	model.addAttribute("Obj",employee);
	return "EmpSucess";
}



}

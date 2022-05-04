package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/showform")
	public String showForm() {
		return "addemp";
	}
	
//	@RequestMapping("/addEmployee")
//	public String addEmploy(@RequestParam("name") String name,
//			@RequestParam("employeeId")int employeeId,
//			@RequestParam("city")String city,
//			@RequestParam("department")String department, ModelMap map) {
//				
//		Employee employee = new Employee();
//		employee.setName(name);
//		employee.setEmployeeId(employeeId);
//		employee.setCity(city);
//		employee.setDepartment(department);
//		
//		map.addAttribute("employee", employee);
//		
//		return "success";
//		
//	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee,Model model) {
		model.addAttribute("employee", employee);
		return "success";
	}
}

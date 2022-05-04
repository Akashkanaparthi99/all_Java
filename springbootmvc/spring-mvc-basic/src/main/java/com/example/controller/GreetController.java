package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
	@RequestMapping("/hello")
	public String sayHello(Model model) {
		// model is an interface
		// create the data usually this is the data from the backend
		String message = "Hello ! How are you?";
		// attach this data to a model 
		// set the value in the interface using a dummy name (first parameter )
		//second parameter is the original data
		// this can be retrieved in success.jsp page using the dummy mymessage
		model.addAttribute("message",message);
		return "success";	// this is the name of the jsp page not the data
	}
	@RequestMapping("/welcome")
	public String sayWelcome(ModelMap model) {
		
		model.addAttribute("message","Welcome to My new Page ...!");
		return "success";
	}
	
	@RequestMapping("/greet")
	public ModelAndView sayGreet() {
		
		ModelAndView modelAndView  = new ModelAndView("success","message","Have a great day");
		
		return modelAndView;
	}

}

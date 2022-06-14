package com.uc.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/showForm")
	public String displayMessage() {
		return "home";
	}
	
	@RequestMapping("/SaveName")
	public String saveUserName() {
		return "UserForm";
	}
	
	@RequestMapping("/SaveName2")
	public String letSaveName(HttpServletRequest request, Model model) {
		String name=request.getParameter("s");
		name=name.toUpperCase();
		model.addAttribute("name",name);
		return "UserForm";
	}
}

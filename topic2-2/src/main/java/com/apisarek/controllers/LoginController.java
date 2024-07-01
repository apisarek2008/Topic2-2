package com.apisarek.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apisarek.models.LoginModel;

@Controller
@RequestMapping("/login")
public class LoginController {

	@GetMapping("/")
	public String displayLoginModel(Model model) {
		
		model.addAttribute("loginModel", new LoginModel());
		
		return "loginForm.html";
		
	}
}

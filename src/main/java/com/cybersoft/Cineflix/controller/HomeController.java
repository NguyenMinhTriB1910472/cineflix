package com.cybersoft.Cineflix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("")
	public ModelAndView home() {
		ModelAndView andView =new ModelAndView("home");
		int A=020;
		int B=30;
		int tong=tinhTong(A, B);
		andView.addObject("ketqua: ",tong);
		return andView;
	}
	
	private int tinhTong(int a,int b) {
		return a+b;
	}
}

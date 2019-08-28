package com.example.stockspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminControllerImpl {

	@RequestMapping(path="/importData")
	public String importData(Model model) throws Exception {
		
		return "importstock";
	}
	
}

package com.example.stockspring.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;

@RestController
public class RestControllerCompany {
	@Autowired
	CompanyDao companydao;
	

	
	@GetMapping("company/pattern/{namepattern}")
	public List<Company> findByNameWithPattern(@PathVariable String namepattern) {

		return companydao.findByNameWithPattern(namepattern);
		 
	}
	@GetMapping("updatedCompanyDetails")
	public List<Company> updateCompanyDetail(@PathVariable String namepattern) {

		return companydao.findByNameWithPattern(namepattern);
		 
	}
}


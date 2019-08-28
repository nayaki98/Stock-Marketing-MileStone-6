package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.IPODetailDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.IPODetail;

@RestController
public class RestControllerIPODetail {
	@Autowired
	IPODetailDao ipodetaildao;
	@Autowired
	CompanyDao companydao;
	
	@GetMapping("/ipodetails/{name}")
	public List<IPODetail> getIpoDetails(@PathVariable String name)
	{
		Company company=companydao.findBycompanyName(name);
		return ipodetaildao.findBycompanycode(company.getCompanyCode());
	}

}

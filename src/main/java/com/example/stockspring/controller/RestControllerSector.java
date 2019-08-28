package com.example.stockspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.SectorDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.Sector;

@RestController
public class RestControllerSector {
	@Autowired
	SectorDao sectordao;
	@Autowired
	CompanyDao companydao;
	
	@GetMapping("/sectordetails/{sectorname}")
	public List<Company> getSectorList(@PathVariable("sectorname") String sectorname)
	{
		Sector sector= sectordao.findBysectorName(sectorname);
		return companydao.findBySectorId(sector.getSectorId());
	}
	

}

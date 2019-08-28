package com.example.stockspring.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.dao.CompanyDao;
import com.example.stockspring.dao.StockPriceDao;
import com.example.stockspring.model.Company;
import com.example.stockspring.model.StockPrice;



@RestController
public class RestControllerStockPriceDetail {
	
	@Autowired
	StockPriceDao stockpricedao;
	@Autowired
	CompanyDao companydao;

	
	@GetMapping("/stockpricedetail/{companyCode}/{startdate}/{enddate}")
	public List<StockPrice> getStockPriceDetail(@PathVariable("companyCode") int companyCode,@PathVariable("startdate") Date startdate,@PathVariable("enddate") Date enddate)
	{
		return stockpricedao.findBydate1(companyCode,startdate,enddate);
	}
	
	@GetMapping("/stockprice/{sectorid}/{startdate}/{enddate}")
	public Double getStockPriceTotal(@PathVariable("sectorid") int sectorid,@PathVariable("startdate") Date startdate,@PathVariable("enddate") Date enddate)
	{
		
        Double sum=0.0;
        int i;
        int companyCode[]= companydao.findCompanycode1(sectorid);
       
        List<Double> stockPriceList=new ArrayList<>();
        for(i=0;i<companyCode.length;i++)
        {
           System.out.println(companyCode[i]);
           stockpricedao.findBycompanyCode(companyCode[i],startdate,enddate).forEach(stockPriceList::add);
        }
        
        for(Double price:stockPriceList)
        {
            sum=sum+price;
        }
        return sum;

		
	}
}
/*Company company=(Company) companydao.findBySectorId(sectorid);
return stockpricedao.findStockPriceTotal(company.getCompanyCode(),startdate,enddate);*/

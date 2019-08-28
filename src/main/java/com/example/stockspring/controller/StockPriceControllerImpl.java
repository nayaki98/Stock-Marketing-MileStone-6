package com.example.stockspring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockspring.model.StockPrice;
import com.example.stockspring.service.StockPriceService;

@Controller
public class StockPriceControllerImpl implements StockPriceController {

	@Autowired
	private StockPriceService stockPriceservice;
	
	
	@RequestMapping(path="/stockPriceDetail")
	public String insert(Model model) throws Exception {
		StockPrice stockprice=new StockPrice();
		model.addAttribute("stockpricedetail", stockprice);
		return "stockpricedetail";
	}
	@RequestMapping(value = "/stockpricedetailInsert", method = RequestMethod.POST)
	public String submit(@ModelAttribute("stockpricedetail") @Valid StockPrice stockprice, BindingResult result, Model model) {
		
		if(result.hasErrors()){
            
            return "stockpricedetail";
		}

		stockPriceservice.insertStockPriceDetail(stockprice);
		return "redirect:/userlandingstockpricedetail";
	}
	@RequestMapping(path="/userlandingstockpricedetail")
	public String userLanding(Model model) throws Exception {
		
		return "userlanding";
	}
	
}

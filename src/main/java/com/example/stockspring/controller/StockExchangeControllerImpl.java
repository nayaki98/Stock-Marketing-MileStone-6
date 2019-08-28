package com.example.stockspring.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.Company;
import com.example.stockspring.model.StockExchange;
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.StockExchangeService;


@Controller
public class StockExchangeControllerImpl implements StockExchangeController {
	
	@Autowired
	private StockExchangeService stockExchangeservice;
	
	@RequestMapping(path="/stockExchange")
	public String insert(Model model) throws Exception {
		StockExchange stockExchange=new StockExchange();
		model.addAttribute("stockExchange", stockExchange);
		return "stockexchange";
	}
	@RequestMapping(value = "/stockExchangeInsert", method = RequestMethod.POST)
	public String submit(@ModelAttribute("stockExchange") @Valid StockExchange stockExchange, BindingResult result, Model model) {
		
		if(result.hasErrors()){
            
            return "stockexchange";
		}

		stockExchangeservice.insertStockexchange(stockExchange);
		return "redirect:/stockExchangeList";
	}
	/*@RequestMapping(path="/userlandingstockExchange")
	public String userLanding(Model model) throws Exception {
		
		return "userlanding";
	}*/
	
	@RequestMapping(path="/stockExchangeList")
	public ModelAndView getstockExchangeList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stockexchangelist");
		mv.addObject("stockexchangelist",stockExchangeservice.getstockExchangeList());
		return mv;
	}
	@RequestMapping(path="/updateStockExchange")
	public ModelAndView updateStockExchage(@RequestParam("stockExchangeId") int stockExchangeId ,ModelMap map, HttpServletRequest request,
            @ModelAttribute("stockExchange") StockExchange stockexchange) throws ClassNotFoundException, SQLException {
			ModelAndView mav = null;
			stockexchange= stockExchangeservice.getStockExchangeId(stockExchangeId) ; 
              map.addAttribute("stockexchangeList",stockexchange);
              
              System.out.println(stockexchange);
              mav = new ModelAndView("updatestockexchange");
              return mav;

	}
	
	
	@RequestMapping(value = "/updatedStockExchangeDetail", method = RequestMethod.POST)
    public String updatedStockExchangeDetail(@ModelAttribute("stockExchange")@Valid StockExchange stockexchange,BindingResult result,Model model) throws SQLException {
           if(result.hasErrors()){
                  System.out.println("errors");
                  System.out.println(result.getAllErrors());
                  model.addAttribute("companyList",stockexchange );
                  return "updatestockexchange";
           }
           stockExchangeservice.updateStockExchange(stockexchange);
           return "redirect:/stockExchangeList";  
    }
	@RequestMapping(path="/deleteStockExchange")
	public ModelAndView deleteCompany(@RequestParam("stockExchangeId") int stockExchangeId ,ModelMap map, HttpServletRequest request,
	        @ModelAttribute("company") StockExchange stockexchange) throws ClassNotFoundException, SQLException {
			ModelAndView mav = null;
			stockExchangeservice.deleteById(stockExchangeId); 
	          mav = new ModelAndView("redirect:/stockExchangeList");
	          return mav;

	}
}

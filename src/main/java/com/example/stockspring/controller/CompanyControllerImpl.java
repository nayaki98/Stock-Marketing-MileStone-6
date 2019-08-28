package com.example.stockspring.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
import com.example.stockspring.service.CompanyService;
import com.example.stockspring.service.CompanyServiceImpl;

@Controller
public class CompanyControllerImpl implements CompanyController{

	
	@Autowired
	private CompanyService companyservice;
	
	
	public List<Company> getCompanyList() throws SQLException
	{
		return companyservice.getCompanyList();
		
	}
	
	

	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList1() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("listcompany");
		mv.addObject("companyList",companyservice.getCompanyList());
		return mv;
	}

	
	@RequestMapping(path="/company")
	public String insert(Model model) throws Exception {
		Company company=new Company();
		model.addAttribute("company", company);
		return "insertcompany";
	}
	
	@RequestMapping(value = "/insertCompany", method = RequestMethod.POST)
	public String submit(@ModelAttribute("company") @Valid Company company, BindingResult result, Model model) {
		
		if(result.hasErrors()){
            
            return "insertcompany";
		}

		companyservice.insertCompany(company);
		return "redirect:/companyList";
	}
	
	@RequestMapping(path="/compareCompany")
	public String userLanding(Model model) throws Exception {
		
		return "userlanding";
	}
	
	@RequestMapping(path="/updateCompany")
	public ModelAndView updateCompany(@RequestParam("companyCode") int companyCode ,ModelMap map, HttpServletRequest request,
            @ModelAttribute("company") Company company) throws ClassNotFoundException, SQLException {
			ModelAndView mav = null;
              company= companyservice.getCompanyId(companyCode) ; 
              map.addAttribute("companyList",company);
              
              System.out.println(company);
              mav = new ModelAndView("updatecompany");
              return mav;

	}
	
	
	@RequestMapping(value = "/updatedCompanyDetail", method = RequestMethod.POST)
    public String updatedCompanyDetail(@ModelAttribute("company")@Valid Company company,BindingResult result,Model model) throws SQLException {
           if(result.hasErrors()){
                  System.out.println("errors");
                  System.out.println(result.getAllErrors());
                  model.addAttribute("companyList",company );
                  return "updatecompany";
           }
           companyservice.updateCompany(company);
           return "redirect:/companyList";  
    }
	@RequestMapping(path="/deleteCompany")
	public ModelAndView deleteCompany(@RequestParam("companyCode") int companyCode ,ModelMap map, HttpServletRequest request,
	        @ModelAttribute("company") Company company) throws ClassNotFoundException, SQLException {
			ModelAndView mav = null;
			companyservice.deleteById(companyCode); 
	          mav = new ModelAndView("redirect:/companyList");
	          return mav;

	}
}

	/*@RequestMapping(value = "/updateCompany", method = RequestMethod.POST)
	public String updateCompany(@ModelAttribute("company") Model model) {
		
		companyservice.insertCompany(company);
		return "redirect:/companyList";
	}
*/





/*public boolean updateCompamy(int companyCode,String ceo) throws SQLException{
boolean result;
result=service.updateCompamy(companyCode, ceo);
return result;
}
public boolean removeCompanyDetails(int companycode) throws SQLException {
boolean result=service.removeCompanyDetails(companycode);
return result;

}*/

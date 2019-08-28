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
import com.example.stockspring.model.IPODetail;
import com.example.stockspring.service.IPODetailService;

@Controller
public class IPODetailControllerImpl implements IPODetailController {
	
	
	@Autowired
	private IPODetailService ipoService;


	
	@RequestMapping(path="/ipo")
	public String insertIPODetail(Model model) throws SQLException {
		IPODetail ipodetail=new IPODetail();
		model.addAttribute("ipo", ipodetail);
		return "ipodetail";
		
	}

	@RequestMapping(value = "/ipoInsert", method = RequestMethod.POST)
	public String submit(@ModelAttribute("ipo") @Valid IPODetail ipodetail, BindingResult result, Model model) throws SQLException {
		
		if(result.hasErrors()){
            
            return "ipodetail";
		}

		ipoService.insertIPODetail(ipodetail);
		
		return "redirect:/ipodetaillist";
	}
	/*@RequestMapping(path="/userlandingipo")
	public String userLanding(Model model) throws Exception {
		
		return "userlanding";
	}*/

	@RequestMapping(path="/ipodetaillist")
	public ModelAndView getIpodetailList() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("ipodetaillist");
		mv.addObject("ipodetaillist",ipoService.getIpodetailList());
		return mv;
	}

	@RequestMapping(path="/updateIpo")
	public ModelAndView updateIpo(@RequestParam("ipoId") int ipoId ,ModelMap map, HttpServletRequest request,
            @ModelAttribute("ipo") IPODetail ipodetail) throws ClassNotFoundException, SQLException {
			ModelAndView mav = null;
              ipodetail= ipoService.getipoId(ipoId) ; 
              map.addAttribute("ipoList",ipodetail);
              
              mav = new ModelAndView("ipoupdate");
              return mav;

	}
	@RequestMapping(value = "/updatedIpoDetail", method = RequestMethod.POST)
    public String updatedIpoDetail(@ModelAttribute("ipo")@Valid IPODetail ipodetail,BindingResult result,Model model) throws SQLException {
           if(result.hasErrors()){
                  System.out.println("errors");
                  System.out.println(result.getAllErrors());
                  model.addAttribute("ipoList",ipodetail );
                  return "ipoupdate";
           }
           ipoService.updateIpo(ipodetail);
           return "redirect:/ipodetaillist";  
    }
	@RequestMapping(path="/deleteIpo")
	public ModelAndView deleteIpo(@RequestParam("ipoId") int ipoId ,ModelMap map, HttpServletRequest request,
            @ModelAttribute("ipo") IPODetail ipodetail) throws ClassNotFoundException, SQLException {
			ModelAndView mav = null;
               ipoService.deleteById(ipoId) ; 
              
              
              mav = new ModelAndView("redirect:/ipodetaillist");
              return mav;

	}
	
}

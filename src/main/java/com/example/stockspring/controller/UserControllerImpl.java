package com.example.stockspring.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.stockspring.model.User;
import com.example.stockspring.service.UserService;

@Controller
public class UserControllerImpl implements UserController {

	@Autowired
	UserService userservice;


@RequestMapping(path="/loginUser")
public String loginUser(Model model) throws Exception {
	User user=new User();
	model.addAttribute("user", user);
	return "login";
}

@RequestMapping(value = "/login", method = RequestMethod.POST)
public ModelAndView submit(@ModelAttribute("user")  User user) {
	 ModelAndView mav = null;
	 String uname = user.getUserName();
	 List<User> user1 = userservice.findByuserName(uname);
	 User user2 = user1.get(0);
	 if ((user.getUserName().equals(user2.getUserName())) && (user.getPassword().equals(user2.getPassword()))) {

         if (user.getUserName().equals("Admin")) {
               mav = new ModelAndView("adminlanding");
         } else {
               mav = new ModelAndView("userlanding");
         }
  } else {

         mav = new ModelAndView("login", "message", "Invalid Username or Password");
  }

  return mav;

}

@RequestMapping(path="/signupUser")
public String signupUser(Model model) throws Exception {
	User user=new User();
	model.addAttribute("user", user);
	return "signup";
}
@RequestMapping(value = "/signup", method = RequestMethod.POST)
public String signup(@ModelAttribute("user") @Valid User user, BindingResult result,Model model) {
	if(result.hasErrors()){
        
        return "signup";
	}
	return "redirect:/loginUser";
	
}
@RequestMapping(path="/logoutUser")
public String logoutUser(Model model) throws Exception {
	
	return "userlanding";
}
@RequestMapping(path="/logoutAdmin")
public String logoutAdmin(Model model) throws Exception {
	
	return "adminlanding";
}


}

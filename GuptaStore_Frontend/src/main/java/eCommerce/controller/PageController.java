package eCommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import eCommerce.DAO.ProductDAO;
import eCommerce.model.UserDetail;

@Controller
public class PageController 
{
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/login")
		public String showLogin(Model m)
		{
		    m.addAttribute("pageinfo" , "Login");
			return "Login";
		}
	
	@RequestMapping({"/index","/"})
	public String showhome(Model m)
	{
	    
		return "index";
	}
	 
    @RequestMapping("/register")
		public String showRegister(Model m)
		{
    		m.addAttribute("user",new UserDetail());
    	    m.addAttribute("pageinfo" , "Register");
			return "Register";
		}

	@RequestMapping("/contactus")
		public String showContactUs(Model m)
		{
		    m.addAttribute("pageinfo" , "Contact Us");
			return "ContactUs";
		}

	@RequestMapping("/aboutus")
		public String showAboutUs(Model m)
		{
		    m.addAttribute("pageinfo" , "About Us");
			return "AboutUs";
		}

	


}

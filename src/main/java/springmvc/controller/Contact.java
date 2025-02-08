package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Contact {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("name") String userName, 
			@RequestParam("email") String email, 
			@RequestParam("passwd") String password,
			Model model) {
		
		// Setting data in Model object to send to view
		model.addAttribute("userName", userName);
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		
		return "success";
	}
}

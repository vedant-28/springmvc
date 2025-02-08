package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;

@Controller
public class Contact {
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
/* COMMENTED TO DEMONSTRATE USAGE OF @ModelAttribute BELOW
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(
			@RequestParam("name") String userName, 
			@RequestParam("email") String email, 
			@RequestParam("passwd") String password,
			Model model) {
		
		User user = new User();
		user.setUserName(userName);
		user.setEmail(email);
		user.setPassword(password);
		
		System.out.println(user);
		
		// Setting data in Model object to send to view
		model.addAttribute("user", user);
		
		return "success";
	}
*/
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		return "success";
	}
}

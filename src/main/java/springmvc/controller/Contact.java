package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class Contact {
	
	@Autowired
	private UserService userService;
	
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
		
		// Example for practical usage of redirect in spring MVC:
		// [if username is blank, then it'll be redirected to form again.]
		if(user.getUserName().isBlank()) {
			return "redirect:/contact";
		}
		
		this.userService.createUser(user);
		
		return "success";
	}
}

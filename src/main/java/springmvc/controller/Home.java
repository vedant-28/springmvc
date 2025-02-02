package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	// Return view name, when "/home" request is fired
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "ABC");
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
}

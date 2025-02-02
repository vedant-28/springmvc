package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("Id", "1001");
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}

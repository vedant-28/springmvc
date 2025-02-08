package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

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
		List<Integer> marks = new ArrayList<>();
		marks.add(100);
		marks.add(76);
		marks.add(69);
		
		modelAndView.addObject("Id", "1001");
		modelAndView.addObject("marks", marks);
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
}

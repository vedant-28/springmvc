package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("/first")
	public String first() {
		System.out.println("handler: first");
		
		return "redirect:/second";
	}
	
	@RequestMapping("/second")
	public String second() {
		System.out.println("handler: second");
		
		return "second";
	}
	
}

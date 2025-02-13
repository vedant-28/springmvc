package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

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
	
	@RequestMapping("/third")
	public RedirectView redirect() {
		System.out.println("handler: third");
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("second");
		
		return redirectView;
	}
	
}

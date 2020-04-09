package eu.andreirusu.daw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	
	@GetMapping("/hello-world")
	public String sayHello() {
		return "hello";
	}
	
	
	@GetMapping("/diana")
	public String helloDiana(Model model) {
		model.addAttribute("message", "Cea mai frumoasa fata... ");
		return "diana";
	}
}

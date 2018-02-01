package eduCAS.web;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/","/homepage"})
public class HomeController {
	@RequestMapping(method = GET)
	public String home(Model model) {
		model.addAttribute("title", "home");
		return "home";
	}
}

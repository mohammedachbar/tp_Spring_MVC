package Control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
	
@Controller
public class HelloWorldController {
	
	@RequestMapping("/index1")	
	public ModelAndView hello() {
		String msg = "Ma première Page Spring MVC";
		return new ModelAndView("hello", "message", msg);
	}
	
}

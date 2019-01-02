package control;
import modele.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ConnexionController {

	@RequestMapping(value = "/formConnexion", method = RequestMethod.GET)
	public ModelAndView connexion() {
			return new ModelAndView("formConnexion", "command", new User());
	}

	@RequestMapping(value = "/t_connexion", method = RequestMethod.POST)
	public String traitement(@ModelAttribute("pagePerso")User user, ModelMap model) {
			String page="";
			if(user.getLogin().equals("l") && user.getPass().equals("p")){
				page="pagePerso";
				model.addAttribute("login", user.getLogin());
				model.addAttribute("pass", user.getPass());
			}
			else{ 
				page="errorConnexion";
			}
				
		return page;
			
	}
}
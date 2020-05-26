package univ.tours.WeBuyWSApp.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import univ.tours.WeBuyWSApp.entity.User;
import univ.tours.WeBuyWSApp.service.UserAdminImplService;

@Controller
public class ApplicationController {

	@Autowired
	private UserAdminImplService UserAdminService;
	
	@RequestMapping("/login")
	public String login() {
		return "Login";
	}
	
	@RequestMapping("/UserPageAdmin")
	public String UserPage() {
		return "UserPage";
	}
	
	@RequestMapping("/isAdmin")
	public String checkIsAdmin(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request, ModelMap model) {
		System.out.println(user.getEmail());
		User u = new User();
		String errorMessage="";
		try{
			u = UserAdminService.getAdmin(user.getEmail());
			if(u.getPassword().equals(user.getPassword())) {
				System.out.println(errorMessage);
				return "UserPage";
			} else {
				errorMessage = "Email ou mot de passe erronés";
				model.addAttribute("errorMessage", errorMessage);
				return "Login" ;
			}
		} catch (NullPointerException e) {
			errorMessage = "Email ou mot de passe erronés";
			System.out.println(errorMessage);
			model.addAttribute("errorMessage", errorMessage);
			return "Login";
		}
		
	}
	
	@GetMapping("/Users")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("users",UserAdminService.findAll());
		request.setAttribute("mode","allUsers");
		return "UserPage";
	}
	
	@RequestMapping("/delete-user")
	public String deleteUser(@RequestParam int id, HttpServletRequest request) {
		System.out.println(id);
		UserAdminService.delete(id);
		request.setAttribute("users",UserAdminService.findAll());
		request.setAttribute("mode","allUsers");
		return "UserPage";
	}

}

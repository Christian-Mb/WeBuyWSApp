package univ.tours.WeBuyWSApp.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import univ.tours.WeBuyWSApp.entity.Store;
import univ.tours.WeBuyWSApp.entity.StoreAddress;
import univ.tours.WeBuyWSApp.entity.User;
import univ.tours.WeBuyWSApp.service.StoreAddressImplService;
import univ.tours.WeBuyWSApp.service.StoreImplService;
import univ.tours.WeBuyWSApp.service.UserAdminImplService;


@Controller
public class ApplicationController {

	@Autowired
	private UserAdminImplService UserAdminService;
	
	@Autowired
	private StoreImplService StoreService;

	@Autowired
	private StoreAddressImplService StoreAddressService;

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

	@PostMapping("/addStore")
	public String addStore(@ModelAttribute Store store, BindingResult bindingResult, HttpServletRequest request){
		StoreService.add(store);
		request.setAttribute("stores", StoreService.findAllStore());
		request.setAttribute("mode", "allStores");
		return "UserPage";
	}
	
	@GetMapping("/Users")
	public String showAllUsers(HttpServletRequest request) {
		request.setAttribute("users",UserAdminService.findAll());
		request.setAttribute("mode","allUsers");
		return "UserPage";
	}
	
	@GetMapping("/Admins")
	public String showAllAdmins(HttpServletRequest request) {
		request.setAttribute("users", UserAdminService.findAllAdmin());
		request.setAttribute("mode", "allAdmins");
		return "UserPage";
	}
	
	@GetMapping("/Stores")
	public String showAllStores(HttpServletRequest request) {
		request.setAttribute("stores", StoreService.findAllStore());
		request.setAttribute("mode", "allStores");
		return "UserPage";
	}
	@RequestMapping("/delete-user")
	public String deleteUser(@RequestParam int id, HttpServletRequest request) {
		UserAdminService.delete(id);
		request.setAttribute("users",UserAdminService.findAll());
		request.setAttribute("mode","allUsers");
		return "UserPage";
	}

	@RequestMapping("delete-store")
	public String deleteStore(@RequestParam int id, HttpServletRequest request){
		StoreService.delete(id);
		request.setAttribute("stores", StoreService.findAllStore());
		request.setAttribute("mode", "allStores");
		return "UserPage";
	}
	@RequestMapping("/promote-user")
	public String promoteUser(@RequestParam int id, HttpServletRequest request) {
		UserAdminService.promote(id);
		request.setAttribute("users",UserAdminService.findAll());
		request.setAttribute("mode","allUsers");
		return "UserPage";
	}


	@RequestMapping("/StoreAddress")
	public String storeAddress(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("allStoreAddress", StoreAddressService.storeAddress(id));
		request.setAttribute("magazin", StoreAddressService.storeAddress(id).get(0).getStore().getName());
		request.setAttribute("mode", "allStoreAddress");
		return "UserPage";
	}

	@RequestMapping("/delete-storeAddress")
	public String deleteStoreAddress(@RequestParam int id, @RequestParam int store_id, HttpServletRequest request){
		request.setAttribute("magazin", StoreAddressService.storeAddress(id).get(0).getStore().getName());
		StoreAddressService.delete(id);
		request.setAttribute("allStoreAddress", StoreAddressService.storeAddress(store_id));
		request.setAttribute("mode", "allStoreAddress");
		return "UserPage";
	}

	@RequestMapping("/add-Magazin-form")
	public String addMagazin(HttpServletRequest request){
		request.setAttribute("stores", StoreService.findAllStore());
		request.setAttribute("mode", "allStores");
		request.setAttribute("form", "MagazinForm");
		return "UserPage";
	}
}

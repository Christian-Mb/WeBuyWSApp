package univ.tours.WeBuyWSApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import univ.tours.WeBuyWSApp.dao.AdminJPARepository;
import univ.tours.WeBuyWSApp.dao.UserJPARepository;
import univ.tours.WeBuyWSApp.entity.User;

@RestController
public class UserAdminController {
	
	@Autowired
	UserJPARepository userRepo;
	@Autowired
	AdminJPARepository adminRepo;
	/**
	 * 
	 */
	public UserAdminController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/add")
	public void addUser(User user) {
		userRepo.save(user);
	}
	
	
	@GetMapping("/AllUser")
	public List<User> getAllUser(){
		
		return userRepo.findAll();
	}
//	
//	@GetMapping("/get/{email}")
//	public User getUserByEmail(String email) {
//		
//		//return userRepo.find
//	}
	

}

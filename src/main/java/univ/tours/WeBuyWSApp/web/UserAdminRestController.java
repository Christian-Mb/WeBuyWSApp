package univ.tours.WeBuyWSApp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import univ.tours.WeBuyWSApp.dao.AdminJPARepository;
import univ.tours.WeBuyWSApp.dao.UserJPARepository;
import univ.tours.WeBuyWSApp.entity.User;

@RestController
@RequestMapping("/users")
public class UserAdminRestController {
	
	
	@Autowired
	UserJPARepository userRepo;
	@Autowired
	AdminJPARepository adminRepo;
	/**
	 * 
	 */
	public UserAdminRestController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/add")
	public void addUser(User user) {
		userRepo.save(user);
	}
	
	
	@GetMapping("/AllUsers")
	public List<User> getAllUser(){
		return userRepo.findAll();
	}
	
	@GetMapping("/get/{email}")
	public User getUserByMail(@PathVariable(value="email") String email) {
		return userRepo.getByEmail(email);
	}
	
	public User getAdminByMail(String mail) {
		return userRepo.getAdmin(mail);
	}
	
//	
//	@GetMapping("/get/{email}")
//	public User getUserByEmail(String email) {
//		
//		//return userRepo.find
//	}
	

}
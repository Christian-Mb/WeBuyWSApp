package univ.tours.WeBuyWSApp.service;

import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import univ.tours.WeBuyWSApp.dao.AdminJPARepository;
import univ.tours.WeBuyWSApp.dao.UserJPARepository;
import univ.tours.WeBuyWSApp.entity.User;

@Service
@Transactional
public class UserAdminImplService implements IUserAdminService {
	
	@Autowired
	UserJPARepository userRepo;
	
	@Autowired
	AdminJPARepository adminRepo;

	@Override
	public void AddUser() {
		// TODO Auto-generated method stub
		Stream.of("Chris","Christ","Christian").forEach(nameD ->{
			User user = new User();
			user.setUsername(nameD);		
			userRepo.save(user);
		});
		
	}


}

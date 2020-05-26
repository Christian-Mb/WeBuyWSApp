package univ.tours.WeBuyWSApp.service;

import java.util.List;
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
	public User add(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAll() {
		return userRepo.findAll();
	}

	@Override
	public User find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		userRepo.delete(id);
		
	}

	@Override
	public User findByEmail(String email) {
		return userRepo.getByEmail(email);
	}

	@Override
	public User getAdmin(String email) {
		return userRepo.getAdmin(email);
	}

	
	
	/**
	@Override
	public void AddUser() {
		// TODO Auto-generated method stub
		Stream.of("Chris","Christ","Christian").forEach(nameD ->{
			User user = new User();
			user.setUsername(nameD);		
			userRepo.save(user);
		});
		
	}

**/
}

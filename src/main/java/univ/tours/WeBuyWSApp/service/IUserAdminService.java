package univ.tours.WeBuyWSApp.service;

import java.util.ArrayList;
import java.util.List;

import univ.tours.WeBuyWSApp.entity.Admin;
import univ.tours.WeBuyWSApp.entity.User;

public interface IUserAdminService {
	

	public User add(User user);
	public List<User> findAll();
	public User find(int id);
	public User update(User user);
	public void delete(int id);
	public User findByEmail(String email);
	public User getAdmin(String email);
	public void promote(int id);
	public List<User> findAllAdmin();
//	public void AddUser();
	

}

package univ.tours.WeBuyWSApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuyWSApp.entity.User;

@RepositoryRestResource
public interface UserJPARepository  extends JpaRepository<User, Long>{

	@Query(value = "SELECT * FROM user u WHERE u.user_id NOT IN (SELECT user_id FROM admin)", nativeQuery = true)
	public List<User> findAll();
	
	@Query(value = "SELECT * FROM user WHERE id=?1", nativeQuery = true)
	public User getById(int id);
	
	@Query(value = "SELECT * from user u INNER JOIN admin a ON a.user_id = u.user_id WHERE email = ?1", nativeQuery = true)
	public User getAdmin(String mail);
	
	@Query("SELECT u from User u WHERE u.email = ?1")
	public User getByEmail(String email);
	
	@Query(value = "SELECT * FROM user u INNER JOIN admin a ON a.user_id = u.user_id", nativeQuery = true)
	public List<User> findAllAdmin();
	
	@Modifying
	@Query(value = "DELETE FROM user WHERE user_id = ?1", nativeQuery = true)
	public void delete(int id);
	
	@Modifying
	@Query(value ="INSERT INTO admin(user_id) VALUES(?1)", nativeQuery = true)
	public void promote(int id);
	
	
}

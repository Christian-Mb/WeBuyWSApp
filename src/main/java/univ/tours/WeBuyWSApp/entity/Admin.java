package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Admin implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long admin_id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;

	public Long getAdmin_id() {
		return admin_id;
	}


	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	public void setAdmin_id(Long admin_id) {
		this.admin_id = admin_id;
	}
}

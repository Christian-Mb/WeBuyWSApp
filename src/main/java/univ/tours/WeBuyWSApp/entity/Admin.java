package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Admin implements Serializable {

	@Id
	@GeneratedValue
	private long admin_id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;

	/**
	 * @return the admin_id
	 */
	public long getAdmin_id() {
		return admin_id;
	}

	/**
	 * @param admin_id the admin_id to set
	 */
	public void setAdmin_id(long admin_id) {
		this.admin_id = admin_id;
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

}

package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Deal_published implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long published_id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "user_id")
	@JsonProperty(access=Access.WRITE_ONLY)
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deal_id", referencedColumnName = "deal_id")
	private Deal deal;

	/**
	 * @return the published_id
	 */
	public long getPublished_id() {
		return published_id;
	}

	/**
	 * @param published_id the published_id to set
	 */
	public void setPublished_id(long published_id) {
		this.published_id = published_id;
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

	/**
	 * @return the deal
	 */
	public Deal getDeal() {
		return deal;
	}

	/**
	 * @param deal the deal to set
	 */
	public void setDeal(Deal deal) {
		this.deal = deal;
	}
	
	
	
	
	
	

}

package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class ParticipateToPurshase implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long participate_id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "user_id")
	@JsonProperty(access=Access.WRITE_ONLY)
	private User user;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "purshase_group_id")
	@JsonProperty(access=Access.WRITE_ONLY)
	private PurshaseGroup purshaseGroup;

	/**
	 * @return the participate_id
	 */
	public long getParticipate_id() {
		return participate_id;
	}

	/**
	 * @param participate_id the participate_id to set
	 */
	public void setParticipate_id(long participate_id) {
		this.participate_id = participate_id;
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
	 * @return the purshaseGroup
	 */
	public PurshaseGroup getPurshaseGroup() {
		return purshaseGroup;
	}

	/**
	 * @param purshaseGroup the purshaseGroup to set
	 */
	public void setPurshaseGroup(PurshaseGroup purshaseGroup) {
		this.purshaseGroup = purshaseGroup;
	}

	public void setParticipate_id(Long participate_id) {
		this.participate_id = participate_id;
	}
}

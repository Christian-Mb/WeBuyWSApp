package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long user_id;
	private String username, mobileNumber, email, password, token,avatar;
	private Timestamp createdAt;


	@OneToOne(mappedBy = "user")
	private Admin admin;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Collection<Deal_published> deals_published;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Collection<ParticipateToPurshase> participateToPurhases;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Collection<PurshaseGroup> purshaseGroups;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private Collection<Comment> comments;


	public Long getUser_id() {
		return user_id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the createdAt
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the admin
	 */
	public Admin getAdmin() {
		return admin;
	}

	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	/**
	 * @return the deals_published
	 */
	public Collection<Deal_published> getDeals_published() {
		return deals_published;
	}

	/**
	 * @param deals_published the deals_published to set
	 */
	public void setDeals_published(Collection<Deal_published> deals_published) {
		this.deals_published = deals_published;
	}

	/**
	 * @return the participatePurhases
	 */
	public Collection<ParticipateToPurshase> getParticipatePurhases() {
		return participateToPurhases;
	}

	/**
	 * @param participatePurhases the participatePurhases to set
	 */
	public void setParticipatePurhases(Collection<ParticipateToPurshase> participatePurhases) {
		this.participateToPurhases = participatePurhases;
	}

	/**
	 * @return the purshaseGroups
	 */
	public Collection<PurshaseGroup> getPurshaseGroups() {
		return purshaseGroups;
	}

	/**
	 * @param purshaseGroups the purshaseGroups to set
	 */
	public void setPurshaseGroups(Collection<PurshaseGroup> purshaseGroups) {
		this.purshaseGroups = purshaseGroups;
	}

	/**
	 * @return the participateToPurhases
	 */
	public Collection<ParticipateToPurshase> getParticipateToPurhases() {
		return participateToPurhases;
	}

	/**
	 * @param participateToPurhases the participateToPurhases to set
	 */
	public void setParticipateToPurhases(Collection<ParticipateToPurshase> participateToPurhases) {
		this.participateToPurhases = participateToPurhases;
	}

	/**
	 * @return the comments
	 */
	public Collection<Comment> getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}

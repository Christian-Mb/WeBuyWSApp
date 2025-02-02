package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class PurshaseGroup implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long groupe_id;
	private int duration, article_quantity;
	private int nbrs_users_wanted;
	private Timestamp createdAt;
	private String invitationCode;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "deal_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Deal deal;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private User user;

	@OneToMany(mappedBy = "purshaseGroup", fetch = FetchType.LAZY)
	private Collection<ParticipateToPurshase> participateToPurshases;

	@OneToMany(mappedBy = "purshaseGroup", fetch = FetchType.LAZY)
	private Collection<Comment> comments;


	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @return the article_quantity
	 */
	public int getArticle_quantity() {
		return article_quantity;
	}

	/**
	 * @param article_quantity the article_quantity to set
	 */
	public void setArticle_quantity(int article_quantity) {
		this.article_quantity = article_quantity;
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
	 * @return the participateToPurshases
	 */
	public Collection<ParticipateToPurshase> getParticipateToPurshases() {
		return participateToPurshases;
	}

	/**
	 * @param participateToPurshases the participateToPurshases to set
	 */
	public void setParticipateToPurshases(Collection<ParticipateToPurshase> participateToPurshases) {
		this.participateToPurshases = participateToPurshases;
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

	public void setGroupe_id(Long groupe_id) {
		this.groupe_id = groupe_id;
	}

	public String getInvitationCode() {
		return invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	public int getNbrs_users_wanted() {
		return nbrs_users_wanted;
	}

	public void setNbrs_users_wanted(int nbrs_users_wanted) {
		this.nbrs_users_wanted = nbrs_users_wanted;
	}

	public Long getGroupe_id() {
		return groupe_id;
	}
}

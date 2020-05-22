package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Comment implements Serializable {

	@Id
	@GeneratedValue
	private long comment_id;
	private String content;
	private Timestamp PublishedAt;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "user_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private User user;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "deal_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Deal deal;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "purshase_group_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private PurshaseGroup purshaseGroup;

	/**
	 * @return the comment_id
	 */
	public long getComment_id() {
		return comment_id;
	}

	/**
	 * @param comment_id the comment_id to set
	 */
	public void setComment_id(long comment_id) {
		this.comment_id = comment_id;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the publishedAt
	 */
	public Timestamp getPublishedAt() {
		return PublishedAt;
	}

	/**
	 * @param publishedAt the publishedAt to set
	 */
	public void setPublishedAt(Timestamp publishedAt) {
		PublishedAt = publishedAt;
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

}

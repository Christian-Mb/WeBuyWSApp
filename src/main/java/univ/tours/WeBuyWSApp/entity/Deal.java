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
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Deal implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long deal_id;
	private double price, price_pomo;
	private int quantity_available, quantity_to_buy;
	private long userLike, userDislike;
	private Timestamp createdAt, startedAt, endedAt;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "store_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Store store;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "user_id")
	@JsonProperty(access=Access.WRITE_ONLY)
	private User user;

	@OneToMany(mappedBy = "deal", fetch = FetchType.LAZY)
	private Collection<PurshaseGroup> purshaseGroup;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "product_id")
	@JsonProperty(access = Access.WRITE_ONLY)
	private Product product;

	@OneToMany(mappedBy = "deal", fetch = FetchType.LAZY)
	private Collection<Comment> comments;

	/**
	 * @return the deal_id
	 */
	public Long getDeal_id() {
		return deal_id;
	}

	/**
	 * @param deal_id the deal_id to set
	 */
	public void setDeal_id(Long deal_id) {
		this.deal_id = deal_id;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the price_pomo
	 */
	public double getPrice_pomo() {
		return price_pomo;
	}

	/**
	 * @param price_pomo the price_pomo to set
	 */
	public void setPrice_pomo(double price_pomo) {
		this.price_pomo = price_pomo;
	}

	/**
	 * @return the quantity_available
	 */
	public int getQuantity_available() {
		return quantity_available;
	}

	/**
	 * @param quantity_available the quantity_available to set
	 */
	public void setQuantity_available(int quantity_available) {
		this.quantity_available = quantity_available;
	}

	/**
	 * @return the quantity_to_buy
	 */
	public int getQuantity_to_buy() {
		return quantity_to_buy;
	}

	/**
	 * @param quantity_to_buy the quantity_to_buy to set
	 */
	public void setQuantity_to_buy(int quantity_to_buy) {
		this.quantity_to_buy = quantity_to_buy;
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
	 * @return the startedAt
	 */
	public Timestamp getStartedAt() {
		return startedAt;
	}

	/**
	 * @param startedAt the startedAt to set
	 */
	public void setStartedAt(Timestamp startedAt) {
		this.startedAt = startedAt;
	}

	/**
	 * @return the endedAt
	 */
	public Timestamp getEndedAt() {
		return endedAt;
	}

	/**
	 * @param endedAt the endedAt to set
	 */
	public void setEndedAt(Timestamp endedAt) {
		this.endedAt = endedAt;
	}

	/**
	 * @return the store
	 */
	public Store getStore() {
		return store;
	}

	/**
	 * @param store the store to set
	 */
	public void setStore(Store store) {
		this.store = store;
	}


	/**
	 * @return the purshaseGroup
	 */
	public Collection<PurshaseGroup> getPurshaseGroup() {
		return purshaseGroup;
	}

	/**
	 * @param purshaseGroup the purshaseGroup to set
	 */
	public void setPurshaseGroup(Collection<PurshaseGroup> purshaseGroup) {
		this.purshaseGroup = purshaseGroup;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
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


	/**
	 * @return
	 */
	public long getUserLike() {
		return userLike;
	}

	/**
	 * @param userLike
	 */
	public void setUserLike(long userLike) {
		this.userLike = userLike;
	}

	public long getUserDislike() {
		return userDislike;
	}

	public void setUserDislike(long userDislike) {
		this.userDislike = userDislike;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}

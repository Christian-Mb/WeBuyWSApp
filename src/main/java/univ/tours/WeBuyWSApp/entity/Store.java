package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;

@Entity
public class Store implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long store_id;
	String name, logo;
	
	@OneToOne(mappedBy = "store")
	private StoreAddress address;
	@OneToMany(mappedBy = "store", fetch = FetchType.LAZY)
	private Collection<Deal> deals;

	/**
	 * @return the store_id
	 */
	public long getStore_id() {
		return store_id;
	}

	/**
	 * @param store_id the store_id to set
	 */
	public void setStore_id(long store_id) {
		this.store_id = store_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return the address
	 */
	public StoreAddress getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(StoreAddress address) {
		this.address = address;
	}

	/**
	 * @return the deals
	 */
	public Collection<Deal> getDeals() {
		return deals;
	}

	/**
	 * @param deals the deals to set
	 */
	public void setDeals(Collection<Deal> deals) {
		this.deals = deals;
	}

	public void setStore_id(Long store_id) {
		this.store_id = store_id;
	}
}

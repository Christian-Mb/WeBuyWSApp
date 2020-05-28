package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class StoreAddress implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long address_id;
	private double Longitude, latitude;
	private String department;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="store_id", referencedColumnName = "store_id")
	private Store store;

	/**
	 * @return the address_id
	 */
	public Long getAddress_id() {
		return address_id;
	}

	/**
	 * @param address_id the address_id to set
	 */
	public void setAddress_id(Long address_id) {
		this.address_id = address_id;
	}

	/**
	 * @return the longitude
	 */
	public double getLongitude() {
		return Longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(double longitude) {
		Longitude = longitude;
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
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
	
	

}

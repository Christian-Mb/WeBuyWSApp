package univ.tours.WeBuyWSApp.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product implements Serializable {

	@Id
	@GeneratedValue
	private long product_id;
	private String label, content, image;

	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	private Collection<Deal> deals;

	/**
	 * @return the product_id
	 */
	public long getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
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
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
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

}

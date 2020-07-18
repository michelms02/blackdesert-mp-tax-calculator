package bdo.calculator.marketplace.domain;

public class Marketplace {

	protected Double taxValuePack;
	protected Double tax;
	protected Double price;

	// tax value with value pack is 84.5%
	// tax value without value pack is 65%
	public Marketplace() {
		super();
		this.taxValuePack = 0.845d;
		this.tax = 0.65d;
	}

	public Double getTaxValuePack() {
		return taxValuePack;
	}

	public Double getTax() {
		return tax;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
}

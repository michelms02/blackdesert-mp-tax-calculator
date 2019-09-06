package bdo.calculator.marketplace;

public class Marketplace {

	private float taxValuePack;

	private float tax;

	private double value;

	// tax value with value pack is approximately 84.5%
	// tax value without value pack is approximately 65%
	public Marketplace() {
		super();
		this.taxValuePack = 0.845f;
		this.tax = 0.65f;
	}

	public float getTaxValuePack() {
		return taxValuePack;
	}

	public float getTax() {
		return tax;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
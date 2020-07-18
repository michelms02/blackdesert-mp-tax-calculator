package bdo.calculator.marketplace.tui;

import bdo.calculator.marketplace.domain.Marketplace;
import java.text.DecimalFormat;

public class MarketplaceUtilities { 

	/**
	 * Receives object item from marketplace and boolean result to run one of
	 * the two operations.
	 */
	public static void doMath(Marketplace item, boolean vp) {
		Double result;
		if (vp) {
			result = item.getTaxValuePack() * item.getPrice();
			toDecimal(result);
		} else {
			result = item.getTax() * item.getPrice();
			toDecimal(result);
		}
	}
	
	/**
	 * Checks if choice received by parameter in menu(); is equivalent 
	 * to the boolean condition be true and break the loop
	 */
	public static boolean hasValuePack(Integer choice) {
		return choice == 1 || choice == 2;
	}

	/**
	 * Converts the double format to decimal format
	 */
	public static void toDecimal(Double result) {
		DecimalFormat df = new DecimalFormat("#,###,###");
		System.out.println("You'd get approximately " + df.format(result) + " (Silver) back from the Marketplace.");
	}

}

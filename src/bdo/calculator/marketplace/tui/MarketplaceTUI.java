package bdo.calculator.marketplace.tui;

import bdo.calculator.marketplace.domain.Marketplace;
import java.text.DecimalFormat;

public class MarketplaceTUI {

	public static void menu() {
		Marketplace item = new Marketplace();
		Integer choice;
		boolean vp;

		// Gets user item value input
		item.setValue(UtilTUI.getDecimal("Insert the item value to calculate: "));

		// do/while until user's choice input is valid
		do {
			choice = UtilTUI.getNumber("Do you have a Value Pack?\n" + "(1) Yes" + " (2) No");
			if (!hasValuePack(choice)) {
				System.out.println("Incorrect option, please try again.\n");
			}
		} while (!hasValuePack(choice));

		// Calls the methods based on the choice
		vp = choice == 1;
		doMath(item, vp);
	}

	public static void doMath(Marketplace item, boolean vp) {
		double result;
		
		if (vp) {
			result = item.getTaxValuePack() * item.getValue();
			toDecimal(result);
		} else {
			result = item.getTax() * item.getValue();
			toDecimal(result);
		}
	}
	
	public static boolean hasValuePack(Integer choice) {
		return choice == 1 || choice == 2;
	}

	// Converts the double format to decimal format
	public static void toDecimal(double result) {
		DecimalFormat df = new DecimalFormat("#,###,###");
		System.out.println("You'd get approximately " + df.format(result) + " (Silver) back from the Marketplace.");
	}
}
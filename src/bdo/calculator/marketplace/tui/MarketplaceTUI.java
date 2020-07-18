package bdo.calculator.marketplace.tui;

import bdo.calculator.marketplace.domain.Marketplace;

public class MarketplaceTUI {

	public static void menu() {
		Marketplace item = new Marketplace();
		Integer choice;
		boolean vp;

		// Gets user item price input
		item.setPrice(ScannerUtilities.getDecimal("Insert the item price to calculate: "));

		// do/while until user's choice input is valid
		do {
			choice = ScannerUtilities.getNumber("Do you have a Value Pack?\n" + "(1) Yes" + " (2) No");
			if (!MarketplaceUtilities.hasValuePack(choice)) {
				System.out.println("Incorrect option, please try again.\n");
			}
		} while (!MarketplaceUtilities.hasValuePack(choice));

		// Calls the methods based on the choice
		vp = choice == 1;
		MarketplaceUtilities.doMath(item, vp);
	}

}
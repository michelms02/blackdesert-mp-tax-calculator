package bdo.calculator.marketplace;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculator {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Marketplace item = new Marketplace();
		Integer choice;
		boolean vp;

		// Gets user item value input
		System.out.println("Insert the item value to calculate: ");
		item.setValue(sc.nextDouble());

		// do/while until user's choice input is valid
		do {
			System.out.println("Do you have a Value Pack?\n" + "(1) Yes" + " (2) No");
			choice = sc.nextInt();
			if (choice != 1 && choice != 2) {
				System.out.println("Incorrect option, please try again.\n");
			}
		} while (choice != 1 && choice != 2);

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

	// Converts the double format to decimal format
	public static void toDecimal(double result) {
		DecimalFormat df = new DecimalFormat("#,###,###");
		System.out.println("You'd get approximately " + df.format(result) + " (Silver) back from the Marketplace.");
	}
}
package bdo.calculator.marketplace.tui;

import java.util.Scanner;

/**
 * Get user input w/o the necessity of importing scanner in another class e.g:
 * name = ScannerUtilities.getText("Insert your name:");
 */
public class ScannerUtilities {

	private static final Scanner sc = new Scanner(System.in);

	/**
	 * Prints a text received by parameter and gets input of a String datatype and
	 * returns it.
	 */
	public static String getText(String text) {
		System.out.println(text);
		return sc.nextLine();
	}

	/**
	 * Prints a text received by parameter and gets input of an Integer datatype and
	 * returns it.
	 */
	public static Integer getNumber(String text) {
		Integer number;
		System.out.println(text);
		number = sc.nextInt();
		sc.nextLine();
		return number;
	}

	/**
	 * Prints a text received by parameter and gets input of a Double datatype and
	 * returns it.
	 */
	public static Double getDecimal(String text) {
		Double decimal;
		System.out.println(text);
		decimal = sc.nextDouble();
		return decimal;
	}

}
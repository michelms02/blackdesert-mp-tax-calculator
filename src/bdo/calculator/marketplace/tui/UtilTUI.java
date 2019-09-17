package bdo.calculator.marketplace.tui;

import java.util.Scanner;

/**
 * Get user input w/o the necessity of importing scanner in another class e.g:
 * name = UtilTUI.getText("Insert your name:");
 */
public class UtilTUI {

	private static final Scanner sc = new Scanner(System.in);

	/**
	 * Prints a text received by parameter and get input of a String datatype and
	 * returns it.
	 */
	public static String getText(String text) {
		System.out.println(text);
		return sc.nextLine();
	}

	/**
	 * Prints a text received by parameter and get input of an Integer datatype and
	 * returns it.
	 */
	public static Integer getNumber(String text) {
		Integer number;

		System.out.println(text);

		number = sc.nextInt();
		sc.nextLine();

		return number;
	}

	public static double getDecimal(String text) {
		double decimal;

		System.out.println(text);

		decimal = sc.nextDouble();

		return decimal;
	}

	/**
	 * Incomplete attempt of making a name sort.
	 */
	public static String nameFormat(String text) {
		char[] name = text.toLowerCase().trim().toCharArray();
		char[] format = new char[name.length];

		for (int i = 0; i < name.length; i++) {
			if (i == 0) {
				format[i] = Character.toUpperCase(name[i]);
			} else if (Character.isWhitespace(name[i])) {
				format[i] = Character.toUpperCase(name[i]);
			} else {
				format[i] = name[i];
			}
			System.out.print(format[i]);
		}
		return new String(format);
	}

}
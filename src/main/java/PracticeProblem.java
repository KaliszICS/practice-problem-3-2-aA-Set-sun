/*
 * File: If and Else
 * Author: Angie
 * Date Created: Mar 24, 2026
 * Date Last Modified: Mar 24, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {

	}

		/* Create a method called isFive().
	The method will take in a single integer as a parameter.
	If the integer is 5, return "The number is Five"
	Otherwise, return "The number is not Five"
	Use an else statement.*/

	public static String isFive (int num) {

		if (num == 5) {
			return "The number is Five";
		}
		else {
			return "The number is not Five";
		}
	}

	public static String positiveOrNegative(double posit) {
		if (posit > 0) {
			return "Positive";
		}
		else {
			return "Negative";
		}
	}

	public static String highOrLow(int num) {
		if (num > 100) {
			return "High";
		}
		else {
			return "Low";
		}
	}

	public static String isHello(String hello) {
		if (hello.equals("Hello")) {
			return "The word is Hello";
		}
		else {
			return"The word is not Hello";
		}
	}


}

/**
	* Lesson: 3.2 If and Else
	* Author: Mr. Kalisz
	* Date Created: March 21, 2023
	* Date Last Modified: March 21, 2023
	*/


import java.util.Scanner;

class Notes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		System.out.print("Input an integer: ");
		num = input.nextInt();

		// if (num < 0) {
		// 	System.out.println(num + " is negative");
		// }

		if (num > 0) {
			System.out.println(num + " is positive");
		}
			//code can not be written between your if and else statement.
		else { //num <= 0
			System.out.println(num + " is not positive");
		}
		
	}

	public static String isOne(int num) {
		if (num == 1) {
			return "Is one";
		}
		return "Is not one"; //works like else
	}
	
}

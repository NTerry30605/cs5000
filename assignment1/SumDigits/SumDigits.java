//*CS 5000/W01 
//* Spring 2018
// * Nikko Terry
//* Dr. Haddad
//* Assignment 1/Program 3

import java.util.Scanner;

public class SumDigits {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 9999:");

		int Number, Reminder, Sum = 0;

		Number = sc.nextInt();

		sc.close();
		while (Number > 0) {
			Reminder = Number % 10;
			Sum = Sum + Reminder;
			Number = Number / 10;
		}

		System.out.format("Sum of the digits of Given Number = %d", Sum);
	}
}

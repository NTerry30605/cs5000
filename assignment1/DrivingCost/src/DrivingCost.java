import java.util.Scanner;

public class DrivingCost {

	public static void main(String[] Strings) {
		// TODO Auto-generated method stub
		// *CS 5000/W01
		// * Spring 2018
		// * Nikko Terry
		// * Dr. Haddad
		// * Assignment 1/Program 5

		// The distance (miles): 100.0
		// Fuel efficiency (mpg): 20.0
		// Price per gallon (dollars): 2.5
		// The trip cost (dollars): $12.50

		Scanner input = new Scanner(System.in);

		double distance;
		double milesPerGallon;
		double pricePerGallon;

		// Getting input from user
		System.out.print("Enter the driving distance: ");
		distance = input.nextDouble();

		System.out.print("Enter miles per gallon: ");
		milesPerGallon = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		pricePerGallon = input.nextDouble();

		input.close(); // closing scanner

		double total = distance / milesPerGallon * pricePerGallon;
		// Displaying total cost
		System.out.printf("The cost of driving is $%.2f", total);
	}

}

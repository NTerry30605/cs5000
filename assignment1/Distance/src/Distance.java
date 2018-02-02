import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		// *CS 5000/W01
		// * Spring 2018
		// * Nikko Terry
		// * Dr. Haddad
		// * Assignment 1/Program 4

		// Distance = Sqrt[(9x2-1)^2 + (y2-y1)^2]
		Scanner sc = new Scanner(System.in);

		int x1, x2, y1, y2;

		double dis;

		System.out.println("enter x1 point:");

		x1 = sc.nextInt();

		System.out.println("enter y1 point:");

		y1 = sc.nextInt();

		System.out.println("enter x2point:");

		x2 = sc.nextInt();

		System.out.println("enter y2 point:");

		y2 = sc.nextInt();
		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		sc.close();
		System.out.println("distancebetween:" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis);

	}
}
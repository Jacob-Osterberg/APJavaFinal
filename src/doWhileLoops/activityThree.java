package doWhileLoops;

import java.util.Scanner;

public class activityThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int temp = 0;
		int counter = 1;
		do {
		System.out.println("gimmy a number");
		temp = input.nextInt();
		int low = temp;
		int high = temp;

		}while (counter <= 4) {
			if (temp > high) {
				high = temp;

			} else {
				if (temp < low) {
					low = temp;
				}
			}
			counter += 1;
		}
		
		System.out.println(high-low);
	}
}


		/*
		 * do { System.out.println("Please enter a number(9999 to quit)"); temp =
		 * input.nextInt(); if (temp != 9999) { if (counter % 2 == 0) { numTwo = temp; }
		 * else { numOne = temp; } } counter += 1; } while (temp != 9999); if (numOne >
		 * numTwo) { int numThree = numOne - numTwo;
		 * System.out.println("The range of your numbers is " + numThree); } else { int
		 * numFour = numTwo - numOne;
		 * System.out.println("the range of numbers you entered is " + numFour); }
		 */
	



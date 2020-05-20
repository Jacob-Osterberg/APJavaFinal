package strings;

import java.util.Scanner;

public class activityTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		while (count != 2) {
			System.out.println("Enter your password");
			String passOne = input.nextLine();
			System.out.println("Re-enter your password");
			String passTwo = input.nextLine();
			if (passOne.compareTo(passTwo) == 0) {
				System.out.println("Welcome");
				count = 2;
			} else {
				System.out.println("Try again");
			}
		}
	}

}

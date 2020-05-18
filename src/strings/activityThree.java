package strings;

import java.util.Scanner;

public class activityThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("This is case sensetive");
		System.out.println("gimmy a name");
		String nameOne = input.nextLine();
		System.out.println("gimmy a name");
		String nameTwo = input.nextLine();
		if (nameOne.compareTo(nameTwo) < 0) {
			System.out.println(nameOne + " comes before " + nameTwo);
		} else {
			if (nameOne.compareTo(nameTwo) > 0) {
				System.out.println(nameTwo + " comes before " + nameOne);
			} else {
				System.out.println("The two names are the same.");

			}
		}

	}
}
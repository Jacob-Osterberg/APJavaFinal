package strings;

import java.util.Scanner;

public class compareToIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("This isn't case sensetive");
		System.out.println("gimmy a name");
		String nameOne = input.nextLine();
		System.out.println("gimmy a name");
		String nameTwo = input.nextLine();
		if (nameOne.compareTo(nameTwo) == 0) {
			System.out.println("The two names are the same.");
		} else {
			if (nameOne.compareTo(nameTwo) > 0) {
				System.out.println(nameTwo + " comes before " + nameOne);
			} else {
				System.out.println(nameOne + " comes before " + nameTwo);
			}
		}
	}

}

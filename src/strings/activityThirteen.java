package strings;

import java.util.Scanner;

public class activityThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your social security number in this format, 111 11 1111 ");
		String ssn = input.nextLine();
		String ssnOne = ssn.substring(7);
		System.out.println(ssnOne);
		String ssnTwo = ssn.substring(4, 6);
		System.out.println(ssnTwo);
		String ssnThree = ssn.substring(0, 3);
		System.out.println(ssnThree);
	}

}

package strings;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		String wordTwo = "";
		while (count != 2) {
			System.out.println("Enter a word.");
			String wordOne = input.nextLine();
			for (int i = wordOne.length() - 1; i >= 0; i = i - 1) {
				wordTwo = wordTwo + wordOne.charAt(i);
			}
			if (wordOne.compareTo(wordTwo) == 0) {
				System.out.println("Congrats, thats a palindrome");
				count = 2;
			} else {
				System.out.println("Sorry, not a palindrome");
			}
			System.out.println("Would you like to do this again?(1 = yes, 2 = no)");
			count = input.nextInt();
		}

	}

}

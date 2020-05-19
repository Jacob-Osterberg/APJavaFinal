package strings;

import java.util.Scanner;

public class activityNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a sentence.");
		String phrase = input.nextLine();

		String phraseUpper = phrase.toUpperCase();

		System.out.println("Your sentence in upper case letters: " + phraseUpper);

	}

}

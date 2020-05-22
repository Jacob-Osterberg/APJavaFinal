package strings;

import java.util.Scanner;

public class numberOfVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int j = 0;
		System.out.println("Enter a sentence.");
		String phrase = input.nextLine();
		for (int count = 0; count < phrase.length(); count++) {
			if (phrase.charAt(count) != 'a' || phrase.charAt(count) != 'e' || phrase.charAt(count) != 'i'
					|| phrase.charAt(count) != 'o' || phrase.charAt(count) != 'u') {
				j++;
			}
		}
		System.out.println(j);

	}

}

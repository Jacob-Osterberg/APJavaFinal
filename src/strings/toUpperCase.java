package strings;

import java.util.Scanner;

public class toUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a String.");
		String userWord = input.nextLine();

		userWord = userWord.toUpperCase();

		System.out.println("Your String in upper case letters:" + userWord);

	}

}

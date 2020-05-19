package strings;

import java.util.Scanner;

public class activitySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Gimmy a sentence");
		String phrase = input.nextLine();
		String lowerCase = phrase.toLowerCase();
		System.out.println("Your sentence as all lowercase is " + lowerCase);
		System.out.println(phrase);

	}

}

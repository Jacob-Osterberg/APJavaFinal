package strings;

import java.util.Scanner;

public class activityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("gimmy a sentence");
		String sentence = input.nextLine();
		System.out.println("The first letter is " + sentence.charAt(0));
		System.out.println("The third letter is " + sentence.charAt(2));
		System.out.println(sentence);

	}

}

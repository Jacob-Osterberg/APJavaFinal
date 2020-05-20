package strings;

import java.util.Scanner;

public class activityTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("gimmy a sentence");
		String sentence = input.nextLine();
		for (int count = 0; count < sentence.length(); count++) {
			if (sentence.charAt(count) != ' ' && sentence.charAt(count) != 'a' && sentence.charAt(count) != 'A') {
				System.out.println(sentence.charAt(count));

			}
		}
		System.out.println(sentence);
	}

}

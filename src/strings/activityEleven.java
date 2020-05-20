package strings;

import java.util.Scanner;

public class activityEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 4;
		System.out.println("gimmy a sentence");
		String sentence = input.nextLine();
		System.out.println("The first letter is " + sentence.charAt(0));
		for (int count = 3; count <= sentence.length(); count = count + 4) {
			System.out.println("The " + num + "th letter is " + sentence.charAt(count));
			num = num + 4;
		}

	}

}

package strings;

import java.util.Scanner;

public class activitySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Gimmy a sentence");
		String sentence = input.nextLine();
		for (int counter = 0; counter < sentence.length(); counter++) {
			System.out.println(sentence.charAt(counter));
		}

	}

}

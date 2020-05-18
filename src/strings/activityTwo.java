package strings;

import java.util.Scanner;

public class activityTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("gimmy a sentence");
		String sentence = input.nextLine();
		if (sentence.contains("Bob")) {
			System.out.println("The sentence contains Bob");
		} else {
			System.out.println("The sentence doesnt contain Bob");
		}
		System.out.println(sentence);
	}

}

package strings;

import java.util.Scanner;

public class activityFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Gimmy a sentence with X in it");
		String phrase = input.nextLine();
		System.out.println("X begins at index #" + (phrase.indexOf("X") + 1));

	}

}

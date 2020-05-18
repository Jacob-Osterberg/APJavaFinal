package strings;

import java.util.Scanner;

public class activityFiveLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Gimmy a sentence");
		String phrase = input.nextLine();
		System.out.println("The sentence is " + phrase.length() + " charactors long.");

		// as far as I can tell, length starts counting at 1
	}

}

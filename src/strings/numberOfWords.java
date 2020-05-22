package strings;

import java.util.Scanner;

public class numberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int repeate = 1;
		while (repeate == 1) {
			System.out.println("Enter a sentence.");
			String phrase = input.nextLine();
			String add = " ";
			String length = phrase + add;
			int counter = 0;
			int j = 0;
			for (int i = 1; i < length.length(); i++) {
				if (length.charAt(i) == ' ') {
					System.out.println(length.substring(j, i));
					i++;
					j = i;
					counter++;
				}

			}
			System.out.println("There are " + counter + " words in your sentence.");
			System.out.println("Would you like to do this again?(1 = yes, 2 = no)");
			repeate = input.nextInt();
		}
	}
}

package strings;

import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int num = 0;
		System.out.println("Enter a word.");
		String wordOne = input.nextLine();
		System.out.println("Enter another word.");
		String wordTwo = input.nextLine();
		System.out.println("Enter final word.");
		String wordThree = input.nextLine();
		String wordOneN = wordOne.substring(0, 1);
		String wordTwoN = wordTwo.substring(wordTwo.length() - 1);
		int threeLength = wordThree.length();
		num = generator.nextInt(threeLength - 2 + 1) + 1;
		String wordThreeN = wordThree.substring(num, (num + 1));
		System.out.println(wordOneN);
		System.out.println(wordTwoN);
		System.out.println(wordThreeN);
		int numOne = generator.nextInt(9 - 1 + 1) + 1;
		int numTwo = generator.nextInt(9 - 1 + 1) + 1;
		int numThree = generator.nextInt(9 - 1 + 1) + 1;
		System.out.println("Your password is " + wordOneN + "" + wordTwoN + "" + wordThreeN + "" + numOne + "" + numTwo + "" + numThree);

	}

}

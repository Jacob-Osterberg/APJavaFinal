package strings;

import java.util.Scanner;

public class inputProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your friends name?");
		String friend = input.nextLine();

		System.out.println("What is your hourly wage?");
		double age = input.nextDouble();

		// clear the input buffer to be able to 
		//read the full input going forward
		input.nextLine();

		System.out.println("What is your Name?");
		String name = input.nextLine();
		
		System.out.println(friend);
		System.out.println(age);
		System.out.println(name);

	}

}

package multiDArraysPrimitives;

import java.util.Scanner;

public class seatingChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int rows = 4;
		String firstNames = "Bobbie";
		String lastNames = "Bob";

		System.out.println("How many students are in the class?(must be a multiple of four)");
		int student = input.nextInt();
		input.nextLine();
		int students = student / 4;
		String[][] room = new String[students][rows];
		String[][] roomTwo = new String[students][rows];
		for (int row = 0; row < students; row++) {
			for (int column = 0; column < rows; column++) {
				System.out.println("What is the first name of a student?");
				firstNames = input.nextLine();
				//input.nextLine();
				room[row][column] = firstNames;
				System.out.println("What is the last name of a student?");
				lastNames = input.nextLine();
				roomTwo[row][column] = lastNames;
			}
		}

		for (int row = 0; row < students; row++) {
			for (int column = 0; column < rows; column++) {
				System.out.print(room[row][column] + " " + roomTwo[row][column] + " ");

			}
			System.out.println("");
		}
	
		
	}

}

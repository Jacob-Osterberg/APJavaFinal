package arrays;

import java.util.Scanner;

public class rollADieExtention2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many sides:");
		int sides = input.nextInt();
		System.out.println("How many rolls:");
		int numRolls = input.nextInt();
		int[] rolls = new int[numRolls];
		for (int i = 0; i < numRolls; i++)
			rolls[i] = (int) (Math.random() * (sides + 1));
		{
			System.out.println("Which number rolled?");
			int rolled = input.nextInt();
			for (int i = 0; i < numRolls; i++)
				if (rolled == rolls[i])
					System.out.println("Roll – " + (i + 1));
			System.out.println("Again? Y or N");
			input.nextLine();
		}
		
		while (input.nextLine().charAt(0) == 'y')
			;

	}

}

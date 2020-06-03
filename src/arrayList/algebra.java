package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class algebra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String names = "Bob";
		int tests = 0;
		int count = 0;

		ArrayList<Friend> friends = new ArrayList<Friend>();

		System.out.println("How many students are in the class?");
		int student = input.nextInt();
		input.nextLine();
		for (count = 0; count < student; count++) {
			System.out.println("What is the name of a student?");
			names = input.nextLine();

			System.out.println("What is the test score of a student?");
			tests = input.nextInt();
			input.nextLine();
			friends.add(new Friend(tests, names));
		}

		for (count = 0; count < friends.size(); count++) {

			System.out
					.println("Name: " + friends.get(count).getName() + ", Test score: " + friends.get(count).getAge());

		}

	}

}

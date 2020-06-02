package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class activityFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();

		names.add("Bob");
		names.add("Jane");
		names.add(1, "Billy");
		System.out.println("What is your name?");
		names.add(input.nextLine());
		names.remove(names.size() - 1);
		names.remove(0);
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

	}

}

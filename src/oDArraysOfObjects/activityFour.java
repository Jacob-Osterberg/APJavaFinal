package oDArraysOfObjects;

import java.util.Scanner;

public class activityFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int i = 0;
		int largest = 0;
		String temp = "fdh";
		Friend[] friends = new Friend[20];
		for (count = 0; count < friends.length; count++) {
			friends[count] = new Friend();
		}

		for (count = 0; count < friends.length; count++) {
			System.out.println("Enter a name");
			friends[count].setName(input.nextLine());

		}

		for (count = 0; count < friends.length; count++) {
			Friend friends2 = friends[count];
			String name = friends2.getName();
			if (name.length() > largest) {
				i = count;
				largest = name.length();
			}
		}
		System.out.println(i);
		temp = friends[19].getName();
		friends[19].setName(friends[i].getName());
		friends[i].setName(temp);
		for (count = 0; count < friends.length; count++) {
			System.out.println(friends[count].getName());

		}

	}

}

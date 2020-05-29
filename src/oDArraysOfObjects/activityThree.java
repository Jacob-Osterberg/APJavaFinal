package oDArraysOfObjects;

import java.util.Scanner;

public class activityThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int i = 0;
		Friend[] friends = new Friend[20];
		for (count = 0; count < friends.length; count++) {
			friends[count] = new Friend();
		}

		for (count = 0; count < friends.length; count++) {
			System.out.println("Enter a name");
			friends[count].setName(input.nextLine());

		}
		System.out.println("Gimmy the length of a first name");
		int letter = input.nextInt();
		for (count = 0; count < friends.length; count++) {
			Friend friends2 = friends[count];
			String name = friends2.getName();
			if (name.length() == letter) {
				System.out.println(friends[count].getName());
				i++;
			}
		}
		System.out.println(i);

	}

}

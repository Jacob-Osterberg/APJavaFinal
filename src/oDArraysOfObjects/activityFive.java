package oDArraysOfObjects;

import java.util.Random;
import java.util.Scanner;

public class activityFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int count = 0;
		int i = 0;

		Rectangle[] rectangles = new Rectangle[100];
		for (count = 0; count < rectangles.length; count++) {
			rectangles[count] = new Rectangle();
		}
		for (count = 0; count < rectangles.length; count++) {
			i = generator.nextInt(56 - 10 + 1) + 10;
			rectangles[count].setlength(i);

		}
		for (count = 0; count < rectangles.length; count++) {
			i = generator.nextInt(100 - 1 + 1) + 1;
			rectangles[count].setWidth(i);

		}
		for (count = 0; count < rectangles.length; count++) {

			System.out.println(rectangles[count].getLength());
			System.out.println(rectangles[count].getWidth());
			System.out.println(rectangles[count].area());
		}

	}

}

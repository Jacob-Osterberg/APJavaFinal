package oDArraysOfObjects;

import java.util.Random;
import java.util.Scanner;

public class activitySix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int count = 0;
		int i = 0;
		int j = 0;
		double smallest = 999999999;
		double tempL = 0;
		double tempW = 0;
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
			Rectangle rectangles2 = rectangles[count];
			double area = rectangles2.area();
			if (area < smallest) {
				j = count;
				smallest = area;
			}
		}
		System.out.println(i);
		tempL = rectangles[0].getLength();
		tempW = rectangles[0].getWidth();
		rectangles[0].setlength(rectangles[j].getLength());
		rectangles[0].setWidth(rectangles[j].getWidth());
		rectangles[j].setlength(tempL);
		rectangles[j].setWidth(tempW);

		for (count = 0; count < rectangles.length; count++) {

			System.out.println(rectangles[count].getLength());
			System.out.println(rectangles[count].getWidth());
			System.out.println(rectangles[count].area());
		}

	}

}

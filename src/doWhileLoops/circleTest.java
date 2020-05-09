package doWhileLoops;

import java.util.Scanner;

public class circleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int radOne = -999;
		int radTwo = -999;
		int radThree = -999;
		do {
			System.out.println("enter a radius(9999 to quit)");
			radOne = input.nextInt();
			System.out.println("enter a radius(9999 to quit)");
			radTwo = input.nextInt();
			if (radTwo > radOne) {
				radThree = radTwo;
			} else {
				radThree = radOne;
			}
		} while (radOne == 9999 || radTwo == 9999);
		{
			Circle bob = new Circle(radThree);
			System.out.println("the circumference of the largest circle is " + bob.circumference());

		}

	}

}

package doWhileLoops;

import java.util.Scanner;

public class triangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int shortOne = -999;
		int longOne = -999;
		int hypOne = -999;
		int shortTwo = -999;
		int longTwo = -999;
		int hypTwo = -999;

		do {
			System.out.println("enter the short side(9999 to quit)");
			shortOne = input.nextInt();
			System.out.println("enter the long side(9999 to quit)");
			longOne = input.nextInt();
			System.out.println("enter the Hypotonuse(9999 to quit)");
			hypOne = input.nextInt();
			System.out.println("enter the short side(9999 to quit)");
			shortTwo = input.nextInt();
			System.out.println("enter the long side(9999 to quit)");
			longTwo = input.nextInt();
			System.out.println("enter the Hypotonuse(9999 to quit)");
			hypTwo = input.nextInt();
			

		
		

			RightTriangle bob = new RightTriangle(shortOne, longOne);
			RightTriangle tim = new RightTriangle(shortTwo, longTwo);

			if (bob.area() > tim.area()) {
				double areaOne = bob.area();
				System.out.println("the area of the largest triangle is " + areaOne + ".");

			} else {
				double areaTwo = tim.area();
				System.out.println("the area of the largest triangle is " + areaTwo + ".");

			}

			System.out.println("Would you like to continue(true/false)");
			
				} while (input.nextBoolean());

	}

}

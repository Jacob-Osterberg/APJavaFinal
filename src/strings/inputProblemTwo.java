package strings;
import java.util.Scanner;
public class inputProblemTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Do you have a cat? 1-yes, 0-no");
		int answer = input.nextInt();

		if(answer == 1)
		{
			//clear the input buffer
			input.nextLine();

			System.out.println("What is your cats name?");
			String cat  = input.nextLine();
			System.out.println(cat);
		}

		System.out.println("How many toes do you have?");
		double toes = input.nextDouble();

		System.out.println(answer);
		System.out.println(toes);
		
	}

}

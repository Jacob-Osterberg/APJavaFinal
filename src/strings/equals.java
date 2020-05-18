package strings;

public class equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "Hello World";
		String word2 = "NOT Hello World";
		boolean answer = word1.equals(word2);

		System.out.println("Are the Strings equal? : " + answer);

		System.out.println("Is java the String?" + word2.equals("java"));

	}

}

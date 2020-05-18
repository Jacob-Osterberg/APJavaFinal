package strings;

public class indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "Hello World";

		System.out.println("rl begins at index #" + phrase.indexOf("rl"));

		String word = "Wor";
		System.out.println("Wor begins at index #" + phrase.indexOf(word));

		System.out.println("Blah begins at index #" + phrase.indexOf("Blah"));

		// watch for off by ones
	}

}

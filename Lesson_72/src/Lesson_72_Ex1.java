
public class Lesson_72_Ex1 {
	/*
	 * Exercise 1

        Create a string that holds the following:
        "Shelly sells sea shells down by the sea shore."

        Search this string for the word "sea" and report the index of the 
        last match for this substring.  Print the index to the screen.
	 */

	public static void main(String[] args) {
		String sentence = "Shelly sells sea shells down by the sea shore.";
		
		System.out.println(sentence);
		System.out.println("Last occurrence of 'sea': " + sentence.lastIndexOf("sea"));

	}

}

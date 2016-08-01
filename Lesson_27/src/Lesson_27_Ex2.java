
public class Lesson_27_Ex2 {
	/*
	 * Exercise 2

        Create a "Guess the letter" game.  Have the user input a letter between A and Z.

        Output: "I'm thinking of a letter between A and Z."
        "Guess my letter: "

        If they guess 'W' or 'w', then output, "Correct"!
        If they guess any other letter, then output "Nope, not Correct!"
	 */

	public static void main(String[] args) 
		throws java.io.IOException {
			char input;
			
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.println("Guess my letter: ");
			
			input = (char) System.in.read();
			
			if ((input == 'W') || (input == 'w')) {
				System.out.println("Correct!");
			} else {
				System.out.println("Nope, not Correct!");
			}

	}

}

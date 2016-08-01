
public class Lesson_34_Ex1 {
	/*
	 * Exercise 1

        Write a program that asks a user to entered their favorite letter
        of the alphabet.  Use a for loop to with a break statement to loop 
        through all letters A->Z, searching for a match for what the user input.

        Then, display to the user what number that letter corresponds to.

        For example, if the user types in "A", then output,
        Your favorite letter is "A", which is letter number 1.

        If the user types in "Y", then output:
        Your favorite letter is Y, which is letter number 25.
	 */

	public static void main(String[] args) 
		throws java.io.IOException {

		char input, letter = 'A';
		int counter;
		
		System.out.println("Enter your favorite uppercase letter: ");
		input = (char) System.in.read();
		
		for(counter = 1; counter <= 26; counter++) {
			if (input == letter) break;
			
			letter++;
		}
		System.out.println("Your favorite letter is " + input + ", which is letter " + counter);
		
	}

}

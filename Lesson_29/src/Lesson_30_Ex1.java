import java.util.Scanner;

public class Lesson_30_Ex1 {
	/*
	 * Exercise 1

        Write a program that asks the user to enter a guess for your age.
        If the user types in the correct answer, display a message saying
        that they were correct.  If not, show a message saying that their
        guess was wrong.  Use your actual age in this program.
	 */

	public static void main(String[] args) {

		Scanner keyboardInput = new Scanner(System.in);
		
		int guess = 0;
		int age = 30;
		
		System.out.println("How old am I? Enter your guess: ");
		if (keyboardInput.hasNextInt() == true) guess = keyboardInput.nextInt();
		
		if (guess != age) {
			System.out.println("Answer is incorrect, please try again.");
		} else {
			System.out.println("You got it right!! Great work!");
		}
		

		keyboardInput.close();

	}

}

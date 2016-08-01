import java.util.Scanner;

public class Lesson_31_Ex1 {
	/*
	 * Exercise 1

        Write a program that asks how many states are in the USA.
        If they guess anything other than the correct answer (50),
        then use a nested if statement to tell them if their guess 
        was too low or too high.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboardInput = new Scanner(System.in);
		int states = 50;
		int guess = 0;
		
		System.out.println("How many states are in the USA? ");
		guess = keyboardInput.nextInt();
		
		if (guess == states) System.out.println("Correct!!!");
		
		else System.out.println("Not quite...");
		if (guess > states) System.out.println("Your guess was too high! Try again.");
		if (guess < states) System.out.println("Your guess was too low! Try again.");
		
		
	}

}

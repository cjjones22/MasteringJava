import java.util.Scanner;

public class Lesson_37_Ex1 {
	/*
	 * Exercise 1

        Write a program that asks the user to guess a number between
        1 and 20.  The "correct" number is 17.  If 17 is not entered, 
        the program says that the wrong guess was entered, and tells 
        user if the guess was too low or too high.
        If 17 was entered, the program tells the user they were correct.

        Wrap the relevant code inside of a do-while loop so that the user
        can continue to place guesses without re-running the program. 
        Use the Scanner class to read in the numeric keyboard entry.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int guess = 0;
		int correctNumber = 17;
		
		do {
			System.out.println("Please guess a number between 1 and 20. ");
			if (input.hasNextInt() == true ) guess = input.nextInt();
		
			if (guess > correctNumber) 
					System.out.println("Incorrect! You guessed " + guess + ". Too high, try again!");

			if (guess < correctNumber)
					System.out.println("Incorrect! You guessed " + guess + ". Too low, try again");

		} while (guess != correctNumber);

		System.out.println("You guessed " + guess +". Correct!!");
		
		input.close();

	}

}

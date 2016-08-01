import java.util.Scanner;

public class Lesson_47_Ex1 {
	/*
	 * Exercise 1

        In the main method, ask the user to separately input two integers from 1 to 100.
        Store the user input into variables.  Create a method that will take as parameters
        these two values and determine which one is the larger number.  The method will
        then return the larger of the two numbers and display the answer to the user.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		int guess1 = 1, guess2 = 2;
		
		System.out.println("Input two integers from 1 to 100");
		
		System.out.println("Input the first integer from 1 to 100: ");
		if(input.hasNextInt() == true) guess1 = input.nextInt();
		
		System.out.println("Input the second number from 1 to 100: ");
		if(input.hasNextInt() == true) guess2 = input.nextInt();
		
		System.out.println("The larger number is: " + greaterThan(guess1, guess2));

		input.close();
	}
	
	public static int greaterThan(int x, int y) {
		if(x > y) return x;

		else return y;
	}

}

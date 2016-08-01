import java.util.Scanner;

public class Lesson_76_Ex1 {
	/*
	 * Exercise 1

        Use the scanner method to read a string in from the keyboard.
        Then, convert the string to uppercase and display the new
        string back to the screen.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = "";
		
		System.out.println("Enter a sentence: ");
		str = input.nextLine();
		System.out.println(str.toUpperCase());

	}

}

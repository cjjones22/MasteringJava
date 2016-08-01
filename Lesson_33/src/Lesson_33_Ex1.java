import java.util.Scanner;

public class Lesson_33_Ex1 {
	/*
	 * Exercise 1

        Write a program that asks a user to entered their favorite Month.
        Use 1 = January, 2 = February, etc.
        Use a switch statement to output the following:

        Output the following based on what was chosen by the user:

        January is my favorite Month!
        February is my favorite Month!
        March is my favorite Month!
        April is my favorite Month!
        May is my favorite Month!
        June is my favorite Month!
        July is my favorite Month!
        August is my favorite Month!
        September is my favorite Month!
        October is my favorite Month!
        November is my favorite Month!
        December is my favorite Month!
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int month = 1;
		
		System.out.println("What is your favorite month of the year? (1 = Jan, etc): ");
		if(input.hasNextInt() == true) month = input.nextInt();
		
		switch(month) {
			case 1:
				System.out.println("January is my favorite Month!");
				break;
			case 2:
				System.out.println("February is my favorite Month!");
				break;
			case 3:
				System.out.println("March is my favorite Month!");
				break;
			case 4:
				System.out.println("April is my favorite Month!");
				break;
			case 5:
				System.out.println("May is my favorite Month!");
				break;
			case 6:
				System.out.println("June is my favorite Month!");
				break;
			case 7:
				System.out.println("July is my favorite Month!");
				break;
			case 8:
				System.out.println("August is my favorite Month!");
				break;
			case 9:
				System.out.println("September is my favorite Month!");
				break;
			case 10:
				System.out.println("October is my favorite Month!");
				break;
			case 11:
				System.out.println("November is my favorite Month!");
				break;
			case 12:
				System.out.println("December is my favorite Month!");
				break;
			default:
				System.out.println("Hey! That's not a month!");
		}

		input.close();
	}

}

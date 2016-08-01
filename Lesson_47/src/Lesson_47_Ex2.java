import java.util.Scanner;

public class Lesson_47_Ex2 {
	/*
	 * Exercise 2

        In the main method, ask the user to separately input three grades from 0 to 100.
        Since these are grades they should be stored as double values.  Create a method
        that will take as parameters these 3 grades and average them (add them up and 
        divide by 3).  The method then returns the answer to the main method and the answer
        is displayed to the user.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int grade1 = 0, grade2 = 0, grade3 = 0;
		
		System.out.println("Input three grades from 0 - 100.");

		System.out.println("Grade 1: ");
		if(input.hasNextInt() == true) grade1 = input.nextInt();
		
		System.out.println("Grade 2: ");
		if(input.hasNextInt() == true) grade2 = input.nextInt();
		
		System.out.println("Grade 3: ");
		if(input.hasNextInt() == true) grade3 = input.nextInt();
		
		System.out.println("Your grade average is: " + gradeAvg(grade1, grade2, grade3));
		
		input.close();
	}
	
	public static double gradeAvg(double x, double y, double z) {
		return (x + y + z) / 3.0;
	}

}

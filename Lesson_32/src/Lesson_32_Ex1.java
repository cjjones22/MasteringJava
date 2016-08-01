import java.util.Scanner;

public class Lesson_32_Ex1 {
	/*
	 * Exercise 1

        Write a program that asks what grade a student received on an
        exam.  Using an if-else-if ladder, output the following:

        If grade falls between		Output
        Greater than or equal to 90	You earned an A on the Exam!
        Between 80 and 90		You earned a B on the Exam!
        Between 70 and 80		You earned a C on the Exam!
        Between 60 and 70		You earned a D on the Exam!
        Less than 60		 	You earned an F on the Exam!
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Grade received between 100 - 0? ");
		if (input.hasNextInt() == true) grade = input.nextInt();
		
		if (grade >= 90) System.out.println("You earned an A on the Exam!");
		else if ((grade < 90) && (grade >= 80)) System.out.println("You earned a B on the Exam!");
		else if ((grade < 80) && (grade >= 70)) System.out.println("You earned a C on the Exam!");
		else if ((grade < 70) && (grade >= 60)) System.out.println("You earned a D on the Exam!");
		else System.out.println("You earned an F on the Exam!");


		input.close();
	}

}

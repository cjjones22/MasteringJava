
public class Lesson_36_Ex1 {
	/*
	 * Exercise 1

        Write a program that uses a while loop to calculate the sum
        of all numbers from 1 to 100, then output the result to the screen.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		int sum = 0;
		
		while (number <= 100) {
			System.out.println(number + " + " + sum + " = " + (number + sum));
			sum = number + sum;
			number++;
		}

	}

}

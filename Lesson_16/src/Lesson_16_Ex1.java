
public class Lesson_16_Ex1 {
	/*
	 * Exercise 1

	 * Write a program that uses a for loop to output the following countdown.
	 * Notice that there is a blank line between every number

	 * 10

	 * 9

	 * 8

	 * 7

	 * 6

	 * 5

	 * 4

	 * 3

	 * 2

	 * 1

	 * Blastoff!
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter;
		
		for(counter = 10; counter >= 1; counter--)
			System.out.println(counter + "\n");
		
		System.out.println("Blastoff!");

	}

}

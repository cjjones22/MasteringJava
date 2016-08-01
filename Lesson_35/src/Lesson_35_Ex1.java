
public class Lesson_35_Ex1 {
	/*
	 * Exercise 1

        Write a program that uses a for loop with continue statement
        to print out all even numbers between 1 and 100.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i = 1; i <= 100; i++) {
			if(i % 2 == 0)
				System.out.println(i + " Even");
				continue;
		}

	}

}

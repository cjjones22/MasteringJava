import java.util.Scanner;

public class Lesson_29 {
	
	/*
	 * nextInt()
	 * nextDouble()
	 * 
	 * hasNextInt()
	 * hasNextDouble()
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboardInput = new Scanner(System.in);
		
		int test;
		double doubleNumber = 0;

		System.out.println("Enter any integer: ");

		test = keyboardInput.nextInt();
		
		System.out.println("You entered the number: " + test);
		
		System.out.println("Enter any decimal number: ");
		
		if(keyboardInput.hasNextDouble() == true) doubleNumber = keyboardInput.nextDouble();
			
		System.out.println(doubleNumber);


	}

}

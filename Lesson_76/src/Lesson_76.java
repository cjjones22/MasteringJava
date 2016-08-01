import java.util.Scanner;

public class Lesson_76 {
	/*
	 * Reading a string from the keyboard
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str = "";
		
		System.out.println("Enter your full name: ");
		str = input.nextLine();
		
		System.out.println(str);

		input.close();
	}

}

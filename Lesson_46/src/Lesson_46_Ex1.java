import java.util.Scanner;

public class Lesson_46_Ex1 {
	/*
	 * Exercise 1

        In the main method, ask the user to input a season by entering
        a number (1=Spring, 2=Summer, 3=Fall, 4=Winter).

        Depending on what number the user enters, call one of the four
        methods named and described as follows:

        printSpring
        In this method, display "The season is Spring, and flowers are blooming!"

        printSummer
        In this method, display "The season is Summer, and it is getting hot!"

        printFall
        In this method, display "The season is Fall, and leaves are falling!"

        printWinter
        In this method, display "The season is Winter, and it is snowing!"
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please input a season (1 = Sprint, 2 = Summer, 3 = Fall, 4 = Winter)");
		Scanner input = new Scanner(System.in);
		int season = 0;
		
		if (input.hasNextInt() == true) season = input.nextInt();
		
		switch (season) {
			case 1: printSpring();
			break;
			
			case 2: printSummer();
			break;
			
			case 3: printFall();
			break;
			
			default: printWinter();
			break;
		}
		
		input.close();
		
	}
	
	public static void printSpring() {
		System.out.println("The season is Spring, and flowers are blooming!");
	}
	
	public static void printSummer() {
		System.out.println("The season is Summer, and it is getting hot!");
	}
	
	public static void printFall() {
		System.out.println("The season is Fall, and leaves are falling!");
	}
	
	public static void printWinter() {
		System.out.println("The season is Winter, and it is snowing!");
	}
	
}

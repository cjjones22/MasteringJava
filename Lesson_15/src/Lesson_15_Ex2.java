
public class Lesson_15_Ex2 {
	/*
	 * Exercise 2

	 * Car 1 has mileage 86000.  Car 2 has mileage 101000.

	 * Write a program that uses IF statements to evaluate and output the following:

	 * If Car 1 mileage is less than or equal to car 2, then output, "Car 1 mileage is 
	 * less than or equal to than Car 2."
	 * If car2 has mileage of 101000, then output "Car 2 has mileage of 101000."
	 * If Car 2 has mileage less than car 1, then output "I will eat my foot if this 
	 * prints on the screen."
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int car1 = 86000, car2 = 101000;
		
		if (car1 <= car2) System.out.println("Car 1 mileage is less than or equal to Car 2.");
		
		if (car2 == 101000) System.out.println("Car 2 has mileage of 101000.");
		
		if (car2 < car1) System.out.println("I will eat my foot if this prints to the screen.");

	}

}

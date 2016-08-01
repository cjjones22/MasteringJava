
public class Lesson15_Ex1 {
	/*
	 * Exercise 1

	 * Jenny is 14 years old, Danny is 6 years old, and Claire is 6 years old.

	 * Write a program that uses the IF statements to output the following text.

	 * If Jenny is older than Danny, then output "Jenny is older than Danny."
	 * If Danny is older than Jenny, then output "Danny is older than Jenny."
	 * If Danny is the same age as Jenny, then output "Danny is the same age as Jenny."
	 * If Danny is the same age as Claire, then output "Danny is the same age as Claire."
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jenny = 14, danny = 6, claire = 6;
		
		if (jenny > danny) System.out.println("Jenny is older than Danny.");
		if (danny > jenny) System.out.println("Danny is older than Jenny.");
		if (danny == jenny) System.out.println("Danny is the same age as Jenny.");
		if (danny == claire) System.out.println("Danny is the same age as Claire.");

	}

}

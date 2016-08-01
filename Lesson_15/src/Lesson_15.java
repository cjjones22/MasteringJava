
public class Lesson_15 {
	/*
	 * Relational Operators for conditional expressions.
	 * 		<	Less than
	 * 		>	Greater than
	 * 		<=	Less than or equal to
	 * 		>=	Greater than or equal to
	 * 		==	Equal
	 * 		!=	Not equal
	 * 
	 * 		if (condition is true) statement;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 4;
		double a, b, c;
		
		if (x < y) System.out.println("x is less than y.");
		
		if (x == y) System.out.println("x is equal to y.");

		a = 3.45;
		b = 4.25;
		c = 3.45;
		
		if (a == c) System.out.println("a is equal to c.");
		
		if (b >= a) System.out.println("b is greater than or equal to a.");
		
		if (a != b) System.out.println("a is not equal to b.");
		
		if (a != c) System.out.println("a is not equal to c."); // won't print, condition false.
	}

}

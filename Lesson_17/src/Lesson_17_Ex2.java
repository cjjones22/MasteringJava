
public class Lesson_17_Ex2 {
	/*
	 * Exercise 2

        Write a program that converts inches to feet.  Start at 1 inch and continue
        in the pattern 1 inch, 2 inches, 3 inches, 4 inches.....20 inches.  The output
        should look like:

        1 inches is equal to <answer> feet.
        2 inches is equal to <answer> feet.
        3 inches is equal to <answer> feet.
        4 inches is equal to <answer> feet.

        5 inches is equal to <answer> feet.
        <continue converting and printing up to 20 inches>

        Note: There is a blank line inserted after every 4th printed entry.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inches, feet;
		int counter = 0;
		
		for (inches = 1; inches <= 20; inches ++) {
			feet = inches / 12;
			System.out.println(inches + " inches is equal to " + feet + ".");

			counter ++;
			if (counter % 4 == 0)
				System.out.println();
		}

	}

}

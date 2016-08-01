
public class Lesson_17_Ex3 {
	/*
	 * Exercise 3

        Alter the program that you wrote in Exercise 2 so that the output is as follows:

        1 inch is equal to <answer> feet.
        2 inches is equal to <answer> feet.
        3 inches is equal to <answer> feet.
        4 inches is equal to <answer> feet.

        5 inches is equal to <answer> feet.
        <continue converting and printing up to 20 inches>

        Note: Notice that it prints "1 inch" and all other entries use "inches" 
        such as "2 inches", etc.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double inches, feet;
        int counter = 0;
		
		for (inches = 1; inches <= 20; inches ++) {
			feet = inches / 12;
			if (inches < 2) {
				System.out.println(inches + " inch is equal to " + feet + ".");
			}
			if (inches >= 2) {
				System.out.println(inches + " inches is equal to " + feet + ".");
			}
			counter ++;
			if (counter % 4 == 0)
				System.out.println();
		}

	}

}

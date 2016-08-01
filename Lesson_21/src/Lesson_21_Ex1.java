
public class Lesson_21_Ex1 {
	/*
	 * Exercise 1

        Create a boolean variable called "bool".
        Assign a value of true to this variable.  If bool is equal
        to true then output the following to the screen 4 times using a loop.
        Make sure to pass the bool variable to the println() statement 
        to print to the screen.

        The value of the variable is true.
        The value of the variable is true.
        The value of the variable is true.
        The value of the variable is true.

        If the value of bool is false, output the following line 4 times:

        The value of the variable is false.
        The value of the variable is false.
        The value of the variable is false.
        The value of the variable is false.

        Change the value of bool from true to false and re-run the program.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bool = true;
		int counter;
		
		if (bool) {
			for (counter = 1; counter <= 4; counter++) {
				System.out.println("The value of the variable is " + bool + ".");
			}
		}
		
		if (!bool) {
			for (counter = 1; counter <= 4; counter++) {
				System.out.println("The value of the variable is " + bool + ".");
			}
		}
	}

}

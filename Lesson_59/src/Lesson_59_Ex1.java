
public class Lesson_59_Ex1 {
	/*
	 * Exercise 1

        Create an array with 100 elements that will hold integer values.
        Loop through the array and for each element, store the square of
        the element index.  For example, for element [2], you would store
        the value of 4 in that location.  For element [3], store 9 and so
        on.  Print out the element number and the contents of the array to 
        the screen as follows:

        The square of 0 is 0
        The square of 1 is 1
        The square of 2 is 4
        ....and so on for the entire array.
	 */

	public static void main(String[] args) {
	
		int doubles[] = new int[100];
		int x;
		
		for(x = 0; x <= 99; x++) {
			doubles[x] = x * x;
		}
		
		for(x = 0; x <= 99; x++) {
			System.out.println("The square of " + x + " is " + doubles[x]);
		}

	}

}

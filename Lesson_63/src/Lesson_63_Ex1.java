
public class Lesson_63_Ex1 {
	/*
	 * Exercise 1

        Create an 8 element array with the following data:
        12, 43, 54, 2, 7, 33, 65, 4

        Use an enhanced for loop to search through this array and print out
        the maximum and minimum elements of the array.
	 */

	public static void main(String[] args) {
		int chrisArray[] = {12, 43, 54, 2, 7, 33, 65, 4};
		int min = chrisArray[0];
		int max = chrisArray[0];
		
		for(int value : chrisArray) {	// go through loop and examine each value
			if (value < min) min = value;
			if ( value > max) max = value;
		}
		
		System.out.println("Min value of chrisArray is: " + min);
		System.out.println("Max value of chrisArray is: " + max);

	}

}

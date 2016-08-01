
public class Lesson_60 {

	/*
	 * Search for the max and min value of an array.
	 */

	public static void main(String[] args) {

		int largeArray[] = {8, 11, 12, 13, 2, 25, 65, 34, 54, 99, 76, 87, 10, 54};
		int smallest = largeArray[0];
		int largest = largeArray[0];
		
		for(int i = 0; i <= 13; i++) {

			if(largeArray[i] < smallest) smallest = largeArray[i];

			if(largeArray[i] > largest) largest = largeArray[i];

		}

		System.out.println("The smallest value in the array is: " + smallest);

		System.out.println("The largest value in the array is: " + largest);

	}

}

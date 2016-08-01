
public class Lesson_71_Ex1 {
	/*
	 * Exercise 1

        Create an array of length 4 to hold string elements.  Store these strings
        in the array when this array is initialized:  "popeye" "the" "sailor" "man".

        Create a second array of length 5 to hold string elements.  After this array
        is created, store the following strings into the 5 elements:
        Here
        I 
        Come
        To Save
        The Day!

        Print out the contents of both arrays to the screen to reassemble the phrases.
	 */

	public static void main(String[] args) {
		String array1[] = new String[4];
		String array2[] = new String[5];
		
		array1[0] = "popeye";
		array1[1] = "the";
		array1[2] = "sailor";
		array1[3] = "man";
		
		array2[0] = "Here";
		array2[1] = "I";
		array2[2] = "Come";
		array2[3] = "To Save";
		array2[4] = "The Day!";
		
		System.out.println(array1[0] + " " + array1[1] + " " + array1[2] + " " + array1[3]);
		System.out.println(array2[0] + " " + array2[1] + " " + array2[2] + " " + array2[3]+ " " + array2[4]);

	}

}

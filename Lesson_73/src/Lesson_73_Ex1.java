
public class Lesson_73_Ex1 {
	/*
	 * Exercise 1

        Create a string that holds the following:
        "Humpty Dumpty Sat On The Wall."

        Copy each character from this string 
        and put it into a Char Array.  Then, use this array
        to print the string backwards to the screen.
	 */

	public static void main(String[] args) {
		String str1 = "Humpty Dumpty Sat On The Wall.";
		char array1[] = new char[30];
		
		str1.getChars(0, 30, array1, 0);;
		System.out.println(array1);
		
		for(int i = 29; i >= 0; i--) {
			System.out.print(array1[i]);
		}
	}

}

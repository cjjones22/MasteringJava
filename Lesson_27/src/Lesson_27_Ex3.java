
public class Lesson_27_Ex3 {
	/*
	 * Exercise 3

        Write a program to have the user type in a lowercase character and
        convert it to uppercase.  

        Output: "Type in any LOWERCASE letter: "

        Subtract 32 to the lowercase character to change it into upper case.  
        Output the following:

        "You typed in the letter: <lowercase character>"
        "The Uppercase version is: <uppercase character>"
	 */

	public static void main(String[] args) 
		throws java.io.IOException {

		int lowerCase, upperCase;
		
		System.out.println("Type in any LOWERCASE letter: ");
		lowerCase = System.in.read();
		
		System.out.println("You typed in the letter: " + (char)lowerCase);

		upperCase = lowerCase - 32;
		
		System.out.println("The Uppercase version is: " + (char) upperCase);
	}

}

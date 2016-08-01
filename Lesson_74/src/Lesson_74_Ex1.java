
public class Lesson_74_Ex1 {
	/*
	 * Exercise 1

        Create a string named password and store this inside:
        "apples".

        Create a new string named passwordTypedIn that holds 
        the phrase "APPLES".  This represents what a user typed
        in for the password (they forgot the caps lock on).

        Convert this to lower case and use an IF statement such that 
        if the password is valid a "password accepted" message is shown 
        on the screen.
	 */

	public static void main(String[] args) {
		String str = "apples";
		String passwordTypedIn = "APPLES";
		
		if(passwordTypedIn.toLowerCase().equals(str) == true) System.out.println("password accepted");


	}

}

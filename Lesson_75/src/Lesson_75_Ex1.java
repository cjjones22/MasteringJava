
public class Lesson_75_Ex1 {
	/*
	 * Exercise 1

        Create a string and put the following phrase in it:
        "jason went to washington dc."

        Print out the original string to the screen, then
        replace the j with J
        replace the w with W
        replace the dc with DC

        Then print out the string again.
	 */

	public static void main(String[] args) {
		String str = "jason went to washington dc";
		
		System.out.println(str);
		str = str.replace('j', 'J');
		str = str.replace('w', 'W');
		str = str.replace("dc", "DC");
		System.out.println(str);
	}

}

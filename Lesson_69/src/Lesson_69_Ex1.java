
public class Lesson_69_Ex1 {
	/*
	 * Exercise 1

        Create four strings, exactly as shown below.
        
        The first should contain the text "living zebras"
        The second should contain "juicy oranges"  
        The third should contain "do the victory dance"
        The fourth should contain "tusk of an elephant"

        Print all four strings to the screen, THEN:
        Read the 1st character from the 1st string and print the character to the screen.
        Read the 7th character from the 2nd string and print the character to the screen.
        Read the 8th character from the 3rd string and print the character to the screen.
        Read the 12th character from the 4th string and print the character to the screen.
	 */

	public static void main(String[] args) {
		String str1 = "living zebras";
		String str2 = "juicy oranges";
		String str3 = "do the victory dance";
		String str4 = "tusk of an elephant";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("1st character of string 1 is: " + str1.charAt(0));
		System.out.println("7th character of string 2 is: " + str2.charAt(6));
		System.out.println("8th character of String 3 is: " + str3.charAt(7));
		System.out.println("12th character of String 4 is: " + str4.charAt(11));
		
	}

}

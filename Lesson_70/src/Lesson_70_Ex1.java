
public class Lesson_70_Ex1 {
	/*
	 * Exercise 1

        Create four strings, exactly as shown below.
        
        The first should contain the text "living zebras"
        The second should contain "juicy oranges"  
        The third should contain "do the victory dance"
        The fourth should contain "tusk of an elephant"

        Print all four strings to the screen, THEN:
        Search the 1st string for the substring "zebras" and print its index to the screen.
        Search the 2nd string for the substring "or" and print its index to the screen.
        Search the 3rd string for the substring "dan" and print its index to the screen.
        Search the 4th string for the substring "of an" and print its index to the screen.
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
		
		System.out.println(str1.indexOf("zebras"));
		System.out.println(str2.indexOf("or"));
		System.out.println(str3.indexOf("dan"));
		System.out.println(str4.indexOf("of an"));

	}

}


public class Lesson_68_Ex1 {
	/*
	 * Exercise 1

        Create four strings, exactly as shown below.
        
        The first should contain the text "apple pie"
        The second should contain "zebras"  
        The third should contain "bubble gum"
        The fourth should contain "Fish Sticks"

        Print all four strings to the screen, THEN:
        Compare string 1 with string 2 and print to the screen if string 1 is less or greater.
        Compare string 1 with string 3 and print to the screen if string 1 is less or greater.
        Compare string 3 with string 1 and print to the screen if string 3 is less or greater.
        Compare string 4 with string 1 and print to the screen if string 4 is less or greater.
	 */

	public static void main(String[] args) {
		String str1 = "apple pie";
		String str2 = "zebras";
		String str3 = "bubble gum";
		String str4 = "Fish sticks";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		if(str1.compareTo(str2) < 0) System.out.println("String 1 is greater than String 2");

		if(str1.compareTo(str3) < 0) {
			System.out.println("String 1 is greater than String 3");
		} else {
			System.out.println("String 3 is greater than String 1");
		}
			
		if(str3.compareTo(str1) < 0){
			System.out.println("String 3 is greater than String 1");
		} else {
			System.out.println("String 1 is greater than String 3");
		}

		if(str4.compareTo(str1)< 0) System.out.println("String 4 is less than String 1");

	}

}

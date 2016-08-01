
public class Lesson_68 {
	/*
	 * Comparing 2 Strings
	 */

	public static void main(String[] args) {
		String str1 = "apples are my favorite fruit";
		String str2 = "apricots are delicious";
		String str3 = "insects are gross";
		
		System.out.println(str1);
		System.out.println(str2);

		// checks to see which is alphabetically first
		if(str1.compareTo(str2) > 0) System.out.println("String 1 comes after String 2");

		if(str1.compareTo(str2) < 0) System.out.println("String 1 comes before String 2");

		if(str1.compareTo(str2) == 0) System.out.println("String 1 is eaual to String 2");
	}

}

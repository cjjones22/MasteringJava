
public class Lesson_75 {
	/*
	 * Replacing characters in a string
	 */

	public static void main(String[] args) {

		String str = "I love going to the amusement park in florida";
		
		System.out.println(str);
		str =str.replace('f', 'F');		// will replace all instances of f into F
		System.out.println(str);
		
		str = str.replace("Florida", "Texas");		//replaces string sequence
		System.out.println(str);
	}

}

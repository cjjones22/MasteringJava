
public class Lesson_71 {
	/*
	 * Arrays of Strings
	 */

	public static void main(String[] args) {
//		int array[] = {2,3,4,5};
		
		String sentence[] = {"I", "love", "to travel to", "far away", "places"};
		String array2[] = new String[3];
		
		System.out.println(sentence[0] + " " + sentence[1] + " " + sentence[2] + " " + sentence[3] + " " + sentence[4]);

		sentence[4] = "continents"; //modified last word
		
		System.out.println(sentence[0] + " " + sentence[1] + " " + sentence[2] + " " + sentence[3] + " " + sentence[4]);
		
		array2[0] = "buttercups are awesome";
		array2[1] = "I do love to take walks in the park";
		array2[2] = "I love spaghetti";
		
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
	}

}

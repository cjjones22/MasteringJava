
public class Lesson_73 {
	/*
	 * Read characters from a string into a char array
	 */

	public static void main(String[] args) {
		String str = "Jason Gibson";
		char array[] = new char[15];
		
		System.out.println(array);
		str.getChars(0, 12, array, 0);
		System.out.println(array);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println(array[5]);
		System.out.println(array[6]);
		System.out.println(array[7]);
		System.out.println(array[8]);
		System.out.println(array[9]);
		System.out.println(array[10]);
		System.out.println(array[11]);

	}

}

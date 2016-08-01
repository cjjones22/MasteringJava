
public class Lesson_59 {
	/*
	 * Using a loop to access an array
	 */

	public static void main(String[] args) {

		double grades[] = {96.5, 98.7, 99.3, 88.4, 88.6, 90.1};
		double max;
		
		int i;
		
		max = grades[0];
		
		for(i = 0; i <= 5; i++) {
			if (grades[i] > max) max = grades[i];	
			
		}

		System.out.println("The max grade we have in the class is: " + max);
		
	}

}

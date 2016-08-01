
public class Lesson_18_Ex1 {
	/*
	 * Exercise 1

        Lightspeed is 186,282 miles per second.  Write a program
        to calculate how far a lightbeam will travel after 300 minutes
        and output the result to the screen.  Note that the answer
        will need to be held in a "long" variable.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long distance;
		int minutes = 300;
		
		distance = 186282L * minutes * 60;
		
		System.out.println("Distance traveled after 300 minutes is " + distance + " miles");

	}

}


public class Lesson_58_Ex2 {
	/*
	 * Exercise 2

        Declare and initialize an array of type double named dailyTemp,
        which will have 7 elements.  This array holds the high temperature
        recorded on 7 days of a given week.  Initialize the array to the following
        data when you declare the array.

        87.5
        90.0
        91.2
        88.8
        88.6
        87.5
        89.2

        Next, print out this data to the screen by accessing the elements and 
        using System.out.println();
	 */
	public static void main(String[] args) {
		
		double dailyTemp[] = {87.5, 90.0, 91.2, 88.8, 88.6, 87.5, 89.2};

//		double dailyTemp[] = new double[7];
//		
//		dailyTemp[0] = 87.5;
//		dailyTemp[1] = 90.0;
//		dailyTemp[2] = 91.2;
//		dailyTemp[3] = 88.8;
//		dailyTemp[4] = 88.6;
//		dailyTemp[5] = 87.5;
//		dailyTemp[6] = 89.2;

		System.out.println("Sunday's temperature is " + dailyTemp[0] + " degrees.");
		System.out.println("Monday's temperature is " + dailyTemp[1] + " degrees.");
		System.out.println("Tuesday's temperature is " + dailyTemp[2] + " degrees.");
		System.out.println("Wednesday's temperature is " + dailyTemp[3] + " degrees.");
		System.out.println("Thursday's temperature is " + dailyTemp[4] + " degrees.");
		System.out.println("Friday's temperature is " + dailyTemp[5] + " degrees.");
		System.out.println("Saturday's temperature is " + dailyTemp[6] + " degrees.");
	}

}

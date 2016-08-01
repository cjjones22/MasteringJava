
public class Lesson_22_Ex1 {
	/*
	 * Exercise 1

        Declare an integer named length and initialize it
        to 10 on the same line.  

        On the same line, declare and initialize two more 
        integers named "width" and "height".  
        Initialize these to 12 and 15 respectively.

        Declare a final integer named "volume" and initialize it
        to be equal to "length * width * height".  The "volume"
        variable is dynamically initialized to a value that is 
        calculated when the program runs.

        Print out the value of the volume to the screen.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 10; 
		int width = 12, height = 15;
		
		int volume = length * width * height;

		System.out.println("The volume is: " + volume);
	}

}

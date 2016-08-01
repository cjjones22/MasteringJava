
public class Lesson_66_Ex1 {
	/*
	 * Exercise 1

        Create four strings.  
        The first should contain the text "The itsy bitsy spider"
        The second should contain " climed up the water spout."  
        The third should contain " Down came the rain, "
        The fourth should contain "and washed the spider out."

        Use the length() method and the println() method to print out
        the length of each of the four strings above.
	 */

	public static void main(String[] args) {
		String one = "The itsy bitsy spider";
		String two = " climbed up the water spout.\n";
		String three = "Down came the rain, ";
		String four = "and washed the spider out.";
		
		System.out.println("Length of first string: " + one.length());
		System.out.println("Length of second string: " + two.length());
		System.out.println("Length of third string: " + three.length());
		System.out.println("Length of fourth string: " + four.length());
	}

}

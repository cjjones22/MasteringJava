
public class Lesson_28 {

	public static void main(String[] args) 
		throws java.io.IOException {
		// TODO Auto-generated method stub
		char input;
		
		System.out.println("Press any key, then press ENTER: ");
		input = (char) System.in.read();
		System.out.println("You entered the key: " + input);
		
		input = (char) System.in.read();	// line feed & carriage return
		
		System.out.println("\nPress any second key: ");
		input = (char) System.in.read();
		System.out.println("The second key was: " + input);

	}

}

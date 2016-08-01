
public class Lesson_27_Ex1 {
	/*
	 * Exercise 1

        Create a true/false question.  
        Output the following:

        "The capital of the United States is Washington, DC? (Answer T or F): "

        If the user enters 'T', then output, "Correct!"
        If user answers 'F', then output, "Incorrect!"
	 */

	public static void main(String[] args) 
		throws java.io.IOException{

		char input;
		
		System.out.println("The capital of the United States is Washington, DC? (Answer T or F): ");
		
		input = (char) System.in.read();
		
		if (input == 'T') System.out.println("Correct!");
		if (input == 'F') System.out.println("Incorrect!");
	}

}

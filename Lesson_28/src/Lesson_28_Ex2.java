
public class Lesson_28_Ex2 {
	/*
	 * Exercise 2

        Output the following:
        "Is it sunny outside? (Enter Y or N)"

        Accept the user input as a character entry.

        Then output the following:
        "Is it warm outside?  (Enter Y or N)"

        Accept the user input as a character entry.

        If the user answers Y then Y, output: "It is sunny and warm outside."
        If the user answers Y then N, output: "It is sunny and cold outside."
        If the user answers N then Y, output: "It is cloudy and warm outside."
        If the user answers N then N, output: "It is cloudy and cold outside."
	 */

	public static void main(String[] args) 
		throws java.io.IOException {
		// TODO Auto-generated method stub
			char answer1, answer2;
			char invisible;
			
			System.out.println("Is it sunny outside? (Enter Y or N)");
			
			answer1 = (char) System.in.read();

			invisible = (char) System.in.read();
			
			System.out.println("Is it warm outside? (Enter Y or N)");
			answer2 = (char) System.in.read();
			
			if ((answer1 == 'Y') && (answer2 == 'Y')) System.out.println("It is sunny and warm outside.");
			if ((answer1 == 'Y') && (answer2 == 'N')) System.out.println("It is sunny and cold outside.");
			if ((answer1 == 'N') && (answer2 == 'Y')) System.out.println("It is cloudy and warm outside.");
			if ((answer1 == 'N') && (answer2 == 'N')) System.out.println("It is cloudy and cold outside.");

	}

}

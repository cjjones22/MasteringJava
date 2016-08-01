
public class Lesson_28_Ex1 {
	/*
	 * Exercise 1

        Recall that in the ASCII table, 'A' corresponds to an integer of 65
        and 'Z' corresponds to an integer value of 90.

        Output the following:
        "Enter any CAPITAL letter from the keyboard: "

        Accept the user input, but store it as the raw integer value rather than the character.
        Then, construct a table of ASCII letters and the corresponding integers beginning from
        the letter that the user enters and continuing on until capital 'Z'

        For example, if the user enters 'A', the output is shown below.  
        But if the user enters, for example, 'R' then the table would begin with 'R' and 
        continue to 'Z'

        Letter		Ascii Value
        A		65
        B		66
        C		67
        .
        .
        .
        Z		90
	 */

	public static void main(String[] args) 
		throws java.io.IOException {
		// TODO Auto-generated method stub
			char letter;
			int letterValue;
			
			System.out.println("Enter any CAPITAL letter from the keyboard");
			System.out.println("Letter \t\tAscii Value");
			
			
			for (letter = (char) System.in.read(); letter <= 90; letter++) {
				letterValue = (int) letter;
				System.out.println(letter + "\t\t" + letterValue);
			}
	}

}

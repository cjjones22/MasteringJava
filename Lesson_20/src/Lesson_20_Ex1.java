
public class Lesson_20_Ex1 {
	/*
	 * Exercise 1

        Write a program that uses a for loop to print out
        the alphabet from A->Z as follows:

        A	a
        B	b
        C	c
        D	d
        ....and on until Z.

        Note that there is a tab between the columns.  Uppercase
        letter is on the left and lowercase on the right.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		
		char upperCase = 'A';
		char lowerCase = 'a';
		
		for (i = 1; i <= 26; i++) {
			System.out.println(upperCase + "\t" + lowerCase);
			
			upperCase++;
			lowerCase++;
			
		}
		
	}

}
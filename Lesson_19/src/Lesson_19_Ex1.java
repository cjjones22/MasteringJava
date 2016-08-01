
public class Lesson_19_Ex1 {
	/*
	 * Exercise 1

        The java Math class contains a method called pow(x,y).  
        This method takes the number "x" and raises it to the 
        power "y".  X and y are double floating point numbers, and
        the method returns a double floating point number as the answer

        Write a program that computes the following:
        1.25^1
        1.25^2
        1.25^3

        And so on....

        Format the output as:

        1.25 raised to the power of <power> is equal to <answer>.  
        Increment the exponent from 1 to 20.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double exponent;

		for (exponent = 1; exponent <= 20; exponent++) {
			double answer = Math.pow(1.25, exponent);
			System.out.println("1.25 raised to the power of " + exponent + " is equal to " + answer);
		}

	}

}

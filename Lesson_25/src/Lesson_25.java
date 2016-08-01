
public class Lesson_25 {
	/*
	 * 		&&		Logical AND			"A and B"
	 * 		||		Logical OR			"A or B"
	 * 		!		Logical NOT			"Invert State"
	 * 		^		Logical XOR			"A or B but not both"
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		boolean b;
		
		a = 10;
		b = true;
		
		if (a != 10) System.out.println("Sucess!");	//won't print
		if ((a == 10) && (b == true)) System.out.println("Success!");
		if ((a == 10) || (b == true)) System.out.println("Success!");
		if ((a == 10) ^ (b == true)) System.out.println("Sucess!"); //won't print
	}

}

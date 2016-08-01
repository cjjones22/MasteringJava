
public class Lesson_17_Ex1 {
	/*
	 * Exercise 1

     *   Assign a variable called "age" the value of 35;
     *   Using IF statements, do the following:

     *  If the age is greater than or equal to 30 
     *  then output the following using separate println() statements:

     *          Oh no, I am older than 30 years old!
     *          I may be a little older,
     *          but I am definitely a little wiser!

     *   If the age is less than 30 then output:

                Roses are Red,
                And Violets are Blue.
                I am less than 30,
                And I like kung-fu!

        Change the value of "age" to 25 and re-run the program to ensure
        that it works properly.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 30;
		
		if (age >= 30) {
			System.out.println("Oh no, I am older than 30 years old!");
			System.out.println("I may be a little older,");
			System.out.println("but I am definitely a little wiser!");
		}
		
		if (age < 30) {
			System.out.println("Roses are Red,");
			System.out.println("And violets are Blue.");
			System.out.println("I am less than 30,");
			System.out.println("And I like kung-fu!");
		}

	}

}

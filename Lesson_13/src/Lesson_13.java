
public class Lesson_13 {
	/*
	 * Addition			===>	+
	 * Subtraction		===>	-
	 * Multiplication	===>	*
	 * Division			===>	/
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4;
		int sum, difference;
		int multiply, divide;
		
		num1 = 10;
		num2 = 3;
		num3 = 5;
		num4 = 2;
		
		sum = num1 + 5;
		difference = num3 - num2;
		multiply = num3 * num4;
		divide = num1 / num4;
		
		System.out.println("num1 + 5 = " + sum);
		System.out.println("num3 - num2 = " + difference);
		System.out.println();
		System.out.println("num3 * num4 = " + multiply);
		System.out.println();
		System.out.println("num1 / num4 = " + divide + "\n\n");
		
		System.out.println("num1 = " + num1);
		num1 = num1*6;
		System.out.println("The new value of num1 is: " + num1);

	}

}

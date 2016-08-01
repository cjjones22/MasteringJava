
public class Lesson_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 11;
		int num2 = 7;
		int answer1;
		int answer2;
		boolean answer3;
		
		answer1 = multNumbers(num1);
		answer2 = addNumbers(num1, num2);
		answer3 = equalNumbers(num1, num2);

		
		System.out.println("The result is: " + answer1);
		System.out.println("The answer to num1 + num2 is " + answer2);
		System.out.println("num1 and num2 are equal: " + answer3);
		
	}
	
	public static int multNumbers(int x) {
		int ans = x * 7;
		return ans;
	}
	
	public static int addNumbers(int x, int y) {
		int ans = x + y;
		return ans;
	}
	
	public static boolean equalNumbers(int r, int t) {
		if (r == t) return true;
		
		else return false;
	}

}

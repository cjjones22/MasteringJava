package factorial;

public class FactorialExample {

	public static void main(String[] args) {
		// E.g.	4! = 4*3*2*1
		System.out.println(calculateFactorial(30));

	}
	private static int calculateFactorial(int value) {
		System.out.println(value);
		
		if (value == 1) {
			return 1;
		}
		
		return calculateFactorial(value - 1) * value;
	}
	

}

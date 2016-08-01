
public class Lesson_23 {
	/*
	 * outer scope variables are visible to inner scopes but inner variables are not
	 * visible to outer scope.
	 * 
	 * can't name inner scope variables the same as outer scope variables.
	 * 
	 * variables destroyed after scope is completed.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 12;
		
		if (i > 5) {
			int k = -5;
			System.out.println("The value of i is " + i);
			System.out.println(k);
		}
		//System.out.println("The value of k is " + k);	//scope issue

	}

}

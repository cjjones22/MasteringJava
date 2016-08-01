
public class Lesson_24_Ex1 {
	/*
	 * Exercise 1

        using a loop with decrementing variable,
        produce the following output:

        140 times 2 equals <calculated answer>
        139 times 2 equals <calculated answer>
        138 times 2 equals <calculated answer>
        137 times 2 equals <calculated answer>
        136 times 2 equals <calculated answer>
        135 times 2 equals <calculated answer>
        134 times 2 equals <calculated answer>
        133 times 2 equals <calculated answer>
        132 times 2 equals <calculated answer>
        131 times 2 equals <calculated answer>
        130 times 2 equals <calculated answer>
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for (i = 140; i >= 130; i--) {
			int product = i * 2;
			System.out.println(i + " times 2 equals " + product);
		}

	}

}

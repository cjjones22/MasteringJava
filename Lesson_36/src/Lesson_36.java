
public class Lesson_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1; // define variable outside the loop for while loops.
		char letter = 'A';
		
		/*
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		*/
		
		while (i <= 10) {
			System.out.println("This loop is number " + i);
			i++;
		}
		
		while (letter <= 'Z') {
			System.out.println("The current letter is: " + letter);
			letter++;
		}

	}

}

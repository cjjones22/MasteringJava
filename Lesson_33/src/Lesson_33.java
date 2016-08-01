
public class Lesson_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		int numSiblings = 2;
		
		switch(grade) {
		case 'A':
			System.out.println("You got an A! Great job!");
			break;
		case 'B':
			System.out.println("You got a B! Good job!");
			break;
		case 'C':
			System.out.println("You got a C! You did okay.");
			break;
		case'D':
			System.out.println("You got a D. You did poorly.");
			break;
			
		default:
			System.out.println("You failed.");
			
		}

		switch(numSiblings) {
		case 0:
			System.out.println("You have zero siblings.");
			break;
		case 1:
			System.out.println("You have 1 sibling.");
			break;
		case 2:
			System.out.println("You have 2 siblings.");
			break;
		case 3:
			System.out.println("You have 3 siblings.");
		default:
			System.out.println("You have too many siblings to count!");
		}
	}

}

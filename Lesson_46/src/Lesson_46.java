
public class Lesson_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program start.\n");
		
		printFirstName();
		printLastName();
		addNames();
		
		System.out.println("Program end.");

	}
	
	public static void printFirstName() {
		System.out.println("My first name is Chris.");
	}
	
	public static void printLastName() {
		System.out.println("My last name is Jones.");
	}
	
	public static void addNames() {
		int chris = 5;
		int jones = 5;
		int sum;
		
		sum = chris + jones;
		
		System.out.println("The number of letters in my full name is: " + sum);
	}

}

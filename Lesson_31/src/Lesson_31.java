
public class Lesson_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temperature = 95;
		boolean sunny = true;
		
		if (temperature > 90) {
			System.out.println("It is hot outside.");
			if (sunny == true) System.out.println("It is also sunny outside.");
			else System.out.println("It is also cloudy outside.");
		}
		
		else {
			System.out.println("It is NOT hot outside.");
			if (sunny == true) System.out.println("It is also sunny outside.");
			else System.out.println("It is also cloudy outside.");
		}
	}

}


public class Lesson_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for(i = 1; i <= 30; i++) {

			if(i % 5 == 0) {
				System.out.println(i + " I like multiples of 5.");
				continue;
			}

			System.out.println(i);
		}

	}

}

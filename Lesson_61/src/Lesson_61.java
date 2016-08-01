
/*
 * 2 Demensional Arrays
 * 
 * 2   4   8   4
 * 11  12  9   5
 * 10  3   2   -2
 */
public class Lesson_61 {

	public static void main(String[] args) {
		
		int table[][] = new int[3][4];

		table[0][0] = 2;
		table[0][1] = 4;
		table[0][2] = 8;
		table[0][3] = 4;
		
		table[1][0] = 11;
		table[1][1] = 12;
		table[1][2] = 9;
		table[1][3] = 5;
		
		table[2][0] = 10;
		table[2][1] = 3;
		table[2][2] = 2;
		table[2][3] = -2;
		
		System.out.println(table[0][0] + " " + table[0][1] + " " + table[0][2] + " " + table[0][3]);
		System.out.println(table[1][0] + " " + table[1][1] + " " + table[1][2] + " " + table[1][3]);
		System.out.println(table[2][0] + " " + table[2][1] + " " + table[2][2] + " " + table[2][3]);
	}

}

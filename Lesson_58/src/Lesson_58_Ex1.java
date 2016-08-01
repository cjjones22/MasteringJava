
public class Lesson_58_Ex1 {
	/*
	 * Exercise 1

        Declare and initialize an array of type int named yearsMarried,
        which will have 5 elements.  This array holds how many years that
        families have been married on your street.  Store the following data 
        into the array by storing them into the individual elements of the array.  

        family 1 = 4 years
        family 2 = 3 years
        family 3 = 10 years
        family 4 = 12 years
        family 5 = 6 years

        Next, print this data to the screen by accessing the elements and using
        System.out.println();
	 */

	public static void main(String[] args) {

		int yearsMarried[] = {4, 3, 10, 12, 6};
		
//		int yearsMarried[] = new int[5];

//		yearsMarried[0] = 4;
//		yearsMarried[1] = 3;
//		yearsMarried[2] = 10;
//		yearsMarried[3] = 12;
//		yearsMarried[4] = 6;
		
		System.out.println("Family 1 has been married " + yearsMarried[0] + " years");
		System.out.println("Family 2 has been married " + yearsMarried[1] + " years");
		System.out.println("Family 3 has been married " + yearsMarried[2] + " years");
		System.out.println("Family 4 has been married " + yearsMarried[3] + " years");
		System.out.println("Family 5 has been married " + yearsMarried[4] + " years");

	}

}

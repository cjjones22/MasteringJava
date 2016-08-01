
public class Lesson_61_Ex1 {
	/*
	 * Exercise 1

        Create a two dimensional array with 12 "rows" and 2 "columns".  The first column will
        correspond to a month of the year such as January = 1 and December = 12.
        The second column will be the revenue that a lemonade stand makes in that month.
        Load the array with the following information.

        Jan = $34
        Feb = $44
        Mar = $23
        Apr = $76
        May = $65
        June = $98
        July = $123
        Aug = $102
        Sept = $87
        Oct = $43
        Nov = $34
        Dec = $12

        Use a loop to access the array and print out the revenue for each month of the year.
	 */

	public static void main(String[] args) {
		String month[][] = new String[12][2];
		
		month[0][0] = "Jan";
		month[1][0] = "Feb";
		month[2][0] = "Mar";
		month[3][0] = "Apr";
		month[4][0] = "May";
		month[5][0] = "June";
		month[6][0] = "July";
		month[7][0] = "Aug";
		month[8][0] = "Sept";
		month[9][0] = "Oct";
		month[10][0] = "Nov";
		month[11][0] = "Dec";

		month[0][1] = "$34";
		month[1][1] = "$44";
		month[2][1] = "$23";
		month[3][1] = "$76";
		month[4][1] = "$65";
		month[5][1] = "$98";
		month[6][1] = "$123";
		month[7][1] = "$102";
		month[8][1] = "$87";
		month[9][1] = "$43";
		month[10][1] = "$34";
		month[11][1] = "$12";
		
		for(int i = 0; i < 12; i++) {
			System.out.println(month[i][0] + " = " + month[i][1]);
		}
	}

}

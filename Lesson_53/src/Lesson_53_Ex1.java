
public class Lesson_53_Ex1 {
	/*
	 * Exercise 1

        We will continue working with the groceryStore class that we created in
        a previous exercise.

        Modify the code from the previous exercise so that the grossRevenue method
        in the groceryStore class calculates the gross revenue and returns the answer to
        the caller.  In other words, don't have the method print out the answer.  It should
        calculate the answer and return it to the calling place in the main method.

        Using this arrangement, calculate the gross revenue of the Houston, Seattle, and
        Orlando Stores and print the results to the screen using print statements in the 
        main method.
	 */

	public static void main(String[] args) {
		groceryStore houstonStore = new groceryStore();
		groceryStore seattleStore = new groceryStore();
		groceryStore orlandoStore = new groceryStore();
		
		
		houstonStore.applesSoldPerYr = 534;
		houstonStore.appleRetailPrice = 0.99;
		houstonStore.orangesSoldPerYr = 429;
		houstonStore.orangeRetailPrice = 0.87;
		
		
		seattleStore.applesSoldPerYr = 765;
		seattleStore.appleRetailPrice = 0.86;
		seattleStore.orangesSoldPerYr = 842;
		seattleStore.orangeRetailPrice = 0.91;
		

		orlandoStore.applesSoldPerYr = 402;
		orlandoStore.appleRetailPrice = 0.77;
		orlandoStore.orangesSoldPerYr = 398;
		orlandoStore.orangeRetailPrice = 0.79;
		
		
		System.out.println("Houston Gross Revenue: $" + houstonStore.grossRevenue());

		System.out.println("\nSeattle Gross Revenue: $" + seattleStore.grossRevenue());

		System.out.println("\nOrlando Gross Revenue: $" + orlandoStore.grossRevenue());
	}

}

class groceryStore {
	int applesSoldPerYr;
	double appleRetailPrice;

	int orangesSoldPerYr;
	double orangeRetailPrice;
	
	double grossRevenue() {
		double revenue;
		revenue = ((applesSoldPerYr * appleRetailPrice) + (orangesSoldPerYr * orangeRetailPrice));
		return revenue;
	}

}

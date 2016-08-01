
public class Lesson_52_Ex1 {
	/*
	 * Exercise 1

        We will continue working with the groceryStore class that we created in
        a previous exercise.

        Copy/paste the code from the previous example to define the class, create
        the objects for the grocery store, and store values into each object variable.

        Create a method named grossRevenue and add it to the groceryStore class that calculates 
        the gross revenue of the store, then print the results to the screen.

        Back in the main method, call the grossRevenue method for each of the three stores,
        (Houston, Seattle, Orlando).

        In the end, we'd like to see the gross revenue of each store printed on the screen.
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
		
		
		System.out.println("Houston Gross Revenue: ");
		houstonStore.grossRevenue();
		System.out.println("\nSeattle Gross Revenue: ");
		seattleStore.grossRevenue();
		System.out.println("\nOrlando Gross Revenue: ");
		orlandoStore.grossRevenue();
	}

}

class groceryStore {
	int applesSoldPerYr;
	double appleRetailPrice;

	int orangesSoldPerYr;
	double orangeRetailPrice;
	
	void grossRevenue() {
		double revenue;
		revenue = ((applesSoldPerYr * appleRetailPrice) + (orangesSoldPerYr * orangeRetailPrice));
		System.out.println("The revenue is: $" + revenue);
	}
}
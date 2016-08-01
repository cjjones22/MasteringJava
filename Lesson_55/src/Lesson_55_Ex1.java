
public class Lesson_55_Ex1 {
	/*
	 * Exercise 1

        We will continue working with the groceryStore class that we created in
        a previous exercise.

        Copy past the code from the previous exercise to define the groceryStore Class.
        Alter the groceryStore Class to add a constructor that will take information
        on apples and oranges and assign these numbers to the instance variables.

        Then, call the method grossRevenue and use it to print out the revenue for each store.

        Next, call the method appleRevenueTarget with a value of $1000 for each of the three stores.

        Finally, call the method orangeRevenueTarget with a value of $800 for each of the three stores.
	 */

	public static void main(String[] args) {
		groceryStore houstonStore = new groceryStore(534, 0.99, 429, 0.87);
		groceryStore seattleStore = new groceryStore(765, 0.86, 842, 0.91);
		groceryStore orlandoStore = new groceryStore(402, 0.77, 398, 0.79);
		
		
		
		System.out.println("Gross Revenue:");
		System.out.println("Houston Store - " + houstonStore.grossRevenue());
		System.out.println("Seattle Store - " + seattleStore.grossRevenue());
		System.out.println("Orlando Store - " + orlandoStore.grossRevenue());
		
		
		System.out.println("\nApple Revenue Targets ($1000)");
		System.out.println("Houston Store must sell - " + houstonStore.appleRevenueTarget(1000.00));
		System.out.println("Seattle Store must sell - " + seattleStore.appleRevenueTarget(1000.00));
		System.out.println("Orlando Store must sell - " + orlandoStore.appleRevenueTarget(1000.00));

		System.out.println("\nOrange Revenue Targets ($800)");
		System.out.println("Houston Store must sell - " + houstonStore.orangeRevenueTarget(800.00));
		System.out.println("Seattle Store must sell - " + seattleStore.orangeRevenueTarget(800.00));
		System.out.println("Orlando Store must sell - " + orlandoStore.orangeRevenueTarget(800.00));
	}

}

class groceryStore {
	int applesSoldPerYr;
	double appleRetailPrice;
	int orangesSoldPerYr;
	double orangeRetailPrice;
	
	// constructor
	groceryStore(int aspy, double arp, int ospy, double orp) {
		applesSoldPerYr = aspy;
		appleRetailPrice = arp;
		orangesSoldPerYr = ospy;
		orangeRetailPrice = orp;
		
	}
	
	double grossRevenue() {
		double revenue;
		revenue = ((applesSoldPerYr * appleRetailPrice) + (orangesSoldPerYr * orangeRetailPrice));
		return revenue;
	}

	double appleRevenueTarget(double targetRevenue) {
		return targetRevenue / appleRetailPrice;
	}
	
	double orangeRevenueTarget(double targetRevenue) {
		return targetRevenue / orangeRetailPrice;
	}

}
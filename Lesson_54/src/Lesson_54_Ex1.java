
public class Lesson_54_Ex1 {
	/*
	 * Exercise 1

        We will continue working with the groceryStore class that we created in
        a previous exercise.

        Copy past the code from the previous exercise to define the groceryStore Class,
        instantiate the objects for houston, seattle, and orlando stores, and
        assign values to the member variables for these stores.

        Add a two new methods to the groceryStore class as follows:

        appleRevenueTarget
        This method takes as an argument the target revenue we'd like to make just by selling
        apples.  The method calculates how many apples we need to sell to meet our target, and
        returns this answer to the caller.

        orangeRevenueTarget
        This method takes as an argument the target revenue we'd like to make just by selling
        oranges. The method calculates how many oranges we need to sell to meet our target, and
        returns this answer to the caller.

        In the main method, use these methods to print the following info the screen:

        How many apples are needed to earn $1050 for the Houston store.
        How many oranges are needed to earn $620 for the Seattle store.
        How many apples are needed to earn $744 for the Orlando store.
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
			
			
			System.out.println("Apples needed to hit Houston target revenue of $1050.00: " + houstonStore.appleRevenueTarget(1050.00));

			System.out.println("Oranges needed to hit Seattle target revenue of $620.00: " + seattleStore.orangeRevenueTarget(620.00));

			System.out.println("Apples needed to hit Orlando target revenue of $744.00: " + orlandoStore.orangeRevenueTarget(744.00));
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

		double appleRevenueTarget(double targetRevenue) {
			return targetRevenue / appleRetailPrice;
		}
		
		double orangeRevenueTarget(double targetRevenue) {
			return targetRevenue / orangeRetailPrice;
		}

	}
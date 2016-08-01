
public class Lesson_51_Ex1 {
	/*
	 * Exercise 1

        We will continue working with the groceryStore class that we created in
        a previous exercise.

        Copy/paste the code from the previous example to define the class, create
        the objects for the grocery store, and store values into each object variable.

        Calculate the gross revenue of the Houston store, Seattle store, and Orlando Store.

        Print this information on the screen.
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
		
		
		double houstonGrossRev = ((houstonStore.appleRetailPrice * houstonStore.applesSoldPerYr) + (houstonStore.orangeRetailPrice * houstonStore.orangesSoldPerYr));
		double seattleGrossRev = ((seattleStore.appleRetailPrice * seattleStore.applesSoldPerYr) + (seattleStore.orangeRetailPrice * seattleStore.orangesSoldPerYr));
		double orlandoGrossRev = ((orlandoStore.appleRetailPrice * orlandoStore.applesSoldPerYr) + (orlandoStore.orangeRetailPrice * orlandoStore.orangesSoldPerYr));
	

		System.out.println("Houston Gross Revenue: $" + houstonGrossRev);
		System.out.println("Seattle Gross Revenue: $" + seattleGrossRev);
		System.out.println("Orlando Gross Revenue: $" + orlandoGrossRev);
	}

}

class groceryStore {
	int applesSoldPerYr;
	double appleRetailPrice;

	int orangesSoldPerYr;
	double orangeRetailPrice;
}

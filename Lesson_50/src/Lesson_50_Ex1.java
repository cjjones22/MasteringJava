
public class Lesson_50_Ex1 {
	/*
	 * Exercise 1

        Add additional code to the last exercise dealing with the groceryStore class.
        Store values into the instance variables as follows:

        For the Houston Store: 

        number of apples sold per year = 534
        retail price of each apple = 0.99
        number of oranges sold per year = 429
        retail price of each orange = 0.87


        For the Seattle Store: 

        number of apples sold per year = 765
        retail price of each apple = 0.86
        number of oranges sold per year = 842
        retail price of each orange = 0.91

        For the Orlando Store:

        number of apples sold per year = 402
        retail price of each apple = 0.77
        number of oranges sold per year = 398
        retail price of each orange = 0.79

        Output all of this info for the HOUSTON 
        store to the screen in an organized way, for example:

        Houston Store 
        Apples sold - 534
        Apple retail cost - $0.99

        Oranges sold - 429
        Orange retail cost - $0.87
	 */

	public static void main(String[] args) {
		groceryStore houstonStore = new groceryStore();
		groceryStore seattleStore = new groceryStore();
		groceryStore orlandoStore = new groceryStore();

		houstonStore.applesSoldPerYr = 534;
		houstonStore.appleRetailPrice = 0.99;
		houstonStore.orangesSoldPerYr = 429;
		houstonStore.orangeRetailPrice = 0.87;
		System.out.println("Houston Store\nApplessold - " + houstonStore.applesSoldPerYr);
		System.out.println("Apple retail cost - $" + houstonStore.appleRetailPrice);
		System.out.println("\nOranges sold - " + houstonStore.orangesSoldPerYr);
		System.out.println("Orange retail cost - $" + houstonStore.orangeRetailPrice);
		
		seattleStore.applesSoldPerYr = 765;
		seattleStore.appleRetailPrice = 0.86;
		seattleStore.orangesSoldPerYr = 842;
		seattleStore.orangeRetailPrice = 0.91;
		
		orlandoStore.applesSoldPerYr = 402;
		orlandoStore.appleRetailPrice = 0.77;
		orlandoStore.orangesSoldPerYr = 398;
		orlandoStore.orangeRetailPrice = 0.79;
	}

}

class groceryStore {
	int applesSoldPerYr;
	double appleRetailPrice;

	int orangesSoldPerYr;
	double orangeRetailPrice;
}


public class Lesson_52 {

	public static void main(String[] args) {
		aircraft cessna172 = new aircraft();	// creates object of class aircraft
		aircraft piperSaratoga = new aircraft();
		

		cessna172.passengers = 4;
		cessna172.cruiseSpeed = 140;
		cessna172.fuelCapacity = 56.5;
		cessna172.fuelBurnRate = 9.5;
		
		
		piperSaratoga.passengers = 6;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;
		
		
		System.out.println("Cessna 172: ");
		cessna172.calculateEndurance();
		System.out.println("\nPiper Saratoga: ");
		piperSaratoga.calculateEndurance();
	}

}


class aircraft {
	int passengers;				// number of people
	int cruiseSpeed;			// miles per hour
	double fuelCapacity;		// gallons
	double fuelBurnRate;		// gallons per hour
	
	// method to calculate endurance
	void calculateEndurance() {
		double endurance;
		endurance = fuelCapacity / fuelBurnRate;
		System.out.println("The endurance is: " + endurance);
	}
}
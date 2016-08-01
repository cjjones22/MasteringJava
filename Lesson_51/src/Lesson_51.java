
public class Lesson_51 {

	public static void main(String[] args) {
		aircraft cessna172 = new aircraft();	// creates object of class aircraft
		aircraft piperSaratoga = new aircraft();
		
		double cessna172Endurance, piperEndurance;
		

		cessna172.passengers = 4;
		cessna172.cruiseSpeed = 140;
		cessna172.fuelCapacity = 56.5;
		cessna172.fuelBurnRate = 9.5;
		
		
		piperSaratoga.passengers = 6;
		piperSaratoga.cruiseSpeed = 201;
		piperSaratoga.fuelCapacity = 102.5;
		piperSaratoga.fuelBurnRate = 20.5;
		
		
		cessna172Endurance = cessna172.fuelCapacity / cessna172.fuelBurnRate;
		System.out.println("A Cessna 172 can stay aloft for " + cessna172Endurance + " hrs.");
		
		piperEndurance = piperSaratoga.fuelCapacity / piperSaratoga.fuelBurnRate;
		System.out.println("A Piper Saratoga can stay aloft for " + piperEndurance + " hrs.");
	}

}


class aircraft {
	int passengers;				// number of people
	int cruiseSpeed;			// miles per hour
	double fuelCapacity;		// gallons
	double fuelBurnRate;		// gallons per hour
}
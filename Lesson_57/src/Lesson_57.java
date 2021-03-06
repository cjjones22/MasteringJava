
public class Lesson_57 {

	public static void main(String[] args) {
		aircraft cessna172 = new aircraft(4, 140, 56.5, 9.5);	// creates object of class aircraft
		aircraft piperSaratoga = new aircraft(6, 201, 102.5, 20.5);
		

		System.out.println("For Cessna 172 to fly 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + " gallons of fuel.");

		System.out.println("For the Piper to fly 4.2 hours, it takes " + piperSaratoga.fuelNeeded(4.2) + " gallons of fuel.");
		
		
		
		cessna172.setPassengers(5);
		
		aircraft.wings = 2;
		System.out.println("All my aircraft have " + aircraft.wings + " wings.");
		
		System.out.println(cessna172.wings);
		System.out.println(piperSaratoga.wings);
	}

}
class aircraft {
	private int passengers;				// number of people
	int cruiseSpeed;			// miles per hour
	double fuelCapacity;		// gallons
	double fuelBurnRate;		// gallons per hour
	static int wings;
	
	// constructor
	aircraft(int p, int c, double fc, double fbr) {
		passengers = p;
		cruiseSpeed = c;
		fuelCapacity = fc;
		fuelBurnRate = fbr;
	}
	
	// method to calculate endurance
	double calculateEndurance() {
		double endurance;
		endurance = this.fuelCapacity / fuelBurnRate;
		return endurance;
	}
	
	double fuelNeeded(double time) {
		return this.fuelBurnRate * time;
	}
	
	void setPassengers(int p) {
		if ((p >= 0) && (p <= 10)) {
			passengers = p;
			System.out.println("Revised passenger count: " + passengers);
		}
		System.out.println("Error setting passengers.");
	}
}
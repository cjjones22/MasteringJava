
public class Lesson_55 {

	public static void main(String[] args) {
		Aircraft cessna172 = new Aircraft(4, 140, 56.5, 9.5);	// creates object of class aircraft
		Aircraft piperSaratoga = new Aircraft(6, 201, 102.5, 20.5);
		

		System.out.println("For Cessna 172 to fly 4.2 hours, it takes " + cessna172.fuelNeeded(4.2) + " gallons of fuel.");

		System.out.println("For the Piper to fly 4.2 hours, it takes " + piperSaratoga.fuelNeeded(4.2) + " gallons of fuel.");
	}

}
class Aircraft {
	int passengers;				// number of people
	int cruiseSpeed;			// miles per hour
	double fuelCapacity;		// gallons
	double fuelBurnRate;		// gallons per hour
	
	// constructor
	Aircraft(int p, int c, double fc, double fbr) {
		passengers = p;
		cruiseSpeed = c;
		fuelCapacity = fc;
		fuelBurnRate = fbr;
	}
	
	// method to calculate endurance
	double calculateEndurance() {
		double endurance;
		endurance = fuelCapacity / fuelBurnRate;
		return endurance;
	}
	
	double fuelNeeded(double time) {
		return fuelBurnRate * time;
	}
}
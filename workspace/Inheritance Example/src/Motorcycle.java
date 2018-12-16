public class Motorcycle extends Bike 
{
	String hasSideCar;
	
	//Constructor
	Motorcycle(	String name,
			 	String sideCar, 
				int numWheels, 
				int tireSize, 
				int numPassengers, 
				int maxSpeed)
	{
		//Call parent constructor
		super(name, numWheels, tireSize, numPassengers, maxSpeed);
		this.hasSideCar = sideCar;
	}
	
	void displayInfo()
	{
		System.out.println("Here is the information about the motorcycle:");
		System.out.println("Name is " + this.getName());
		System.out.println("Side car? " + this.hasSideCar);
		System.out.println("Number of wheels is " + this.getNumOfWheels());
		System.out.println("Tire size is " + this.getTireSize());
		System.out.println("Number of passengers is " + this.getNumPassengers());
		System.out.println("Max speed is " + this.getMaxSpeed());
	}
}

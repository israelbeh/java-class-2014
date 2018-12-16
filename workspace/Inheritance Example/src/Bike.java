public class Bike extends Vehicle
{
	int numOfWheels;
	int tireSize;
	
	//getters and setters
	public int getNumOfWheels() {
		return numOfWheels;
	}
	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	public int getTireSize() {
		return tireSize;
	}
	public void setTireSize(int tireSize) {
		this.tireSize = tireSize;
	}
	
	//Empty constructor
	Bike()
	{
		
	}
	
	//Constructor
	public Bike(String name, int numWheels, int tireSize, int numPassengers, int maxSpeed) 
	{
		//Call parent constructor
		super(name, numPassengers, maxSpeed);
		this.numOfWheels = numWheels;
		this.tireSize = tireSize;
	}
	
	
}

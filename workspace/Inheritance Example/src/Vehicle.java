
//This is the base class
//IOW, this is a very generic class

public class Vehicle 
{
	String name;
	int numPassengers;
	int maxSpeed;
	
	//Empty Constructor
	Vehicle()
	{
		
	}

	//getters and setters
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	//Constructor receiving both parameters
	public Vehicle(String name, int numPassengers, int maxSpeed) {
		super();
		this.name = name;
		this.numPassengers = numPassengers;
		this.maxSpeed = maxSpeed;
	}
	
}

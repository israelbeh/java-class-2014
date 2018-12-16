
class Auto {
	String Model;
	String Type;
	int Passengers;
	int MPG;
	double Price;
	int FuelCap;
	int TotalMiles;
	
	Auto(String sModel, String sType)//this is a constructor method because it has the same name. Two Parameters. you assign to the attribute
	{
		this.Model =sModel;
		this.Type = sType;
	}
	
	Auto()
	{
		
	}
	
	void range ()
	{
		System.out.println("This car gets " + this.MPG + " MPG");
		System.out.println("You can drive " + (this.FuelCap * this.MPG) + " miles"); 
	}
	int CalcMiles()
	{
		return (this.FuelCap * this.MPG);
	}
	void CalcTotalMiles(int iFuelCap, int iMPG)//you declare the variables in the parameter
	{
		this.FuelCap = iFuelCap;//We use this. when you have a parameter with the same name
		this.MPG = iMPG;
		
		this.TotalMiles = this.FuelCap * this.MPG; 
	}
}
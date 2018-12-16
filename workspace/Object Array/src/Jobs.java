import java.text.DecimalFormat;


public class Jobs 
{
	//Instance Variables
	String JobDesc;
	double HourlyWage;
	double WeeklyPay;
	
	//Constructor that receives 1 parameter
	Jobs(String sDesc)
	{
		this.JobDesc = sDesc;
	}
	
	//Empty constructor
	Jobs()
	{
		
	}
	
	//This method will calculate the weekly wage and assign it to the instance variable
	void CalcWeeklyWage(int iHours)
	{
		this.WeeklyPay = this.HourlyWage * iHours;
	}
	
	//This method will set the hourly wage instance variable and then call the CalcWeeklyWage method in the class
	void setHourlyWage(double dWage, int iHours)
	{
		this.HourlyWage = dWage;
		this.CalcWeeklyWage(iHours);
	}
	
	String displayInfo()
	{		
		//Use this DecimalFormat object when you display the double values
		//This tells the system to take the data and use the format $#,###,###.00
		//The # means that if there is a number then display it, otherwise don't display a number
		//The 0 means that if there is a number then display it, otherwise display a 0
		//The commas will not be displayed unless the number is big enough to require it
		//The $ will be added to the value for display purposes
		DecimalFormat oDF = new DecimalFormat("$#,###,###.00");
		
		//The oDF.format will take the parameter and put the value in the #,###,###.00 format
		return ("The job " + this.JobDesc + " has an hourly wage of " + oDF.format(this.HourlyWage) + " and a weekly pay of " + oDF.format(this.WeeklyPay));
	}
}

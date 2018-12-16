/*
 Author: Israel Beh
 Description: The Person class is the base or parent class. it contains the instance variables FirstName 
 and LastName, along with a Person constructor, and getters and setters.
 */
public class Person {
	//All Person attributes have a protected scope
	protected String FirstName;
	protected String LastName;
	
	//constructor for parent class
	Person (String sFName, String sLName)
	{
		this.FirstName = sFName;
		this.LastName = sLName;
	}
	//setters for names
	void setFName (String sFName)
	{
		this.FirstName = sFName;
	}
	void setLName (String sLName)
	{
		this.LastName = sLName;
	}
	//getters for names
	String getFName()
	{
		return this.FirstName;
	}
	String getLName()
	{
		return this.LastName;
	}
	//return the full name in the format of LastName, Firstname
	void getStudentName()
	{
		System.out.println(getLName() + ", " + getFName());
	}
}

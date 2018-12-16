
public class Student 
{
	String FirstName;
	String LastName;
	int Age;
	Double GPA;
	
	Student ()// this is the constructor which is the method. same name as the class. It creates an object
	{
		
	}
	Student(String sFirst, String sLast, int iAge, double dGPA)//this assigns parameters to attributes
	{
		this.FirstName = sFirst;// "this" refers to the attribute
		this.LastName = sLast;
		this.Age = iAge;
		this.GPA = dGPA;
	}
	
	void setFirstName(String sFirstName)// this allows you to set a value and to assign value
	{
		this.FirstName = sFirstName;
	}
	
	String getFirstName()// you have to declare the data type you are returning.
	{
		return this.FirstName;
	}

}

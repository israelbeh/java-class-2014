
public class Person {
	protected String FirstName;
	protected String LastName;
	
	Person (String sFName, String sLName)
	{
		this.FirstName = sFName;
		this.LastName = sLName;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getName() {
		return this.LastName + ", " + this.FirstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
}

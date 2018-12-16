//Author: Israel Beh
/*
 Description: The Team class is the parent class that has the attributes TeamName and NumOfMembers
 */
public class Team {

	protected String TeamName;
	protected int NumOfMembers;
	
	//getters and setters for TeamName	
	public String getTeamName() {
		return this.TeamName;
	}


	public void setTeamName(String teamName) {
		this.TeamName = teamName;
	}

//getters and setters for number of members
	public int getNumOfMembers() {
		return this.NumOfMembers;
	}


	public void setNumOfMembers(int numOfMembers) {
		this.NumOfMembers = numOfMembers;
	}

// the constructor that receives two parameters from the main program
	Team (String sTeamName, int iNumOfMembers)
	{
	this.TeamName = sTeamName;
	this.NumOfMembers = iNumOfMembers;
	}
}

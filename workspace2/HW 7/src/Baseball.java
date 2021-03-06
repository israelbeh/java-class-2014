//Author: Israel Beh
/*
 Description:the baseball class inherits the sports class. 
 */
public class Baseball extends Sports {

	private String League;
	
	//Getters and setters for League
	public String getLeague() {
		return this.League;
	}


	public void setLeague(String league) {
		this.League = league;
	}
/*baseball constructor which calls the parent classes and receives parameters in order to set all the 
attributes values. super is called to call the parent class
	*/
	Baseball(String sTeamName, int iNumOfMembers, int iWins, int iLosses, String sLeague) {
		super(sTeamName, iNumOfMembers, iWins, iLosses);
		/*if (sLeague.equalsIgnoreCase("A"))
			sLeague = "American";
		else if (sLeague.equalsIgnoreCase("N"))
			sLeague = "National";*/
		this.League = sLeague;
	}
	
	void displayInfo()//Prints out the information
	{
		System.out.println("Here is what you need to know about the baseball team:");
		System.out.println("Name: " + this.TeamName);
		System.out.println("Number of players:  " + this.NumOfMembers);
		System.out.println("Number of wins: " + this.getWins());
		System.out.println("Number of losses: " + this.getLosses());
		System.out.println("League: " + this.getLeague());
		System.out.println("Win/Loss Percentage: " + this.getWinsLossPct());
	}


}

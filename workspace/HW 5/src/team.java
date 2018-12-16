/*
 * Author: Israel Beh
 * Description: this contains the attributes of the team. A variety of methods are defined here also.
 */
public class team {
		
	String teamName;
	int	wins;
	int losses;
	int totalRunsFor;
	int	totalRunsAgainst;
	double winLossPct;
	
	//Constructors
	team (String sTeamName)
	{
		getTeam();
	}
	
	public team() {
		// TODO Auto-generated constructor stub
	}

	//This section sets the values for all instances
	void setTeam(String sTeamName)
	{
		this.teamName = sTeamName;	
	}
	
	void setWinsLosses(int iLosses, int iWins)
	{
		this.wins = iWins;
		this.losses = iLosses;
		calcWinLossPct ();
	}
	
	private void calcWinLossPct()// calculates the win/loss percentage
	{
		this.winLossPct = (double) getWins() / ((double) getLosses() + (double) getWins());
	}
	//This section returns the values
	String getTeam ()
	{
		return this.teamName;
	}
	int getWins()
	{
		return this.wins;
	}
	
	int getLosses()
	{
		return this.losses;
	}
	void addRuns (int runsFor, int runsAgainst)
	{
		this.totalRunsFor = this.totalRunsFor + runsFor;
		this.totalRunsAgainst = this.totalRunsAgainst + runsAgainst;
	}
	void addRuns (int iRuns, String sApples)
	{
		if (sApples.charAt (0) == 'H' || (sApples.charAt(0) == 'h'))
		{
			this.totalRunsFor = this.totalRunsFor + iRuns;
		}
		else if (sApples.charAt (0) == 'O' || (sApples.charAt(0) == 'o'))
		{
			this.totalRunsAgainst = this.totalRunsAgainst + iRuns;
		}
	}
	
	void getAllRuns ()
	{
		System.out.println("Runs for " + this.totalRunsFor + " and Runs Against " + 
							this.totalRunsAgainst);
	}
}

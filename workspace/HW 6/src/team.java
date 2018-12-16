	/*
	 * Author: Israel Beh
	 * Description: this contains the attributes of the team. A variety of methods are defined here also.
	 * Questions:The second team object is supposed to receive the parameters, runs for and runs against
	 * 
	 */
public class team {
		//I made all the instance variables private	
		private String teamName;
		private int	wins;
		private int losses;
		private int totalRunsFor;
		private int	totalRunsAgainst;
		private double winLossPct;
		
		//Constructors
		team (String sTeamName)
		{
			this.teamName = sTeamName;
		}
		
		team (String sTeamName, int iWins, int iLosses, int iRunsFor, int iRunsAgainst)//constructor for team 2
		{
			setTeam(sTeamName);
			setWinsLosses(iWins ,iLosses);
			addRuns(iRunsFor, "H");
			addRuns(iRunsAgainst, "O");
		}
		
		//This section sets the values for all instance variables
		void setTeam(String sTeamName)
		{
			this.teamName = sTeamName;	
		}
		
		void setWinsLosses(int iWins, int iLosses)//receives two parameters
		{
			this.wins = iWins;
			this.losses = iLosses;
			calcWinLossPct ();
		}
		
		private void calcWinLossPct()// Method is private. calculates the win/loss percentage
		{
			this.winLossPct = (double) getWins() / ((double) getLosses() + (double) getWins());
		}
		void addRuns (int runsFor, int runsAgainst)// receives two integers to calculate to total runs
		{
			this.totalRunsFor = this.totalRunsFor + runsFor;
			this.totalRunsAgainst = this.totalRunsAgainst + runsAgainst;
		}
		void addRuns (int iRuns, String sScorer)
		{
		//the if statement asks which team is assigned the runs
			if (sScorer.equalsIgnoreCase("H"))
			{
				this.totalRunsFor = this.totalRunsFor + iRuns;
			}

			else if (sScorer.equalsIgnoreCase("O"))
			{
				this.totalRunsAgainst = this.totalRunsAgainst + iRuns;
			}	
			
		}
		
		
		//This section returns the values of the instance variables
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
		void getAllRuns ()
		{
			System.out.println("Runs for " + this.totalRunsFor + " and Runs Against " + 
								this.totalRunsAgainst);
		}
}




public class Classy {

	public static
	String teamName;
	int wins;
	int losses;
	int totalRunsFor;
	int totalRunsAgainst;
	double winLossPct;

String getTeam () 
{
	return this.teamName;
}
	
	
void setTeam(String sTeamName)
{
	this.teamName = sTeamName;
}

void setWinsLoss(int iWins, int iLosses)
{
	this.wins = iWins;
	this.losses = iLosses;
	this.winLossPct = iWins / (iWins + iLosses);
}

int getWins()
{
	return this.wins;
}

int getLosses()
{
	return this.losses;
}

void addRunsFor (int RunsFor)
{
	this.totalRunsFor = this.totalRunsFor + RunsFor;
}

void addRunsAgainst(int RunsAgainst)
{
	this.totalRunsAgainst = this.totalRunsAgainst + RunsAgainst;
}

void getAllRuns()
{
	System.out.println("Runs For " + this.totalRunsFor + " and Runs Against " + this.totalRunsAgainst);
}


}



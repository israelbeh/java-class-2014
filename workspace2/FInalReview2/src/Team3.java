import java.util.Random;


public class Team3 {
	String TeamName;
	int Wins;
	int Losses;
	double WinLossPct;
	
	Team3 ()
	{
		
	}
	
	Team3 (String sTeamName, int iWins, int iLosses)
	{
		this.TeamName = sTeamName;
		this.Wins = iWins;
		this.Losses = iLosses;
		CalcWinLoss();
	}
	
	void CalcWinLoss()
	{
		this.WinLossPct = (double) this.Wins/ ((double) this.Wins + (double) this.Losses);
	}
	
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public int getWins() {
		return Wins;
	}
	public void setWins(int wins) {
		Wins = wins;
	}
	public int getLosses() {
		return Losses;
	}
	public void setLosses(int losses) {
		Losses = losses;
	}
	public double getWinLossPct() {
		return WinLossPct;
	}
	public void setWinLossPct(double winLossPct) {
		WinLossPct = winLossPct;
	}
	
 static void  ConferenceGames(Team3 Conf[])
	{ int iCount;
		int iHome;
		int iAway;
		
		Random RndGen = new Random();
		for(iCount = 0; iCount < 2; iCount++)
		{
			int iHomeScore;
			int iAwayScore;
			for(iHome = 0; iHome < 5; iHome++)
			{
				for(iAway = 0; iAway < 5; iAway++)
				{
					if(iHome != iAway)
					{
						iHomeScore = RndGen.nextInt(5);
						iAwayScore = RndGen.nextInt(5);
						while(iHomeScore == iAwayScore)
						{
							iHomeScore = RndGen.nextInt(5);
							iAwayScore = RndGen.nextInt(5);
						}
						if (iHomeScore > iAwayScore)
						{
							Conf[iCount].Wins++;
							Conf[iCount].Losses++;
						}
						else
						{
							Conf[iCount].Losses++;
							Conf[iCount].Wins++;
						}
					}
				}
			}	
		}
	}
	
	
}

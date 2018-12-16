
public class Sports extends Team {
	
	private int Wins;
	private int Losses;
	private double WinLossPct;
	
	Sports (String sTeamName, int NoM, int iWins, int iLosses)
	{
		super (sTeamName, NoM);
		this.Wins = iWins;
		this.Losses = iLosses;
		setWinLossPct();
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

	public void setWinLossPct() {
		WinLossPct = (double) this.Wins/ ((double) this.Wins +(double) this.Losses);
	}

}

//Author: Israel Beh
//Description:The Sports Class inherits the Team class and all of its attributes


public class Sports extends Team {
	
	private int Wins;
	private int Losses;
	private double WinsLossPct;

	//getters and setters for Wins
	public int getWins() {
		return this.Wins;
	}

	public void setWins(int iWins) {
		this.Wins = iWins;
	}

	//getters and setters for Losses
	public int getLosses() {
		return this.Losses;
	}

	public void setLosses(int iLosses) {
		this.Losses = iLosses;
	}
//Returns the value of Win loss percentage
	public double getWinsLossPct() {
		return this.WinsLossPct;
	}
//sets the win and loss values in order to calculate the win loss percentage
	public void setWinsLossPct(int iWins, int iLosses) {
		this.Wins = iWins;
		this.Losses = iLosses;
		this.WinsLossPct = (double) this.Wins/ ((double) this.Wins + (double) this.Losses);
	}
// the constructor inherits the Team class by using the key word super and calls the setWinsLossPct Method 
	Sports(String sTeamName, int iNumOfMembers, int iWins, int iLosses) {
		super(sTeamName, iNumOfMembers);
		setWinsLossPct(iWins, iLosses);
		
		
	}

}

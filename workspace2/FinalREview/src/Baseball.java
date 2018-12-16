
public class Baseball extends Sports {
	
	private String League;
	
	Baseball (String sTeamName, String sLeague, int iNoM, int iWins, int iLosses)
	{
		super (sTeamName, iNoM, iWins, iLosses);
		this.League = sLeague;
	}

	public String getLeague() {
		return League;
	}

	public void setLeague(String sleague) {
		League = sleague;
	}

}

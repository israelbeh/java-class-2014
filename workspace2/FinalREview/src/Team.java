
public class Team {

	protected String TeamName;
	protected int NumOfMembers;
	
	Team (String sTeamName, int iNoM)
	{
		this.TeamName = sTeamName;
		this.NumOfMembers = iNoM;
	}

	public String getTeamName() {
		return TeamName;
	}

	public void setTeamName(String teamName) {
		TeamName = teamName;
	}

	public int getNumOfMembers() {
		return NumOfMembers;
	}

	public void setNumOfMembers(int numOfMembers) {
		NumOfMembers = numOfMembers;
	}

	
}

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);
		Random NumGen = new Random();
		TeamPractice aoTeam = new TeamPractice();
		String sOpponent;
		String sResponse;
		int iNumGames;
		double iTotalGames = 0;
		int iInnings;
		int myTeam;
		int OpTeam;
		boolean HomeTeam = true;

		System.out.println("Do you want to play? Y/N");
		sResponse = oScan.nextLine();

		if (sResponse.equalsIgnoreCase("Y")) {

			System.out.println("What is the Team Name? ");
			aoTeam.teamName = oScan.nextLine();
		}
		while (sResponse.equalsIgnoreCase("Y"))
			{
				for (iNumGames = 0; iNumGames < 1; iNumGames++) {
					int iMyScore = 0;
					int iOpScore = 0;
					int iInCount = 0;
	
					System.out.println("Who is the opponent?");
					sOpponent = oScan.nextLine();
					
	
					if (iNumGames % 2 == 1) {
						HomeTeam = true;
					} else {
						HomeTeam = false;
					}
	
					for (iInnings = 1; iInnings < 10; iInnings++) {
						myTeam = NumGen.nextInt(3);
						OpTeam = NumGen.nextInt(3);
	
						if (iInnings == 1 && HomeTeam == true) {
							myTeam = myTeam + 1;
	
						} else if (iInnings == 1 && HomeTeam == false) {
							OpTeam = OpTeam + 1;
	
						}
	
						iMyScore = iMyScore + myTeam;
						iOpScore = iOpScore + OpTeam;
						iInCount = iInCount + 1;
					}
						
					while (iMyScore == iOpScore) {
						myTeam = NumGen.nextInt(3);
						OpTeam = NumGen.nextInt(3);
	
						iInCount = iInCount + 1;
						
						if (myTeam > OpTeam) 
						{
							iMyScore = iMyScore + 1;
						} 
						else if (myTeam < OpTeam) 
						{
							iOpScore = iOpScore + 1;
						}
	
					}
					
					if (iMyScore > iOpScore) {
						System.out.println(aoTeam.teamName + " " + iMyScore + " - Win");
						System.out.println(sOpponent + " " + iOpScore);
						aoTeam.wins = aoTeam.wins + 1;
					} else if (iMyScore < iOpScore) {
						System.out.println(aoTeam.teamName + " " + iMyScore + " - Lost");
						System.out.println(sOpponent + " " + iOpScore);
						aoTeam.losses = aoTeam.losses + 1;
					}
	
					if (iInCount > 9)
					{
						System.out.println(iInCount + " Innings");
						System.out.println('\n');
					}
					iTotalGames = iTotalGames + 1;
					aoTeam.totalRunsFor = aoTeam.totalRunsFor + iMyScore;
					aoTeam.totalRunsAgainst = aoTeam.totalRunsAgainst + iOpScore;
					aoTeam.winLossPct = aoTeam.wins / iTotalGames;
					
						
				
				}
				System.out.println("Do you want to play again? Y/N");
				sResponse = oScan.nextLine();
				

		}
			System.out.println("Team Name\t\t W \t L \t Pct \t Runs For \t Runs Against");
			System.out.println(aoTeam.teamName + '\t' + '\t' + '\t' + aoTeam.wins + '\t' + aoTeam.losses + '\t'
					 + aoTeam.winLossPct + '\t' + "  " + aoTeam.totalRunsFor + '\t' + '\t' + aoTeam.totalRunsAgainst);
	
		System.exit(0);
	}

}

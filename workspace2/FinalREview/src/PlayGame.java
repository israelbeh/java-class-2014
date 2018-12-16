import java.util.Scanner;


public class PlayGame {

	public static void main(String[] args) {
		int iWins;
		int iLosses;
		String sTeamName;
		int iNoM;
		String sLeague;
		Scanner oScan = new Scanner(System.in);
		
		System.out.println("What is the team name?");
		sTeamName = oScan.nextLine();
		
		System.out.println("How many players?");
		iNoM = oScan.nextInt();
		
		System.out.println("How many wins?");
		iWins = oScan.nextInt();
		
		System.out.println("How many losses?");
		iLosses = oScan.nextInt();
		
		oScan.nextLine();
		
		System.out.println("What League? A/N");
		sLeague = oScan.nextLine();
		
		Baseball play = new Baseball (sTeamName, sLeague, iNoM, iWins, iLosses);
		
		System.out.println("TEAM NAME \t  Number of Players \t WINS \t  LOSSES \t WLPCT \t LEAGUE");
		System.out.println(play.TeamName + '\t' + play.NumOfMembers + '\t' + play.getWins() + '\t' + play.getLosses() + '\t' +
							play.getWinLossPct() + '\t' + play.getLeague() );
		
		
		
		

	}

}

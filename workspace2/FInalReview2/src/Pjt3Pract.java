import java.util.Scanner;


public class Pjt3Pract {

	public static void main(String[] args) {
		int iWins;
		int iLosses;
		int iCount;
		String sTeamName;
		int iTeamNum;
		Scanner oScan = new Scanner(System.in);
		Team3 aoWest[] = new Team3[5];
		Team3 aoEast[] = new Team3[5];
		Team3 aoCentral[] = new Team3[5];
		
		/*for (iCount = 0; iCount < aoWest.length; iCount++)
		{
			System.out.println("What is the team name?");
			sTeamName = oScan.nextLine();
			
		}*/
		Team3.ConferenceGames(aoWest);
		Team3.ConferenceGames(aoEast);
		Team3.ConferenceGames(aoCentral);
		for(iCount = 0; iCount < aoWest.length; iCount++)
			System.out.println(aoWest[iCount].Wins);

	}

}

import java.util.Scanner;


public class TestPRep {

	public static void main(String[] args) {
		
		Scanner oScan = new Scanner(System.in);
		Classy aiTeam [] = new Classy [3];
		int iCount;
		
		for (iCount=0; iCount < aiTeam.length; iCount++)
		{
			aiTeam[iCount] = new Classy();
			System.out.println("What is the team Name?");
			String sTeamName = oScan.nextLine();
			aiTeam[iCount].setTeam(sTeamName);
			
			System.out.println("How many wins?");
			int iWins = oScan.nextInt();
			
			System.out.println("How many losses?");
			int iLosses = oScan.nextInt();
			aiTeam[iCount].setWinsLoss(iWins, iLosses);
			
			System.out.println("How many runs for?");
			aiTeam[iCount].addRunsFor(oScan.nextInt());
			
			System.out.println("How many runs against?");
			aiTeam[iCount].addRunsAgainst(oScan.nextInt());
			oScan.nextLine();
		}
		
		boolean CorrectTeam = false;
		
		while (CorrectTeam == false)
		{
			System.out.println("Who's stats do you want?");
			String search = oScan.nextLine();
			
			for (iCount = 0; iCount < aiTeam.length; iCount++)
			{
				if (aiTeam[iCount].getTeam().equals(search))
				{
					System.out.println("Team: " + aiTeam[iCount].getTeam());
					System.out.println("Wins: " + aiTeam[iCount].getWins());
					System.out.println("Losses: " + aiTeam[iCount].getLosses());
					aiTeam[iCount].getAllRuns();
					CorrectTeam = true;
				}
			}
			if (CorrectTeam == false)
				System.out.println("No Team Found");
		}
		}
	
	}

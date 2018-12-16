/*
 * Author: Israel Beh
 * Description: The following program uses an array of objects that captures 
 * the statistic for 3 teams. The user is asked to enter in the team name followed
 * by the wins, losses, runs for, and runs against. 
 * The user is then can ask for the stats for a team by typing in the team name. if a correct
 * team is enter, the stats are displayed for the user.
 */
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		int iCount;

		String search;
		Scanner oScan = new Scanner(System.in);

		team aiTeam[] = new team[2];

		for (iCount = 0; iCount < aiTeam.length; iCount++) {
			
			aiTeam[iCount] = new team();//creates the objects for the team with each loop
			System.out.println("What is the team name?");
			String sTeamName = oScan.nextLine();
			aiTeam[iCount].setTeam(sTeamName);//calls the method setTeam to set the value
			System.out.println(aiTeam[iCount].getTeam());
			// How many wins?
			// how many losses?
			System.out.println("How many wins?");
			int iWins = oScan.nextInt();
			System.out.println("How many Losses?");
			int iLosses = oScan.nextInt();
			aiTeam[iCount].setWinLosses(iWins, iLosses);

			System.out.println("How many runs for? ");
			aiTeam[iCount].addRunsFor(oScan.nextInt());

			System.out.println("How many runs Against? ");
			aiTeam[iCount].addRunsAgainst(oScan.nextInt());

			oScan.nextLine();//clears the buffer
		}
		
		boolean correctName  = false;//identifies if a correct name is entered
		
		while (correctName == false)
		{
			System.out.println("Who's stats do you want?");
			search = oScan.nextLine();
	
			for (iCount = 0; iCount < aiTeam.length; iCount++) //runs through the array
			{
				if (aiTeam[iCount].getTeam().equals(search)) //searches for the team name you entered
				{
					System.out.println("Team Name: " + aiTeam[iCount].getTeam());//prints
					System.out.println("Wins: " + aiTeam[iCount].getWins());//prints
					System.out.println("Losses: " + aiTeam[iCount].getLosses());//prints
					aiTeam[iCount].getAllRuns();//prints
					correctName = true;
				}
				
			}
			if (correctName == false)
			{
			System.out.println("Team not found");
			}
		}
	}

}

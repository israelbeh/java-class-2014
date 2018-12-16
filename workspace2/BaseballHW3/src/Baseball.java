/*
 * Author: Israel Beh
 * Description: Homework 4
 */
import java.util.*;

public class Baseball {

	
	public static void main(String[] args) {
		Random rndGenerator = new Random();
		Scanner oScan = new Scanner (System.in);
		

		/*
		 * sOpponent will hold the name of the opposing team
		 * dTotalGames holds the number of total games in a season
		 * iHmTm will hold the random score for each inning for the home team
		 * iOpTm will hold the random score for each inning for the opponents 
		 * iNumGames will hold the value of number of games
		 * iInnings will hold the value of number of innings
		 */
		
		String sOpponent = null;
		team aoTeam = new team();
		int dTotalGames = 50;
		int iHmTm = 0;
		int iOpTm = 0;
		double iNumGames;
		int iInnings;
		
		
		
		System.out.println("Do you want to play? Y/N");
		String sResponse = oScan.nextLine();
		
		
		//the while loop allows user to play again
		while (sResponse.charAt (0) == 'Y' || (sResponse.charAt(0) == 'y'))
				
		{
			System.out.println("Let's play");
		
		
			System.out.println("\nWho is the your team?");
			aoTeam.teamName = oScan.nextLine();
			
			System.out.println("\nWho is the opponent?");
			sOpponent= oScan.nextLine();
	
			for (iNumGames = 1; iNumGames < dTotalGames + 1; iNumGames++) {
				int iRScore = 0;// iRScore keeps a running score for the home team and allows the score to reset for every game				
				int iDScore = 0;// iDScore keeps a running score for the opponent and allows the score to reset for every game
				int iInningsCounter=0;//keeps track of the number of innings
				 
				//System.out.println("\nWho is the opponent?");
				//sOpponent= oScan.nextLine();
				
				if (iNumGames % 2 == 1)//determines who is the home team
				{
					aoTeam.bIsHomeTeam = true;
				}
				else
				{
					aoTeam.bIsHomeTeam = false;
				}
				
				for (iInnings = 1; iInnings < 10; iInnings++) {
					iHmTm = rndGenerator.nextInt(3);
					iOpTm = rndGenerator.nextInt(3);
					
					if (iInnings==1 && aoTeam.bIsHomeTeam == true)
					{
						iRScore = iRScore + 1;//will give the home team a one point bonus in the first inning
					}
					else if (iInnings==1 && aoTeam.bIsHomeTeam == false)
					{
						iDScore = iDScore + 1;//when opponent is home team, they get an one run adv.
					}
					
					iRScore = iHmTm + iRScore;// this keeps a running score for the game from each of the 9 innings for the home team
					iDScore = iOpTm + iDScore;// this keeps a running score for the game from each of the 9innings for the opposing team
					iInningsCounter = iInningsCounter + 1;
				}
				/*
				 * The While loop will determine who wins in the case that there is a tie
				 */
				while (iRScore == iDScore) {
					iHmTm = rndGenerator.nextInt(3);
					iOpTm = rndGenerator.nextInt(3);
					
					iInningsCounter = iInningsCounter + 1;// adds an extra inning for the tie breaker
					
					if (iHmTm > iOpTm) {
						iRScore = iRScore + 1;//the team who wins the tie breaker receives one additional point
						
					} else if (iHmTm < iOpTm) {
						iDScore = iDScore + 1;
						
					}
				}
				
				//prints out the home team and the opposing team's scores
				//System.out.println(aoTeam.teamName + " " + iRScore);
				//System.out.println(sOpponent + " " + iDScore);
				
				if (iInningsCounter > 9)
				{
				System.out.println(iInningsCounter + " innings");
				}
				
				//the if statement is used to determine whether the home team wins or loses
				if (iRScore > iDScore) {
					System.out.println(aoTeam.teamName + " " + iRScore + " - Win");
					System.out.println(sOpponent + " " + iDScore);
					aoTeam.wins = aoTeam.wins + 1;
				}
				else if (iRScore < iDScore) {
					System.out.println(aoTeam.teamName + " " + iRScore + " - Lost");
					System.out.println(sOpponent + " " + iDScore);
					aoTeam.losses = aoTeam.losses + 1;
				}
				
				aoTeam.winLossPct = aoTeam.wins / iNumGames;//Keeps a track of win/loss percentage
				aoTeam.totalRunsFor = iRScore + aoTeam.totalRunsFor;// keeps track of total runs for
				aoTeam.totalRunsAgainst = iRScore + aoTeam.totalRunsAgainst;//keeps track of total runs against
				System.out.println('\n');// this adds a line between games
			
	
			}
			// Prints out the record of the home team
			System.out.println("Team Name      \t\tW \tL \tPct \tRuns For \t Runs Against");
			System.out.println(aoTeam.teamName + '\t' + '\t' + aoTeam.wins + '\t' + aoTeam.losses + '\t' + 
								aoTeam.winLossPct + '\t' + "   " + aoTeam.totalRunsFor + '\t' + '\t' + '\t' + aoTeam.totalRunsAgainst);
	
			
			System.out.println("Would you like to play again? Y/N");
			sResponse = oScan.nextLine();
		}
		
		System.out.println("See you next time"); 
		System.exit(0);
		
		oScan.close();
	}
}

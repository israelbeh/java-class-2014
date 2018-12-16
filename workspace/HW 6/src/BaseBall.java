import java.util.Scanner;

/* Author: Israel Beh
 Description: Homework 6 asks us to use a combination of methods and constructors to gather information from user
 and then print it off.
 */
public class BaseBall {
	/*
	 sTeamName holds the name of the team
	 iWins holds the value for the wins that the user enters
	 iLosses holds the value for the losses that the user enters
	 iPtsFor holds the value for the runs for the home team
	 iPtsAgainst holds the value for the runs for the opponents
	 */

	public static void main(String[] args) {
		team aiTeam[] = new team [2]; //creates an array of two team objects
		Scanner oScan = new Scanner(System.in);
		
		String sTeamName;
		int iWins;
		int iLosses;
		int iPtsFor;
		int iPtsAgainst;
		int iCount;
	
		//the for loop allows each team object to be assigned to an array
		for (iCount = 0; iCount < aiTeam.length; iCount++)
		{
			if (iCount % 2 == 0)//the if statement allows the user to use each object array
			{
				//Team 1
				System.out.println("What is the team name?");
				sTeamName = oScan.nextLine();
				aiTeam[iCount] = new team(sTeamName);//the constructor passes the name of the team to the instance variable
				
				/*loads up the instance variables by asking the user to enter the information and calls 
				 the set methods, assigns values to instance variables, and to a team using an array
				 */
				System.out.println("How many wins?");
				iWins = oScan.nextInt();
				System.out.println("How many losses?");
				iLosses = oScan.nextInt();
				aiTeam[iCount].setWinsLosses(iWins, iLosses);
				
				System.out.println("How many runs for?");
				iPtsFor = oScan.nextInt();
				System.out.println("How many runs Against?");
				iPtsAgainst = oScan.nextInt();
				oScan.nextLine();
				aiTeam[iCount].addRuns(iPtsFor, iPtsAgainst);
				
				System.out.println("Team Name: " + aiTeam[iCount].getTeam());
				System.out.println("Wins: " + aiTeam[iCount].getWins());
				System.out.println("Losses: " + aiTeam[iCount].getLosses());
				aiTeam[iCount].getAllRuns();
				System.out.println('\n');
			}
			else
			{
				//Team 2
				 //this loads up the local variables
				System.out.println("What is the team name?");
				sTeamName = oScan.nextLine();
				System.out.println("How many wins?");
				iWins = oScan.nextInt();
				System.out.println("How many losses?");
				iLosses = oScan.nextInt();
				
				System.out.println("How many runs for?");
				iPtsFor = oScan.nextInt();
				oScan.nextLine();
				
				System.out.println("How many runs against?");
				iPtsAgainst = oScan.nextInt();
				oScan.nextLine();
				System.out.println('\n');
				
				//the constructor passes the values to the instance variables
				aiTeam[iCount] = new team(sTeamName, iWins, iLosses, iPtsFor, iPtsAgainst);
				
				
				//prints out the information by calling the get methods
				System.out.println("Team Name: " + aiTeam[iCount].getTeam());
				System.out.println("Wins: " + aiTeam[iCount].getWins());
				System.out.println("Losses: " + aiTeam[iCount].getLosses());
				aiTeam[iCount].getAllRuns();
			}
		
		}

	}

}

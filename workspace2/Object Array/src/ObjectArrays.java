import java.util.Scanner;

public class ObjectArrays {

	public static void main(String[] args) 
	{
		//Create variable to hold number of objects that need to be created
		int iJobCnt;
		
		//Create variable to hold the hourly wage entered by the end user
		double dWage;
		
		//Create variable to hold the number of hours a week you can work
		int iHours;
		
		//Create variable to hold the job description that will be passed to the constructor
		String sDescription;
		
		//Create Scanner object
		Scanner oScan = new Scanner(System.in);
		
		//Create variable for loop
		int iCount;
		
		System.out.println("How many jobs to you want to enter?");
		iJobCnt = oScan.nextInt();
		
		//Create array to hold the objects;
		Jobs aoJobs[] = new Jobs[iJobCnt];

		
		// the escape sequence below inserts a new line
		System.out.println("\nHow many hours a week could you work?");
		iHours = oScan.nextInt();
				
		for (iCount = 0; iCount < aoJobs.length; iCount++)
		{
			//Clear the buffer
			oScan.nextLine();
			
			System.out.println("\nEnter the description for the job:");
			sDescription = oScan.nextLine();
			
			//Create the object and put it in the array
			aoJobs[iCount] = new Jobs(sDescription);
			
			// the escape sequence below inserts a new line
			System.out.println("\nWhat is the hourly age for the job " + aoJobs[iCount].JobDesc + "?");
			dWage = oScan.nextDouble();
			
			//call the setHourlyWage method and that is associated with the object stored in the array
			aoJobs[iCount].setHourlyWage(dWage, iHours);
			
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		for (iCount = 0; iCount < aoJobs.length; iCount++)
		{
			//call method associated with the object
			System.out.println(aoJobs[iCount].displayInfo());
		}

		oScan.close();
	}

}

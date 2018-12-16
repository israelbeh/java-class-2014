import java.util.Scanner;

public class Inherit 
{
	public static void main(String[] args) 
	{
		String sName;
		String sSideCar;
		int iNumWheels;
		int iTireSize; 
		int iNumPassengers;
		int iMaxSpeed;
		
		Scanner oScan = new Scanner(System.in);
		
		System.out.println("Enter the Motorcycle name:");
		sName = oScan.nextLine();
		
		System.out.println("Does it have a side car? Yes/No");
		sSideCar = oScan.nextLine();
		
		System.out.println("Enter the number of wheels:");
		iNumWheels = oScan.nextInt();

		System.out.println("Enter the tire size:");
		iTireSize = oScan.nextInt();
		
		System.out.println("Enter the number of passengers:");
		iNumPassengers = oScan.nextInt();
		
		System.out.println("Enter the max speed:");
		iMaxSpeed = oScan.nextInt();
		
		Motorcycle oMotor = new Motorcycle(sName, sSideCar, iNumWheels, iTireSize, iNumPassengers, iMaxSpeed);
		
		oMotor.displayInfo();
		
		oScan.close();
	}

}

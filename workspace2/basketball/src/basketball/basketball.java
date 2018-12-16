package basketball;

import java.util.Scanner;

public class basketball {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);
		String Response;
		
		System.out.println("Do you want to play? Y/N");
		String sResponse = oScan.nextLine();
		
		//if (sResponse.equalsIgnoreCase("Y"))
		if (sResponse.charAt (0) == 'Y' || (sResponse.charAt(0) == 'y'))
				
		{
			System.out.println("Let's play");
		}
		else
		{
			System.out.print("See you next time");
		}
		oScan.close();
		

	}

}

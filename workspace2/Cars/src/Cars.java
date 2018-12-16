import java.util.Scanner;



public class Cars {

	public static void main(String[] args) {
		Auto oAuto = new Auto("Camry", "Sedan");
		Auto oAuto2 = new Auto();
		Scanner oInput = new Scanner(System.in);
		oAuto.Model = "Camry";
		oAuto.Type = "Sudan";
	
		int iFuelCap;
		int iMPG;
		
		System.out.println("Enter the Fuel Capacity: ");
		iFuelCap = oInput.nextInt();
		
		
		System.out.println("Enter the MPG: ");
		iMPG = oInput.nextInt();
		
		System.out.println("Enter the Price: ");
		oAuto.Price = oInput.nextDouble();
		
		oInput.nextLine();
		
		System.out.println("Enter the Model: ");
		oAuto.Model = oInput.nextLine();
		
		oAuto.CalcTotalMiles(iFuelCap, iMPG);
		
		oAuto.range();
		
		
		oInput.close();
	}
}

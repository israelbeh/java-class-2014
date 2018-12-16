import java.util.Scanner;


public class Input {

	public static void main(String[] args) {
		//scanner is the data type or object
		// it creates a variable that will hold an object 
		// = new gives birth to an object
		// a constructor "Scanner ()" (): is the parameters
		//System.in: the keyboard
		// we need to call the scanner by import
		Scanner oScan = new Scanner (System.in);
		
		int iNum1;
		int iNum2;
		int iSum;
		String sName;
		
		
		
		System.out.println("\n Enter the first number: ");
		// string: nextLine
		// double: nextdouble
		iNum1= oScan.nextInt();
		
		System.out.println("\n Enter the Second number: ");
		iNum2= oScan.nextInt();
		
		oScan.nextLine();
		// next line flushes the buffer. if its going from int to int you dont need to flush the buffer.
		//you flush between any number and string
		
		System.out.print("\nEnter your name: ");
		sName= oScan.nextLine();
		
		System.out.println("\n Welcome " + sName);
		
		iSum = iNum1 + iNum2;
		
		System.out.println("The sum of " + iNum1 + " and " + iNum2 + " is " + iSum);
	}

}

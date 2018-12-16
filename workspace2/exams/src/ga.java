/*
 * Author: Israel Beh
 * Description: The midterm that ask us enter in student names, average grades and final grades. this also enables us to print it off.
 */
import java.util.Scanner;


public class ga {

	public static void main(String[] args) {
		Student2 aoStud[] = new Student2[3];
		Scanner oScan = new Scanner(System.in);
		String sName;
		int iQuiz;
		int iTest;
		int iHW;
		String sFav;
		int iCount;
		
		for (iCount = 0; iCount < aoStud.length; iCount ++)
		{
			System.out.println("what is the student's name?");
			sName = oScan.nextLine();
			
			System.out.println("what is the student's quiz average?");
			iQuiz = oScan.nextInt();
			
			System.out.println("what is the student's test average?");
			iTest = oScan.nextInt();
			
			System.out.println("what is the student's homework average?");
			iHW = oScan.nextInt();
			
			oScan.nextLine();
			
			System.out.println("what is the favorite subject?");
			sFav = oScan.nextLine();
			
			aoStud[iCount] = new Student2(sName, iQuiz, iTest, iHW, sFav);
		}
		System.out.println("NAME" + "\tSUBJECT" + "\tAVE" + "\tGRADE");
		for (iCount = aoStud.length -1; iCount >= 0; iCount--)
		{
			System.out.println( aoStud[iCount].name + '\t' + aoStud[iCount].favorite_Subject + '\t' +
					aoStud[iCount].final_ave + '\t' + aoStud[iCount].letter_grade);
		}
	}
}
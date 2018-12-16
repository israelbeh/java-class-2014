*
 * Author: Israel Beh
 * Description: The midterm that ask us enter in student names, average grades and final grades. this also enables us to print it off.
 */
import java.util.Scanner;


public class StudentInfo {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);
		Student aiStudent[] = new Student[3];
		int iCount;
		String sName;
		int iquiz;
		int itest;
		int ihomework;
		String sFav;
		
		
		
		// I forgot how to call a constructor
		for (iCount = 0; iCount < aiStudent.length; iCount++)// sets the values for each category
		{
				aiStudent[iCount] = new Student();
				System.out.println("What is the student's name:");
				
				sName = oScan.nextLine();
				
				System.out.println("What is your quiz ave?");
				aiStudent[iCount].quiz_ave = oScan.nextInt();
				
				System.out.println("What is your test ave?");
				aiStudent[iCount].test_ave = oScan.nextInt();
				
				System.out.println("What is your homework ave?");
				aiStudent[iCount].homework_ave = oScan.nextInt();
				
				oScan.nextLine();
				
				System.out.println("What is the favorite subject:");
				aiStudent[iCount].favorite_Subject= oScan.nextLine();
				
				Student obStud = new Student(sName, iquiz, itest, ihomework, sFav);
				
		}
		//aiStudent[iCount] = new Student(sName, iquiz, itest, ihomework, sFav);
		for (iCount = aiStudent.length ; iCount > 0; iCount--)// prints off the student info starting with the last entered
		{
			System.out.println("Name \t Subject \t Ave \t Grade \t");
			System.out.println(aiStudent[iCount].name + '\t'+ aiStudent[iCount].favorite_Subject + '\t' + aiStudent[iCount].final_ave
					+ '\t' + aiStudent[iCount].letter_grade);
			
		}
		
		
	}

}

public class Student {

	String name;
	int quiz_ave;
	int test_ave;
	int homework_ave;
	String favorite_Subject;
	double final_ave;
	String letter_grade;
	
	Student()
	{
		
	}
	
	Student(String sName, int iquiz, int itest, int ihomework, String sFav)
	{
		this.name = sName;
		this.quiz_ave = iquiz;
		this.test_ave = itest;
		this.homework_ave = ihomework;
		this.favorite_Subject = sFav;
		finalGrade();//calls the final grade method
	}
	
	void finalGrade()
	{
		this.final_ave = (quiz_ave * .2) + (test_ave * .4) + (homework_ave * .4);
		
		if (this.final_ave > .90)
		{
			this.letter_grade ="A";
		}
		else if (this.final_ave > 80)
		{
			this.letter_grade = "B";
		}
		else if (this.final_ave > 70)
		{
			this.letter_grade = "C";
		}
		else
		{
			this.letter_grade = "E";
		}
	}
}
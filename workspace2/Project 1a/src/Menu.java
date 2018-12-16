/*
 Author: Israel Beh
 Description: The Menu class is where the menu of options is displayed. Depending on which option is entered,
 the user can input class information, search for a student, or exit the program.
 */
import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		
		Scanner oScan = new Scanner(System.in);
		int iSelection;
		String sFName;
		String sLName;
		int iHwave;
		int iQzave;
		int iPjtave;
		int iTstave;
		int iNumStud;
		boolean bSelection = false;
		Student aoStud[] = null ;// creates an array that exists outside of the if statements, thus allowing 
		//the information to be accessed by the user when selection option 1

		while (bSelection == false)//the while loop allows the user to run the program until the user decides to 
			//exit the program by choosing option 3
		{
			//the program should display a menu
			System.out.println("Please make a selection (1, 2, or 3)");
			System.out.println();
			System.out.println("1. New Class List");
			System.out.println("2. Search for a Student");
			System.out.println("3. Exit");
			
			iSelection = oScan.nextInt();
			
			// when selection 1 is chosen, the user is able to put in class info
			if (iSelection == 1)
			{
				int iStudCount;
				int iCount = 1;
				
				System.out.println("How many students?");
				iNumStud = oScan.nextInt();
				aoStud = new Student[iNumStud];//this enables the user to determine how long the array is and assigns the object to an array
				
				for (iStudCount = 0; iStudCount < iNumStud; iStudCount++)// loads up the array
				{
					System.out.println("Enter Student " + iCount++);// keeps track of number of students
					oScan.nextLine();
					
					System.out.println("First Name: ");
					sFName = oScan.nextLine();
					System.out.println("Last Name: ");
					sLName = oScan.nextLine();
					System.out.println("Homework Average: ");
					iHwave = oScan.nextInt();
					System.out.println("Quiz Average: ");
					iQzave = oScan.nextInt();
					System.out.println("Project Average: ");
					iPjtave = oScan.nextInt();
					System.out.println("Test Average: ");
					iTstave = oScan.nextInt();
					
					aoStud[iStudCount] = new Student(sFName, sLName, iHwave, iQzave, iPjtave, iTstave);
				}
				System.out.println('\n');
				bSelection = false;
			}
			
			else if (iSelection == 2)
			{
				//selection 1 must precede selection 2 otherwise it will be empty
				String sLSearch;
				String sFSearch;
				boolean correctName  = false;//identifies if a correct name is entered
				int iCount;
				
				oScan.nextLine();
			
				/*if (aoStud == null)//if 2 is selected before 1, the array will be empty thus creating an endless loop when
					//searching for a student. by verifying the value found in aoStud, I am able to prompt user to enter
					// the student information before searching for students.
				{
					System.out.println("No class information found. Please enter class information by selecting 1");
					bSelection = false;
				}
				else
				{*/
				
				System.out.println("Enter Student's last name");
				sLSearch = oScan.nextLine();
				System.out.println("Enter Student's first name");
				sFSearch = oScan.nextLine();
				
						for (iCount = 0; iCount < aoStud.length; iCount++) //runs through the array
						{
							if (aoStud[iCount].getFName().equalsIgnoreCase(sFSearch) && aoStud[iCount].getLName().equalsIgnoreCase(sLSearch) ) //searches for the team name you entered
							{
								aoStud[iCount].getFinalGrade();//prints the final grade and letter grade
								aoStud[iCount].getStudentName();//prints student name
								System.out.println('\n');
								bSelection = true;
								
							}
							
						}
						if (	bSelection == false)
						{
						System.out.println("Student not found");
						}
					
				
				}
			//}
			else if (iSelection ==3)
			{
				System.out.println("Thank you, come again");
				bSelection = true;
				oScan.close();
			}
			else//when the user enters a number that is not 1, 2, or 3, the user is told that they enter an invalid number
			{
				System.out.println("The number you entered cannot be found");
				bSelection = false;
			}
		}

	}

}
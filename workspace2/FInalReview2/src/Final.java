import java.util.Scanner;


public class Final {

	public static void main(String[] args) {
		Scanner oScan = new Scanner(System.in);
		Student aoStud[] = null;
		String sFName;
		String sLName;
		int iCount;
		int ihwave;
		int iqzave;
		int ipjtave;
		int itstave;
		int iSelect;
		int iNumStud;
		boolean bMenu = true;
		
		while (bMenu == true)
		{
		System.out.println("1. New Class List");
		System.out.println("2. Search for a Student");
		System.out.println("3. Exit");
		System.out.println("Please choose an option (1,2,3)");
		iSelect = oScan.nextInt();
		
		
			if (iSelect == 1)
			{
				System.out.println("Number of Students: ");
				iNumStud = oScan.nextInt();
				aoStud = new Student[iNumStud];
				oScan.nextLine();
				for(iCount= 0; iCount < aoStud.length; iCount++)
				{
					System.out.println("Student first name: ");
					sFName = oScan.nextLine();
					System.out.println("Student last name: ");
					sLName = oScan.nextLine();
					System.out.println("Student HW average: ");
					ihwave = oScan.nextInt();
					System.out.println("Student quiz average: ");
					iqzave = oScan.nextInt();
					System.out.println("Student project average: ");
					ipjtave = oScan.nextInt();
					System.out.println("Student test average: ");
					itstave = oScan.nextInt();
					oScan.nextLine();
					
				aoStud[iCount] = new Student(sFName, sLName, ihwave, iqzave, ipjtave, itstave);
				bMenu = true;
				}
				
			}
			else if(iSelect ==2)
			{
				/*int a, b;
				Student c;
				for(a = 1; a < aoStud.length; a++)
				{
					for(b=aoStud.length-1; b >= a; b--)
						if(aoStud[b-1].getFnlgrade() < aoStud[b].getFnlgrade())
						{
							c = aoStud[b-1];
							aoStud[b-1] = aoStud[b];
							aoStud[b] = c;
						}
				}*/
				Student.Sort(aoStud);
				for (iCount = 0; iCount < aoStud.length; iCount++)
				{
					aoStud[iCount].getName();
					aoStud[iCount].getGrade();
					System.out.println('\n');
				}
			}
			else
			{	
				oScan.close();
				System.exit(0);
			}
		}

	}

}

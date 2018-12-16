import java.util.Scanner;


public class ClassInfo {

	public static void main(String[] args) {
		int iSelected;
		
		int NofStud;
		int iCount;
		String sFName;
		String sLName;
		int iHWave;
		int iQzave;
		int iPjtave;
		int iTstave;
		boolean bMenu = true;
		Student NofS[] = null;
		Scanner oScan = new Scanner(System.in);
		while (bMenu==true)	
		{
			System.out.println("1.\t New Class List");
			System.out.println("2.\t Search for a Student");
			System.out.println("3.\t Exit");
			
			System.out.println("Make a selection 1, 2, or 3");
			iSelected = oScan.nextInt();
			
		
			if (iSelected == 1)
				{ 	int iStudCount = 1;
					
					System.out.println("Enter number of students");
					NofStud = oScan.nextInt();
					oScan.nextLine();
					NofS = new Student[NofStud];
					for (iCount = 0; iCount < NofStud; iCount ++)
					{
						System.out.println("Enter Student " + iStudCount++);
						System.out.println("What is the student's first name?");
						sFName = oScan.nextLine();
						System.out.println("What is the student's last name?");
						sLName = oScan.nextLine();
						System.out.println("What is the student's homework average?");
						iHWave = oScan.nextInt();
						System.out.println("What is the student's quiz average?");
						iQzave = oScan.nextInt();
						System.out.println("What is the student's project average?");
						iPjtave = oScan.nextInt();
						System.out.println("What is the student's test average?");
						iTstave = oScan.nextInt();
						
						
						NofS[iCount] = new Student(sFName, sLName, iHWave, iQzave, iPjtave, iTstave);
						bMenu = true;
						oScan.nextLine();
					}	
				}
			
			else if (iSelected == 2)
			{
				if (NofS == null)
				{
					System.out.println("No student information found, please enter info by selection 1");
					bMenu = true;
				}
				else{
					oScan.nextLine();
					int a, b;
					Student c;
					
					for(a = 1; a < NofS.length; a++)
					{
						for(b = NofS.length -1; b >= a; b --)
						{
							if(NofS[b-1].getFnlGrade() < NofS[b].getFnlGrade())
							{
								c = NofS[b-1];
								NofS[b-1]= NofS[b];
								NofS[b] = c;
								
							}
						}
					}
					for(iCount= 0; iCount < NofS.length; iCount++)
					{
				
							System.out.println(NofS[iCount].getName());
							NofS[iCount].getGrade();
							bMenu = true;
							
						
					}
				}
			}
			else
			{
				System.out.println("thank you! Come again");
				bMenu = false;
			
				System.exit(0);
			}
		}	
	}

}

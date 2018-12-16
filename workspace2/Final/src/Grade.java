/*
 * Author: Israel Beh
 * Description: final exam
 */
import java.text.DecimalFormat;
import java.util.Scanner;


public class Grade {

	public static void main(String[] args) {
		Scanner oScan = new Scanner (System.in);
		Student aoStud[] = new Student [3];
		int iCount;
		
		int iID = 0;
		String sFName = null;
		String sLName = null;
		int iHWave = 0; 
		int iQzave= 0;
		int iMTave = 0;
		int iFnlave =0;
		//for loop goes through the student information and loads up the variables and then assigns to instance variables by calling
		// the constructor
		for (iCount = 0; iCount < aoStud.length; iCount++)
		{
			System.out.println("What is the student's ID?");
			iID = oScan.nextInt();
			oScan.nextLine();
			System.out.println("What is the student's first name?");
			sFName = oScan.nextLine();
			System.out.println("What is the student's last name?");
			sLName = oScan.nextLine();
			
			for (int iCounter = 0; iCounter < 4; iCounter++)
			{
				if(iCounter == 0)
				{
					System.out.println("Enter homework average: ");
					iHWave = oScan.nextInt();
				}
				else if(iCounter == 1)
				{
					System.out.println("Enter quiz average: ");
					iQzave = oScan.nextInt();
				}
				else if(iCounter == 2)
				{
					System.out.println("Enter midterm average: ");
					iMTave = oScan.nextInt();
				}
				else
				{
					System.out.println("Enter final average: ");
					iFnlave = oScan.nextInt();
				}
				aoStud[iCount] = new Student(sFName, sLName, iID, iHWave, iQzave, iMTave, iFnlave);
			}
			
		}
		
		int a, b;
		Student c;
		
		//sorts the students by final score
		for (a = 1; a < aoStud.length; a++)
		{
			for (b = aoStud.length-1; b >= a; b--)
			{
				if(aoStud[b].getFinalScore() < aoStud[b-1].getFinalScore())
				{
					c = aoStud[b-1];
					aoStud[b-1] = aoStud[b];
					aoStud[b] = c;
				}
			}
		}
		//prints the data
		for(iCount = 0; iCount < aoStud.length; iCount++)
		{
			Student.PrintStudent(aoStud, iCount);
		}
		
		
	}
	

}


//Class that holds Person attributes
class Person{
	protected String FirstName;
	protected String LastName;
	
	//setters and getters
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	//Constructor that receives name parameters
	Person(String sFName, String sLName)
	{
		this.FirstName = sFName;
		this.LastName = sLName;
	}
}


//class that hold the student's grade information
class Student extends Person{
	//instance variables are only visible in this class
	private double FinalScore;
	private String LetterGrade;
	private int HomeworkAve;
	private int QuizAve;
	private int MidtermAve;
	private int FinalExam;
	private int id;
	//constructor that receives parameters passed from the Grade class and assigns the values to instance variables.
	Student (String sFName, String sLName,int iID,  int iHWave, int iQzave, int iMTave, int iFnlave)
	{
		super (sFName, sLName);
		this.id = iID;
		this.HomeworkAve = iHWave;
		this.QuizAve = iQzave;
		this.MidtermAve = iMTave;
		this.FinalExam = iFnlave;
		CalcFinalScore();
	}
	//Constructor that receives student ID, first and last Name
	Student (int iID, String sFName, String sLName)
	{
		super(sFName, sLName);
		this.id = iID;
	}
	
	//method that calculates the final score and assigns a letter grade
	void CalcFinalScore()
	{
		this.FinalScore = ((double)this.HomeworkAve * .5) + ((double)this.QuizAve * .05) + 
							((double)this.MidtermAve * .2) + ((double)this.FinalExam * .25);
		if (this.FinalScore >=90)
		{
			this.LetterGrade = "A";
		}
		else if(this.FinalScore >= 80 && this.FinalScore <= 89)
		{
			this.LetterGrade = "B";
		}
		else if(this.FinalScore >= 70 && this.FinalScore <= 79)
		{
			this.LetterGrade = "C";
		}
		else
		{
			this.LetterGrade = "F";
		}
	}
	void PrintStudent(Student aoStud[])
	{
		DecimalFormat dformat = new DecimalFormat("0.00");
		System.out.println("Student Name \t Score \t Grade");
		System.out.println("------- ---- \t ----- \t -----");
		System.out.println(aoStud[0].getFirstName() + " " + aoStud[0].getLastName() + '\t' + 
				dformat.format(aoStud[0].getFinalScore()) + '\t' + aoStud[0].getLetterGrade());
		System.out.println(aoStud[1].getFirstName() + " " + aoStud[1].getLastName() + '\t' 
							+ dformat.format(aoStud[1].getFinalScore()) + '\t' + aoStud[1].getLetterGrade());
		System.out.println(aoStud[2].getFirstName() + " " + aoStud[2].getLastName() + '\t' 
							+ dformat.format(aoStud[2].getFinalScore()) + '\t' + aoStud[2].getLetterGrade());
		System.out.println(aoStud[3].FirstName + " " + aoStud[3].LastName + '\t' 
							+ dformat.format(aoStud[3].getFinalScore()) + '\t' + aoStud[3].getLetterGrade());
	}
	static void PrintStudent(Student aoStud[], int iID)
	{
		System.out.println("Student Name \t Score \t Grade");
		System.out.println("------- ---- \t ----- \t -----");
		System.out.println(aoStud[iID].getFirstName() + " " + aoStud[iID].getLastName() + '\t' 
							+ aoStud[iID].getFinalScore() + '\t' + aoStud[iID].getLetterGrade());
	}
	
	
	public double getFinalScore() {
		return FinalScore;
	}
	public void setFinalScore(double finalScore) {
		FinalScore = finalScore;
	}
	public String getLetterGrade() {
		return LetterGrade;
	}
	public void setLetterGrade(String letterGrade) {
		LetterGrade = letterGrade;
	}
	public int getHomeworkAve() {
		return HomeworkAve;
	}
	public void setHomeworkAve(int homeworkAve) {
		HomeworkAve = homeworkAve;
	}
	public int getQuizAve() {
		return QuizAve;
	}
	public void setQuizAve(int quizAve) {
		QuizAve = quizAve;
	}
	public int getMidtermAve() {
		return MidtermAve;
	}
	public void setMidtermAve(int midtermAve) {
		MidtermAve = midtermAve;
	}
	public int getFinalExam() {
		return FinalExam;
	}
	public void setFinalExam(int finalExam) {
		FinalExam = finalExam;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	 
}

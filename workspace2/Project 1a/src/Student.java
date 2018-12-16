/*
 Author: Israel Beh
 Description: The Student class is the base or parent class. it contains the instance variables for all of the 
 averages, calculates the final grade and assigns a letter grade. Student constructor for the Student class
 , and getters and setters for all attributes.
 */
public class Student extends Person{
//All Student attributes have a private scope
	private int Homework_Ave;
	private	int Quiz_Ave;
	private int Project_Ave;
	private int Test_Ave;
	private double FinalGrade;
	private String LetterGrade;
	
	//Student constructor
	Student (String sFName, String sLName, int iHwave, int iQzave, int iPjtave, int iTstave)
	{
		super(sFName, sLName);//uses the parent class by calling super
		this.Homework_Ave = iHwave;
		this.Quiz_Ave = iQzave;
		this.Project_Ave = iPjtave;
		this.Test_Ave = iTstave;
		CalcGrade();
	}
	//setters for the averages
	void setHwave(int iHwave)
	{
		this.Homework_Ave = iHwave;
	}
	
	void setQzave(int iQzave)
	{
		this.Quiz_Ave = iQzave;
	}
	
	void setPjtave(int iPjtave)
	{
		this.Project_Ave = iPjtave;
	}
	
	void setTstave(int iTstave)
	{
		this.Test_Ave = iTstave;
	}
	
	void CalcGrade()//calculates final grade and assigns a letter grade
	{
		{
			this.FinalGrade = ((double) this.Homework_Ave * .15) +((double) this.Quiz_Ave * .05) + 
							((double) this.Test_Ave * .4) + ((double) this.Project_Ave* .4);
			
			if (this.FinalGrade >= 90.0 && this.FinalGrade <= 100.0)
			{
				this.LetterGrade ="A";
			}
			else if (this.FinalGrade >= 80.0 && this.FinalGrade <= 89.0)
			{
				this.LetterGrade = "B";
			}
			else if (this.FinalGrade >= 70.0 && this.FinalGrade <= 79.0)
			{
				this.LetterGrade = "C";
			}
			else if (this.FinalGrade >= 60.0 && this.FinalGrade <= 69.0)
			{
				this.LetterGrade = "D";
			}
			else
			{
				this.LetterGrade = "F";
			}
		}
	}
	void getFinalGrade()//Display final grade and letter grade
	{
		System.out.println("Final Grade: " + this.FinalGrade);
		System.out.println("Letter Grade: " + this.LetterGrade);
	}
}

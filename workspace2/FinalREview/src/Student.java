
public class Student extends Person {
	
	private int HWave;
	private int Quizave;
	private int Pjtave;
	private int Testave;
	private double FnlGrade;
	private String LetterGrade;
	
	Student (String sFName, String sLName, int iHWave, int iQuizave, int iPjtave, int iTestave)
	{
		super(sFName, sLName);
		this.HWave = iHWave;
		this.Quizave = iQuizave;
		this.Pjtave = iPjtave;
		this.Testave = iTestave;
		CalcGrade();
	}
	
	void CalcGrade ()
	{
		this.FnlGrade = ((double)this.HWave*.15) + ((double)this.Quizave*.05) + ((double)this.Pjtave*.4) + ((double) this.Testave*.4);
		
		if(this.FnlGrade >= 90 && this.FnlGrade <= 100)
			this.LetterGrade = "A";
		else if(this.FnlGrade >= 80 && this.FnlGrade <= 89)
			this.LetterGrade = "B";
		else if(this.FnlGrade >= 70 && this.FnlGrade <= 79)
			this.LetterGrade = "C";
		else if(this.FnlGrade >= 60 && this.FnlGrade <= 69)
			this.LetterGrade = "D";
		else
			this.LetterGrade = "F";
	}

	public void setHWave(int hWave) {
		HWave = hWave;
	}

	

	public void setQuizave(int quizave) {
		Quizave = quizave;
	}


	public void setPjtave(int pjtave) {
		Pjtave = pjtave;
	}


	public void setTestave(int testave) {
		Testave = testave;
	}
	
	void getGrade()
	{
		System.out.println("Final Grade: "  + this.FnlGrade);
		System.out.println("Letter Grade: " + this.LetterGrade);
		System.out.println('\n');
	}
	double getFnlGrade()
	{
	return this.FnlGrade;
	}
}

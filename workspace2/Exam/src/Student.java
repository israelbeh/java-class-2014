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
		this.final_ave = ((double) this.quiz_ave * .2) + 
						((double) this.test_ave * .4) + 
						((double) this.homework_ave * .4);
		
		if (this.final_ave >= 90.0)
		{
			this.letter_grade ="A";
		}
		else if (this.final_ave >= 80.0)
		{
			this.letter_grade = "B";
		}
		else if (this.final_ave >= 70.0)
		{
			this.letter_grade = "C";
		}
		else
		{
			this.letter_grade = "E";
		}
	}
}

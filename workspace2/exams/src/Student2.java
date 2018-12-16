
public class Student2 {
	String name;
	int quiz_ave;
	int test_ave;
	int homework_ave;
	String favorite_Subject;
	double final_ave;
	String letter_grade;
	
	Student2 ()
	{
		
	}
	Student2(String sName, int iquizave, int itestave, int ihwave, String ifav)
	{
		this.name = sName;
		this.quiz_ave = iquizave;
		this.test_ave = itestave;
		this.homework_ave = ihwave;
		this.favorite_Subject = ifav;
		CalcGrade();
	}
	
	void CalcGrade ()
	{
	this.final_ave = ((double) this.quiz_ave * .2) + ((double) this.test_ave * .4) +
					 ((double)this.homework_ave * .4);
	
	if (this.final_ave >= 90 && this.final_ave <= 100)
	{
		this.letter_grade = "A";
	}
	else if (this.final_ave >= 80 && this.final_ave <= 89)
	{
		this.letter_grade = "B";
	}
	else if (this.final_ave >= 70 && this.final_ave <= 79)
	{
		this.letter_grade = "C";
	}
	else
		this.letter_grade = "E";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuiz_ave() {
		return quiz_ave;
	}
	public void setQuiz_ave(int quiz_ave) {
		this.quiz_ave = quiz_ave;
	}
	public int getTest_ave() {
		return test_ave;
	}
	public void setTest_ave(int test_ave) {
		this.test_ave = test_ave;
	}
	public int getHomework_ave() {
		return homework_ave;
	}
	public void setHomework_ave(int homework_ave) {
		this.homework_ave = homework_ave;
	}
	public String getFavorite_Subject() {
		return favorite_Subject;
	}
	public void setFavorite_Subject(String favorite_Subject) {
		this.favorite_Subject = favorite_Subject;
	}
	public double getFinal_ave() {
		return final_ave;
	}
	public void setFinal_ave(double final_ave) {
		this.final_ave = final_ave;
	}
	public String getLetter_grade() {
		return letter_grade;
	}
	public void setLetter_grade(String letter_grade) {
		this.letter_grade = letter_grade;
	}

}

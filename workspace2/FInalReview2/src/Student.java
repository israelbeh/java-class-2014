import java.text.DecimalFormat;


public class Student extends Person {
	private int hwave;
	private int qzave;
	private int pjtave;
	private int tstave;
	private double fnlgrade;
	private String ltrgrade;
	
	Student (String sFName, String sLName, int ihwave, int iqzave, int ipjtave, int itstave)
	{
		super(sFName, sLName);
		this.hwave = ihwave;
		this.qzave = iqzave;
		this.pjtave = ipjtave;
		this.tstave = itstave;
		CalcGrade();
		
	}
	
	void CalcGrade()
	{
		
		this.fnlgrade = ((double)this.hwave*.15) + ((double)this.qzave*.05) + ((double)this.pjtave*.40) + ((double)this.tstave*.40);
		
		if(this.fnlgrade >= 90 && this.fnlgrade <= 100)
			this.ltrgrade = "A";
		else if(this.fnlgrade >= 80 && this.fnlgrade <= 89)
			this.ltrgrade = "B";
		else if(this.fnlgrade >= 70 && this.fnlgrade <= 79)
			this.ltrgrade = "C";
		else if(this.fnlgrade >= 60 && this.fnlgrade <= 69)
			this.ltrgrade = "D";
		else
			this.ltrgrade = "F";
	}
	void getGrade()
	{
		DecimalFormat dFormat = new DecimalFormat("0.00");
		System.out.println("Final Grade: " + dFormat.format(getFnlgrade()));
		System.out.println("Letter Grade: " + getLtrgrade());
	}
	public int getHwave() {
		return hwave;
	}

	public void setHwave(int hwave) {
		this.hwave = hwave;
	}

	public int getQzave() {
		return qzave;
	}

	public void setQzave(int qzave) {
		this.qzave = qzave;
	}

	public int getPjtave() {
		return pjtave;
	}

	public void setPjtave(int pjtave) {
		this.pjtave = pjtave;
	}

	public int getTstave() {
		return tstave;
	}

	public void setTstave(int tstave) {
		this.tstave = tstave;
	}

	public double getFnlgrade() {
		return fnlgrade;
	}

	public void setFnlgrade(double fnlgrade) {
		this.fnlgrade = fnlgrade;
	}

	public String getLtrgrade() {
		return ltrgrade;
	}

	public void setLtrgrade(String ltrgrade) {
		this.ltrgrade = ltrgrade;
	}
	static void Sort(Student aoStud[])
	{
		int a, b;
		Student c;
		for(a =1; a < aoStud.length; a++)
		{
			for(b=aoStud.length-1; b>= a; b--)
				if(aoStud[b-1].fnlgrade < aoStud[b].fnlgrade)
				{
					c = aoStud[b-1];
					aoStud[b-1] = aoStud[b];
					aoStud[b] = c;
				}
		}
	}

	

}

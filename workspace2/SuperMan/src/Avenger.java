
public class Avenger extends SuperHero// this is how you give inheritance
{
	boolean isMarvel;
	//first thing
	Avenger(String sName)
	{
		super(sName);//the first thing you do is call the parent class, so we don't have to do the work twice
		super.dispAttr();
	}
	
	void dispAttr()
	{
		super.dispAttr();
	}
}

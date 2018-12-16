
public class SuperHero 
{
	/*
	 By making them private, you have complete control over what is in that attribute.
	 SuperHero is a base class, but is really based on the object class, just like Adam is the base, but God is the object.
	 */
	protected String name;//can be shared
	private boolean canFly;
	private boolean hasHammer;
	private boolean isBulletProof;
	private boolean hasSharpFingers;
	
	SuperHero()
	{
		super();
	}
	
	public SuperHero(String name) {
		super();
		this.name = name;
	}
	void dispAttr()
	{
		System.out.println(this.name);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isHasHammer() {
		return hasHammer;
	}
	public void setHasHammer(boolean hasHammer) {
		this.hasHammer = hasHammer;
	}
	public boolean isBulletProof() {
		return isBulletProof;
	}
	public void setBulletProof(boolean isBulletProof) {
		this.isBulletProof = isBulletProof;
	}
	public boolean isHasSharpFingers() {
		return hasSharpFingers;
	}
	public void setHasSharpFingers(boolean hasSharpFingers) {
		this.hasSharpFingers = hasSharpFingers;
	}

}


public class SuperMan {

	public static void main(String[] args) {
		Avenger oPerson = new Avenger("Mermaid Man");
		
		System.out.println(oPerson.name);
		oPerson.setName("Thor");
		oPerson.setCanFly(true);
		oPerson.name = "thor";
		

	}

}

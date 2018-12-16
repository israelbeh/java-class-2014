
public class Switch {
		public static void main(String args[]) {
			int iCount;
			
			for (iCount = 0; iCount < 10; iCount++)
			{
				switch (iCount)
				{
				case 0:
				case 1:
					System.out.println("I am zero from Holes");
					break;
				case 2:
					System.out.println("someone left out R2D");
					break;
				case 3:
					System.out.println("Sounds like some amigos");
					break;
				default:
					System.out.println("I can't think");
				}
			}
		}
}

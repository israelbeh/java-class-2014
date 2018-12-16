import java.util.*;
 
public class HW2 {
 
/**
* @param args
*/
   public static void main(String[] args) {
      Random rndGenerator= new Random();// new creates an object of type Random, based on the Random class. This is called from the import
      									// Random is a constructor
      //declare your variables here that you will use for the Rockies and Dodgers
      int iRockies, iDodgers;
      
      iRockies = rndGenerator.nextInt( 15 );//you can know its an object because it shows method after.
      iDodgers = rndGenerator.nextInt( 15 );// 0 and 14
 
      //insert your code here to determine who wins
      if (iRockies > iDodgers)
      {
    	  System.out.println("Rockies " + iRockies);
    	  System.out.println("Rockies Win");
      }
      else if (iDodgers > iRockies)
      {
    	  System.out.println("Dodgers " + iDodgers);
    	  System.out.println("Dodgers Win");
      }
      else
      {
    	  
      }
      }
}
 

/*
 * Author: Israel Beh
 * Description: Homework 2
 */
import java.util.*;
 
public class Baseball 
{
 
/**
* @param args
*/
   public static void main(String[] args) 
   {
      Random rndGenerator= new Random();
      
     
      
 
      /*
       * iRockies will hold the random score for Rockies
       * iDodgers will hold the random score for Dodgers
       */
      
      int iRockies;
      int iDodgers;
      
      //define variables
      
      iRockies = rndGenerator.nextInt( 15 );
      iDodgers = rndGenerator.nextInt( 15 );
 
      
      //this prints out the team score, the team name, and adds a space between the who wins.
      System.out.println("Rockies " + iRockies);
      System.out.println("Dodgers " + iDodgers);
      System.out.println('\n');
      
      //this determines who wins by comparing scores. Whoever has the higher score wins.
      if (iRockies > iDodgers)
    	  System.out.println ("Rockies Win");
      		
      else if (iRockies < iDodgers)
    	  System.out.println ("Dodgers Win");
      else
    	  System.out.println("It was a tie");
    	  
    }
}
 
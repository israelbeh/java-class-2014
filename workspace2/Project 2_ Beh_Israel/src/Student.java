

/**
 *
 * @author israelbeh
 * Description: The Class Student is used to created a method that will calculate
 * the weight of the grade
 */
public class Student {
    // this method receives two parameters the letter grade and the number of 
    // credits and returns the weight
      double CalcGPA(String sLetterGrade, double iWeight)
    {

 
        String sGrd = sLetterGrade;
        double dWeight =0;
        
        double dTotal;
// depending on which letter grade is found in the combination box
        // the weight will be calculated using the the if statement
        if (sGrd.equalsIgnoreCase("A"))
            dWeight = 4.0 * iWeight;// calculates the weight
            
        else if (sGrd.equalsIgnoreCase("A-"))
            dWeight = 3.7* iWeight;
        else if (sGrd.equalsIgnoreCase("B+"))
            dWeight = 3.4*iWeight;
        else if (sGrd.equalsIgnoreCase("B"))
            dWeight = 3.0*iWeight;
        else if (sGrd.equalsIgnoreCase("B-"))
            dWeight = 2.7*iWeight;
        else if (sGrd.equalsIgnoreCase("C+"))
            dWeight = 2.4*iWeight;
        else if (sGrd.equalsIgnoreCase("C"))
            dWeight = 2.0*iWeight;
        else if (sGrd.equalsIgnoreCase("C-"))
            dWeight = 1.7*iWeight;
        else if (sGrd.equalsIgnoreCase("D+"))
            dWeight = 1.4*iWeight;
        else if (sGrd.equalsIgnoreCase("D"))
            dWeight = 1.0*iWeight;
       else if (sGrd.equalsIgnoreCase("D-"))
            dWeight = 0.7*iWeight;
       else if (sGrd.equalsIgnoreCase("E"))
            dWeight = 0.0*iWeight;
       
        
        return dWeight;
        
        
   
    }
    
}

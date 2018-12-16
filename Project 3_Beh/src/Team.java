
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author israelbeh
 */
public class Team {
    String TeamName;
    int Wins;
    int Losses;
    double WinLossPercent;
    int PlayoffWins;
    int PlayoffLosses;
    
    Team(String sTeamName)
    {
        this.TeamName = sTeamName;
 
    }
    
   
    void CalcWinLoss()
    {
       this.WinLossPercent =(double)this.Wins/((double)this.Wins + (double)this.Losses); 
       
       
    }
            
    double getWinLoss()
    {
        CalcWinLoss();
        
        return this.WinLossPercent;   
    }
    
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coursegrades;

/**
 *
 * @author RPM
 * Subclass of GradedActivity specific to an essay assignment
 */
public class Essay extends GradedActivity
{
    
    // To hold score and subscores
    private double gramScore;
    private double spellScore;
    private double lengthScore;
    private double contentScore;
    private double totScore;
    
    // default Essay constructor 
    public Essay()
   {
           
   }
    
    // Method to set Essay subscores, calculate total and set total score 
    // in GradedActivity superclass.
    // Takes 4 doubles as Grammar, Spelling, Length and COntent subscores
    public void setScore(double gram, double spell, double length, double content)
   {
      // Set the subscores
      gramScore = gram;
      spellScore = spell;
      lengthScore = length;
      contentScore = content;
      
      // Calculate the total score
      totScore = gramScore + spellScore + lengthScore + contentScore;

      // Call the superclass's setScore method to
      // set the numeric score.
      setScore(totScore);
             
   }
    
    // Method to return Grammar subscore
    public double getGrammar()
    {
        return gramScore;        
    }
    
    // Method to return Spelling subscore
    public double getSpelling()
    {
        return spellScore;        
    }
    
    // Method to return Length subscore
    public double getCorrectLength()
    {
        return lengthScore;        
    }
    
    // Method to return Content subscore
    public double getContent()
    {
        return contentScore;        
    }
    
}

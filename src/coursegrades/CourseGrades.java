/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coursegrades;

/**
 *
 * @author RPM
 */
public class CourseGrades implements Analyzable
{
    int index = 0;  // to hold place in object array
    
    // create array of GradedActivity objects
    GradedActivity[] grades = new GradedActivity[4];
    
    
    // default constructor
    public CourseGrades()
    {
                     
    }
    
    // Method to set element of array as Lab
    public void setLab(GradedActivity g)
    {
        grades[index] = g;
        index++;
    }
    
    // Method to set element of array as Pass/Fail Exam
    public void setPassFailExam(PassFailExam p)
    {
        grades[index] = p;
        index++;
    }
    
    // Method to set element of array as Essay
    public void setEssay(Essay e)
    {
        grades[index] = e;
        index++;
    }
    
    // Method to set element of array as FInal Exam
    public void setFinalExam(FinalExam f)
    {
        grades[index] = f;
        index++;
    }
            
    // Method to calculate and return average score of assignments
    public double getAverage()
    {
        double totScore = 0;
        double avgScore = 0;
                
        for(int i = 0; i < 4; i++)
        {
            totScore = totScore + grades[i].getScore();
        }
        
        avgScore = totScore / 4;
        
        return avgScore;
    }
    
    // Method to determine and return highest score of assignments
    public GradedActivity getHighest()
    {
        int startScan, element, minIndex;   // Nedded for sort
        int high = 0;
        double minValue;
        double[] scores = new double[4];    // hold scores from object array
        
        for(int i = 0; i < 4; i++)  //load score array
        {
            scores[i] = grades[i].getScore();
        }    
                
        // Sort scores
        for (startScan = 0; startScan < 4; startScan++)
        {
            minIndex = startScan;
            minValue = scores[startScan];
            for(element = startScan + 1; element < 4; element++)
            {
                if (scores[element] < minValue)
                {
                    minValue = scores[element];
                    minIndex = element;
                }
            }
            scores[minIndex] = scores[startScan];
            scores[startScan] = minValue;
        }
        
        // find high score
        for(int i = 0; i < 4; i++)
        {
            if(grades[i].getScore() == scores[3])
                high = i;
        }
        
        return grades[high];
        
    }
    
    // Method to determine and return lowest score of assignments
    public GradedActivity getLowest()
    {
        int startScan, element, minIndex;   // needed for sort
        int low = 0; 
        double minValue;
        double[] scores = new double[4];    // hold scores from object array
        
        // load score array
        for(int i = 0; i < 4; i++)
        {
            scores[i] = grades[i].getScore();
        }    
                
        // sort scores
        for (startScan = 0; startScan < 4; startScan++)
        {
            minIndex = startScan;
            minValue = scores[startScan];
            for(element = startScan + 1; element < 4; element++)
            {
                if (scores[element] < minValue)
                {
                    minValue = scores[element];
                    minIndex = element;
                }
            }
            scores[minIndex] = scores[startScan];
            scores[startScan] = minValue;
        }
        
        // find lowest score
        for(int i = 0; i < 4; i++)
        {
            if(grades[i].getScore() == scores[0])
                low = i;
        }
        
        return grades[low]; 
        
    }
    
    public String toString()
   {
      String str = "The scores and letter grades for current " +
                         "graded activities are:";
       for(int i = 0; i < 4; i++)
        {
            str = str + "\nGraded Activity " + (i+1) +
                         " Score: " + grades[i].getScore() + 
                         " Grade: " + grades[i].getGrade();
        }
            
      // Return the string.
      return str;
   }

   
}

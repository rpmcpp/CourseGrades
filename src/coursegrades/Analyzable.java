/*
 * To change this license header, choose License Headers in 
 * Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coursegrades;

/**
 * Interface to define CourseGrades design
 * @author RPM
 */
public interface Analyzable 
{
    double getAverage();
    GradedActivity getHighest();
    GradedActivity getLowest();
    
}

//  Robert Sullivan
//  CSE2
//  10/4/14

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   double y = 1-x/100;
   System.out.println("The proportion remaining is:"+ y);
   
   }//  end main method
}// end class

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *    I added brckets to all the if and else if statements
 *    I deleted all the if statements because they were unncessisary
 *    I added a variable y to determine the proportion remaining
 *    I added a print out statement for it
 */

//  Robert Sullivan
//  CSE2
//  10/4/14

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String arg []){
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    if(scan.hasNextInt()){
      int n=scan.nextInt();
      System.out.println("You entered "+n);
    
        int k=4,p=6,q=7,r=8;
        switch(k+p+q+r){
            case 24:
            case 25: System.out.println("Sum is 25");
            System.out.println("Again, you entered "+n);
            break;
        }// end switch
    }// end if
    else{
      
      System.out.println("You did not enter an int");
      return;
    }// end else
    
   
    
  }//   end main method
}// end class

/* Error report:
 *   Expand this comment:
 *   Explain the error(s) that occurred here, and then fix them
 *   I put the switch statement inside the if statement so that n was 
     defined and I changed the else statement to say the scanner did not read an int*/
     
     
     

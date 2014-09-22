//  Robert Sullivan
//  CSE2
//  9/21/14

//  find the number of days in a month
//  import scanner
import java.util.Scanner;

//  define a class
public class Month{
//  create main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner = new Scanner(System.in);
//  enter month
System.out.print("Enter month of year (1-12): ");
//  if statement
    if(myScanner.hasNextInt()){
        int month = myScanner.nextInt();
    //  next if statement
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("The month has 31 days.");
        }// end if
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("The month has 30 days.");
        }// end else if
        else if(month == 2){
            System.out.print("Enter an int giving the year: ");
            int year = myScanner.nextInt();
            double year1 = year*.25;
            int year2 = (int) year1;
            year2 = year2*4;
            
            if(year == year2){
                System.out.println("The month has 29 days.");
            }// end if
            else{
                System.out.println("The month has 28 days.");
            }// end else
        }// end else if
        else{
            System.out.println("The number was not 1-12.");
            return;
        }// end else
    }// end if
    else{
        System.out.println("You did not enter an integer!");
        return;
    }// end else
}// end main method
}// end class
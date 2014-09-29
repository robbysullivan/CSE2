//  Robert Sullivan
//  CSE2
//  9/18/14

//  Improve the big mac calculator

//  compile the program
//      javac BigMacAgain.java
//  run the program
//      java BigMacAgain
import java.util.Scanner;
//  define a class
public class BigMacAgain{
//  define a main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner= new Scanner(System.in);
//  enter big macs
System.out.print("Enter the number of big macs: ");
   
    if(myScanner.hasNextInt()){
    int bigMacs = myScanner.nextInt();
    
        
//  create if statement
    if (bigMacs < 0){
        System.out.println("You did not enter an int > 0.");
        return;
    
    }// end if
    else {
        double costPerBigMac = 2.22;
        double fries = 2.15;
        double burgerCost = bigMacs*costPerBigMac;
        double mealTotal = fries+burgerCost;
        System.out.println("You ordered "+bigMacs+" Big Macs for a cost of "+bigMacs+"x"+costPerBigMac+" = $"+ burgerCost);
        System.out.print("Do you want an order of fries? (Y,y,N,n): ");
        String answer = myScanner.Next();
        if(answer.equals("Y")||answer.equals("y")){
            System.out.println("You ordered fries at a cost of $"+fries);
           
            System.out.println("The total cost of your meal is $"+mealTotal);
        }// end if
        else if (answer.equals("N")||answer.equals("n")){
            System.out.println("The total cost of your meal is $"+burgerCost);
        }// end else if
        else{
            System.out.println("You did not enter one of 'Y' 'y' 'N' 'n' ");
            return;
        }// end else
    }// end else 
    }// end if
    else{
        System.out.println("You did not enter an int");
        return;
    }
    
}// end main method

}// end class

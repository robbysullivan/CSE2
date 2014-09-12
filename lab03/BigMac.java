//  Robert Sullivan
//  CSE2
//  9/12/14

//  Write a program to calculate cost of Big Macs

//  compile the program
//      javac BigMac.java
//  run the program
//      java BigMac

//  import scanner
import java.util.Scanner;

//  define a class
public class BigMac{
//  main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner= new Scanner( System.in );
//  enter number of big macs
System.out.print("Enter number of Big Macs(an integer > 0: ");
//  accept user input
    int nBigMacs = myScanner.nextInt();
//  enter price
System.out.print("Enter the price of a Big Mac as"+" a double (int the form xx.xx): " );
    double BigMac$=myScanner.nextDouble();
System.out.print("Enter the percent tax as a whole number (xx): ");
    double taxRate=myScanner.nextDouble();
    taxRate/=100; //user enters percent, but I want proportion
    double cost$;
    int dollars,dimes,pennies; // whole dollar amount of cost dimes,pennies for storing digits to the right of the decimal point for the cost
    cost$=nBigMacs*BigMac$*(1+taxRate);
    // get the whole amount
    dollars=(int)cost$;
    //  dimes amount
    dimes=(int)(cost$*10)%10;
    //  get pennies
    pennies=(int)(cost$*100)%10;
    System.out.println("The total cost of "+nBigMacs+" Big Macs, at $"+BigMac$+" per Big Mac, with a sales tax of "+(int)(taxRate*100)+ "%, is $"+dollars+'.'+dimes+pennies);
    
}// end main method
}// end class
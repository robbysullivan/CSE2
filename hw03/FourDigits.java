//  Robert Sullivan
//  CSE2
//  9/15/14
//  program should print the first four digits after a decimal point

//  compile the program
//      javac FourDigits.java
//  run the program
//      java FourDigits

//  import scanner 
import java.util.Scanner;

//  define a class
public class FourDigits{
//  main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner= new Scanner(System.in);

//  enter number as double
System.out.print("Enter a double and I display the first four digits after the decimal point: ");
//  save double
    double number = myScanner.nextDouble();
//  save whole number     
    int wholeNumber;
    wholeNumber = (int) number;
    
    number = number*10000;
//  create for values for storage
    int value1, value2, value3, value4;
//   find first digit
    value1 = (int) number/1000;
//  subtract whole number 
    wholeNumber = wholeNumber*10;
    value1 = value1 - wholeNumber;
//  find second digit
    value2 = (int) number/100;
//  subtract whole number
    wholeNumber = wholeNumber*10 + value1*10;
    value2 = value2-wholeNumber;
//  find third digit
    value3 = (int) number/10;
//  subtract whole number
    wholeNumber = wholeNumber*10 + value2*10;
    value3 = value3 - wholeNumber;
//  find fourth digit
    value4 = (int) number;
//  subtract whole number
    wholeNumber = wholeNumber*10 + value3*10;
    value4 = value4 - wholeNumber;
//  print the four digits
System.out.println("The four digits are "+value1+value2+value3+value4);

}// end main method
}// end class
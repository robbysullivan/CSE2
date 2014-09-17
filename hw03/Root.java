//  Robert Sullivan
//  CSE02
//  9/14/14

//  compile the program
//      javac Root.java
//  run the program
//      java Root

//  import scanner
import java.util.Scanner;

//  define a class
public class Root{
//  main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner= new Scanner(System.in);
//  enter number
System.out.print("Enter number: ");
//  accept user input
    double value= myScanner.nextDouble();
//  initialize guesses
    double guess1, guess2, guess3, guess4, guess5, guess6, product1;
// calculations   
    guess1=value/3;
    guess2=(((2*guess1*guess1*guess1)+value)/((guess1*guess1)*3));
    guess3=(((2*guess2*guess2*guess2)+value)/((guess2*guess2)*3));
    guess4=(((2*guess3*guess3*guess3)+value)/((guess3*guess3)*3));
    guess5=(((2*guess4*guess4*guess4)+value)/((guess4*guess4)*3));
    guess6=(((2*guess5*guess5*guess5)+value)/((guess5*guess5)*3)); 
    product1=(guess6*guess6*guess6);
// print results
System.out.println("The cube root is "+guess6+":");
System.out.println(guess6+"*"+guess6+"*"+guess6+"="+product1);
    
    
    
}// end main method
}// end class
//  Robert Sullivan
//  10/27/14
//  CSE2

//  import scanner
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){
    char input;
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
    input=getInput(scan,"Cc");
    System.out.println("You entered '"+input+"'");
    System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
    input=getInput(scan,"yYnN",5); //give up after 5 attempts
    if(input!=' '){
       System.out.println("You entered '"+input+"'");
    }
    input=getInput(scan,"Choose a digit.","0123456789");
    System.out.println("You entered '"+input+"'");
  }  
}
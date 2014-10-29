//  Robert Sullivan
//  10/27/14
//  CSE2

//  import scanner
import java.util.Scanner;
//  define class
public class HW8{
  //  main method
  public static void main(String []arg){

  char input;
Scanner scan=new Scanner(System.in); 
//  get input
System.out.print("Enter 'C' or 'c' to continue, anything else to quit- "); 
input=getInput(scan,"Cc"); 
System.out.println("You entered '"+input+"'");
//  get next input
System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); 
//  5 trys
input=getInput(scan,"yYnN",5); 
if(input!=' '){ 
   	System.out.println("You entered '"+input+"'"); 
}// end if
//  get final input
System.out.print("Choose a digit 0-9.");
input=getInput(scan,"0123456789"); 
System.out.println("You entered '"+input+"'");
  }// end main method
//  start other method  
  public static char getInput(Scanner in,  String a){ 
      char[] charArray = a.toCharArray(); 
      do{
          String letter = in.next(); 
          char character = letter.charAt(0); 
      // try until the user enters the right one    
      for (int x = 0; x < charArray.length; x++){
          if(charArray[x] == character){ 
          return character; 
          }
      }
      System.out.print("You did not enter the right character '" + a +"'; try again-");
      } while(true); 
  }
  
  
  public static char getInput(Scanner in, String a, int b){//Second getInput method. Identical to the first, exept where noted
      char[] charArray = a.toCharArray();
      int nextCharacter = b;//flag set as the int
      do{
          String letter = in.next();
          char character = letter.charAt(0);
       for (int x = 0; x < charArray.length; x++){
          if(charArray[x] == character){
          return character;
          }
      }
      System.out.print("You did not enter a character from the list '" + a +"'; try again-");
      nextCharacter--; // minus 1
      } while(nextCharacter > 0); 
      System.out.println("");
      System.out.println("You failed after " + b + " tries");//error message
      //  bring it back
      return ' ';
  }// end method
  
  
  public static char getInput(Scanner in, String lastString, String a){//Third getInput method
      char[] charArray = a.toCharArray();
      boolean flag = true;
       do{
       System.out.println(lastString);//prints out prompt
       System.out.print("Enter one of:");               //prints out "Enter one of" then each char in s surrounded by ''
       for (int k = 0; k < charArray.length; k++){
           System.out.print("'"+ charArray[k] + "'");
       }//  end do
       
       String letter = in.next();
       char character = letter.charAt(0);
       if (letter.length() == 1){ 
          for (int q = 0; q < charArray.length; q++){
             if(charArray[q] == character){
             return character;
             }//  end if
          }// end for
          System.out.println("You did not enter the right number");
       }//  end if
          else{ //if more than one char is entered
        System.out.println("Enter exactly one number");
        }// end else
        }while(flag);
      //  bring it back
      return ' ';
    }// end method
}// end class


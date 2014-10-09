//  Robert Sullivan
//  CSE2
//  10/9/14




import java.util.Scanner;
public class Enigma2{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/1;
      break;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 *
 * When the code is run originally, it tells you there is a division by 0
 * 
 * I changed the 0 to a 1 and added a break
 * 
 */

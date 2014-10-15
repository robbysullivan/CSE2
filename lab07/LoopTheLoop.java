//  Robert Sullivan
//  CSE2
//  10/10/14

import java.util.Scanner;

public class LoopTheLoop{
public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    while(true){
    System.out.print("Enter an int (1-15):");
    
    int nStars = myScanner.nextInt();
    int i = 1;
    int j = 1;
    while(i <= nStars){
        if(i == nStars){
            System.out.println("*");
            i++;
        }// end if
        else{
            System.out.print("*");
            i++;
        }// end else
    }// end while
    i = 1;
    while(i <= nStars){
        i = 1;
        while(i<= j){
            if(i == j){
            System.out.println("*");
        i++;
            
        }// end if
        
        else{
            System.out.print("*");
        i++;
        }// end else
        
        }// end while
        j++;
    }// end while
        System.out.print("Would you like to continue?");
        String answer = myScanner.next();
        if(answer.equals("Y") || answer.equals("y")){
            
        }// end if
        else{
            break;
            
        }//  end else
    }// end while
    
}// end main method 
}// end class
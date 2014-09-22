//  Robert Sullivan
//  CSE2
//  9/22/14

//  print the time of day

//  compile the program
//      javac TimePadding.java
//  run the program
//      java TimePadding

//  import scanner
import java.util.Scanner;

//  define a class
public class TimePadding{
//  create main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner = new Scanner(System.in);
//  write number of seconds
System.out.print("Enter the time in seconds: ");
//  make sure its an int    
    if(myScanner.hasNextInt()){
       int totalSeconds = myScanner.nextInt();
       if(totalSeconds >= 0){
       int hours = (int) totalSeconds/3600;
        
       int minutes = (int) (totalSeconds/60);
       minutes = ((minutes*60 - hours*3600)/60);
       int seconds = totalSeconds - (hours*3600) - (minutes*60);
       if(minutes > 9 && seconds > 9){    
       System.out.println("The time is "+hours+":"+minutes+":"+seconds);
       }//  end if
       else if(minutes < 10 && seconds > 9){
           System.out.println("The time is "+hours+":0"+minutes+":"+seconds);
       }//  end else if
       else if(minutes > 9 && seconds < 10){
           System.out.println("The time is "+hours+":"+minutes+":0"+seconds);
       }//  end else if
       else{
           System.out.println("The time is "+hours+":0"+minutes+":0"+seconds);
       }//  end else
           
       }//  end if
       else{
           System.out.println("You did not enter a positive number. ");
           return;
       }//  end else
    }// end if
    else{
        System.out.println("You did not enter an int.");
        return;
    }// end else
}// end main method
}// end class
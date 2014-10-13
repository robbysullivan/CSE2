//  Robert Sullivan
//  CSE2
//  10/13/14

//  find the square root of a number
// import scanner
import java.util.Scanner;

//  define class
public class Root{
//  begin main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner = new Scanner(System.in);
//  ask for number
System.out.print("Enter an int:");
    if(myScanner.hasNextInt()){
        double n = myScanner.nextInt();
        int x = 0;
        double low = 0;
        double high = n+1;
        while(x < 100){
            if(((((high-low)*0.5 )+ low))*(((high-low)*0.5+ low)) > n){
               high = (high-low)*0.5 + low; 
            }// end if
            else{
                low = (high-low)*0.5 + low;
            }
            x++;
            System.out.println(high);
        }// end while
        if(high < 0){
            high = -1*high;
        }// end if
        System.out.println(high);
    }// end if
    else{
        System.out.print("Not an int");
        return;
    }// end else
}// end main method
}// end class
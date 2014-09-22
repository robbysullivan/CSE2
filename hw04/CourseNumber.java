//  Robert Sullivan
//  CSE2
//  9/22/14

//  create a program to describe the course number

//  compile the program
//      javac CourseNumber.java
//  run the program
//      java CourseNumber

//  import scanner
import java.util.Scanner;

//  define a class
public class CourseNumber{
//  create main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner = new Scanner(System.in);
//  enter course number
System.out.print("Enter the six digit course number: ");
    if(myScanner.hasNextInt()){
        int course = myScanner.nextInt();
        double year1 = course*.01;
        int year = (int) year1;
        int semester = course-(year*100);
        if(year > 1824 && year < 2015){
            if(semester == 10){
                System.out.println("The course was offered in the Spring semester of "+year);
            }// end if
            else if(semester == 20){
                System.out.println("The course was offered in the Summer 1 semester of "+year);
            }// end else if
            else if(semester == 30){
                System.out.println("The course was offered in the Summer 2 semester of "+year);
            }// end else if
            else if(semester == 40){
                System.out.println("The course was offered in the Fall semester of "+year);
            }// end else if
            else{
                System.out.println(semester+" is not a legitimate semester. ");
                return;
            }// end else
        }// end if
        else{
            System.out.println("The number was outside the range 182510 and 201440. ");
            return;
        }// end else
        
    }// end if
    else{
        System.out.println("You did not enter an int. ");
        return;
    }
}// end main method
}// end class
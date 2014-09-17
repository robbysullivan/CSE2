//  Robert Sullivan
//  CSE02
//  9/14/14

//  Calculate speed and distance of a bike using inputs

//  compile the program
//      javac Bicycle.java
//  run the program
//      java Bicycle

//  import scanner
import java.util.Scanner;

//  define a class
public class Bicycle{
//  main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner= new Scanner(System.in );
//  enter time    
System.out.print("Enter the number of seconds as integer > 0: ");
//  accept user input
    int secsTrip1= myScanner.nextInt();
//  enter distance
System.out.print("Enter the number of counts as integer > 0: ");
//  accept input
    int countsTrip1= myScanner.nextInt();
    double wheelDiameter=27.0,
    PI=3.14159,
    feetPerMile=5280,
    inchesPerFoot=12,
    secondsPerMinute=60,
    minutesPerHour=60;
    double distanceTrip1, minsTrip1, speedTrip1;
    int distance1, decimal1, decimal2, speed1, speed2, speed3;
//  make calculations    
    distanceTrip1= countsTrip1*wheelDiameter*PI;
    distanceTrip1= distanceTrip1/(feetPerMile*inchesPerFoot);
    distance1=(int)distanceTrip1;
    decimal1=(int)(distanceTrip1*10)%10;
    decimal2=(int)(distanceTrip1*100)%10;
    minsTrip1= secsTrip1/secondsPerMinute;
    speedTrip1= distanceTrip1/(minsTrip1/minutesPerHour);
    speed1=(int)speedTrip1;
    speed2=(int)(speedTrip1*10)%10;
    speed3=(int)(speedTrip1*100)%10;
//  print results
System.out.println("The distance was "+distance1+"."+decimal1+decimal2+" and took "+minsTrip1+" minutes.");
System.out.println("The average mph was "+speed1+"."+speed2+speed3);
}// end main method
}// end class
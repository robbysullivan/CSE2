//  Robert Sullivan
//  CSE2
//  9/4/2014
// create a program the measures speed, distance...
// compile the program
//  javac Cyclometer.java
//  run the program
//      java Cyclometer

//  define a class
public class Cyclometer{
// add main method
public static void main(String[] args){
    int secsTrip1=480; // seconds in trip 1
    int secsTrip2=3220; // seconds in trip 2
    int countsTrip1=1561; // rotations of wheel trip 1
    int countsTrip2=9037; // rotations of wheel trip 2
    double wheelDiameter=27.0, // diameter of the wheel
    PI=3.14159, // value of pi
    feetPerMile=5280, // feet per mile
    inchesPerFoot=12, // inches in a foot
    secondsPerMinute=60; // senconds in a minute
    double distanceTrip1, distanceTrip2, totaldistace; // total the distances
    System.out.println("Trip 1 took "+ 
    (secsTrip1/secondsPerMinute)+" minutes and had "+
    countsTrip1+" counts.");
    System.out.println("Trip 2 took "+ 
    (secsTrip2/secondsPerMinute)+" minutes and had "+
    countsTrip2+" counts.");
    distanceTrip1=countsTrip1*wheelDiameter*PI;
// above gives distance in inches
    distanceTrip1/=inchesPerFoot*feetPerMile;
// above gives distance in miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/(inchesPerFoot*feetPerMile);
// calculate total distance
    totaldistace=distanceTrip1+distanceTrip2;
// Print out the input data
    System.out.println("Trip 1 was "+distanceTrip1+" miles.");
    System.out.println("Trip 2 was "+distanceTrip2+" miles.");
    System.out.println("The total disstance was "+totaldistace+" miles.");
} // end main method
} // end class
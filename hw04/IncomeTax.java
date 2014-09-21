//  Robert Sullivan
//  CSE2
//  9/21/14

//  Write a program to determine income tax
//  compile program
//      javac IncomeTax.java
//  run program
//      java IncomeTax

//  import scanner
import java.util.Scanner;
//  create class
public class IncomeTax{
//  define main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner = new Scanner(System.in);
    double tax, taxRate;
//  request income
System.out.print("Enter income (in thousands): ");
  
    //  if statement 
    if(myScanner.hasNextInt()){
    int income = myScanner.nextInt();
//  if statement     
    if(income < 20){
        taxRate = 0.05;
        tax =(double) income*taxRate*1000;
        System.out.println("The tax rate on $"+income+",000 is "+taxRate+"%, and the tax is $"+tax);
        
    } //    end second if
    else if(income < 0){
        System.out.println("You did not enter a value greater then 0!");
        return;
        
    }// end else if
    else if(income >= 20 && income < 40){
        taxRate = 0.07;
        tax = (double) income*taxRate*1000;
        System.out.println("The tax rate on $"+income+",000 is "+taxRate+"%, and the tax is $"+tax);
        
    }// end else if
    else if(income >= 40 && income < 78){
        taxRate = 0.12;
        tax = (double) income*taxRate*1000;
        System.out.println("The tax rate on $"+income+",000 is "+taxRate+"%, and the tax is $"+tax);
        
    }// end else if
    else{
        taxRate = 0.14;
        tax = (double) income*taxRate*1000;
        System.out.println("The tax rate on $"+income+",000 is "+taxRate+"%, and the tax is $"+tax);
        
    }// end else
    }// end first if
    else{
        System.out.println("You did ot enter and integer!");
        return; }// end else
    
}// end main method

}  //   end class
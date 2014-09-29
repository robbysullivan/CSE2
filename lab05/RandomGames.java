//  Robert  Sullivan    
//  CSE02
//  9/25/14

//  write a program with differest casino games

//  compile the program
//      javac RandomGames.java
//  run the program
//      java RandomGames

//  import scanner
import java.util.Scanner;

//  define a class
public class RandomGames{
//  create main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner= new Scanner(System.in);
System.out.print("Enter R or r for roulette, C or c for craps, or P or p for pick a card: ");
    
        String answer=myScanner.next();
        if(answer.equals("R") || answer.equals("r")){
            int roulette = (int)(Math.random()*38+1);
                if(roulette == 37){
                    System.out.println("Roullete 00");
                }// end if
                else{
                    System.out.println("Roullete "+roulette);
                }// end else
        }// end if
        else if(answer.equals("C") || answer.equals("c")){
            int craps1 = (int)(Math.random()*6+1);
            int craps2 = (int)(Math.random()*6+1);
            int crapsTotal = craps1 + craps2;
            System.out.println("Craps: "+craps1+" + "+craps1 +"=" +crapsTotal);
        }// end else if
        else if(answer.equals("P") || answer.equals("p")){
            int suit = (int)(Math.random()*4+1);
            int card = (int)(Math.random()*13+1);
                switch(suit){
                case 1: 
                if(card == 1){
                    System.out.println("A of hearts");
                }// end if
                else if(card == 11){
                    System.out.println("J of hearts");
                }// end else if
                else if(card == 12){
                    System.out.println("Q of hearts");
                }// end else if
                else if(card == 13){
                    System.out.println("K of hearts");
                }// end else if
                else{
                    System.out.println(card+" of hearts");
                }// end else
                break;
                case 2:
                if(card == 1){
                    System.out.println("A of diamonds");
                }// end if
                else if(card == 11){
                    System.out.println("J of diamonds");
                }// end elseif
                else if(card == 12){
                    System.out.println("Q of diamonds");
                }// end else if    
                else if(card == 13){
                    System.out.println("K of diamonds");
                }// end else if
                else{
                    System.out.println(card+ "of diamonds");
                }
                break;
                case 3:
                if(card == 1){
                    System.out.println("A of spades");
                }// end if
                else if(card == 11){
                    System.out.println("J of spades");
                }// end else if
                else if(card == 12){
                    System.out.println("Q of spades");
                }// end else if
                else if(card == 13){
                    System.out.println("K of spades");
                }
                else{
                    System.out.println(card +"of spades");
                }// end else
                break;
                case 4:
                if(card == 1){
                    System.out.println("A of clubs");
                }// end if
                else if(card == 11){
                    System.out.println("J of clubs");
                }// end else if
                else if(card == 12){
                    System.out.println("Q of clubs");
                }// end else if
                else if(card == 13){
                    System.out.println("K of clubs");
                }// end else if
                else{
                   System.out.println(card +"of clubs"); 
                }// end else
                break;
                }// end suit
        }// end else if
        else{
            System.out.println(answer +"is not 'R' 'r' 'C' 'c' 'P' or 'p'");
            return;
        }// end else
}// end main method
}// end class
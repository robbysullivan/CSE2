//  Robert Sullivan
//  CSE2
//  9/29/14

//  Enter a Burger King order

//  compile the program
//      javac BurgerKing.java
//  run the program
//      java BurgerKing

//  import scanner
import java.util.Scanner;

//  define class
public class BurgerKing{
//  create main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner = new Scanner(System.in);
//  prompt user to enter order
System.out.println("Enter a letter to indicate a choice of"); 
System.out.println("Burger (B or b)"); 
System.out.println("Soda (S or s)"); 
System.out.println("Fries (F or f)");
//  record letter
    String answer = myScanner.next();
    if(answer.equals("B") || answer.equals("b")){
     // find toppings   
        System.out.println("Enter A of a for all the fixins");
        System.out.println("Cheese (C or c)");
        System.out.println("None (N or n)");
        String toppings = myScanner.next();
        if(toppings.equals("A") || toppings.equals("a")){
            System.out.println("You ordered a burger with all the fixins.");
        }// end if
        else if(toppings.equals("C") || toppings.equals("c")){
            System.out.println("You ordered a burger with cheese.");
        }// end else if
        else if(toppings.equals("N") || toppings.equals("n")){
            System.out.println("You ordered a plain burger.");
        }// end else if
        else{
            System.out.println("That is not an option.");
        }// end else
    }// end if
    else if(answer.equals("S") || answer.equals("s")){
        System.out.println("Do you want ");
        System.out.println("Pepsi (P or p)");
        System.out.println("Coke (C or c)");
        System.out.println("Sprite (S or s)");
        System.out.println("Mountain Dew (M or m)");
        String soda = myScanner.next();
        if(soda.equals("P") || soda.equals("p")){
           System.out.println("You ordered a pepsi."); 
        }// end if
        else if(soda.equals("C") || soda.equals("c")){
            System.out.println("You ordered a Coke.");
        }// end else if
        else if(soda.equals("S") || soda.equals("s")){
            System.out.println("You ordered a Sprite.");
        }// end else if
        else if(soda.equals("M") || soda.equals("m")){
            System.out.println("You ordered a Mountain Dew.");
        }// end else if
        else{
            System.out.println("That is not an option.");
        }// end else
    }// end else if
    else if(answer.equals("F") || answer.equals("f")){
        System.out.println("Do you want small or large fries ");
        System.out.println("Large (L or l)");
        System.out.println("Small (S or s)");
        String size = myScanner.next();
        if(size.equals("L") || size.equals("l")){
            System.out.println("You ordered large fries.");
        }// end if
        else if(size.equals("S") || size.equals("s")){
            System.out.println("You ordered small fries.");
        }// end else if
        else{
            System.out.println("That is not an otion.");
        }// end else
    }// end else if
    else{
        System.out.println("That is not an option.");
    }// end else

}// end main method
}// end class
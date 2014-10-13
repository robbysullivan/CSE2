//  Robert Sullivan 
//  CSE2
//  10/13/14

//  Write a program to determine the winnings in Roulette

//  define a class
public class Roulette{
//  begin main method
public static void main(String[] args){
    int n = 0;
    int loser = 0;
    int winnings = 0;
    int gain = 0;
    while(n < 1000){
        int bet = (int)(Math.random()*38+1);
        int victory = 0;
        int m = 0;
        
        while(m < 100){
            int outcome = (int)(Math.random()*38+1);
            if(bet == outcome){
                victory++;
                
                m++;
            }// end if
            else{
                m++;
            }// end else
            
        }// end while
        if(victory == 0){
            loser++;
        }// end if
        winnings = winnings + (victory*36);
        if(victory > 2){
            gain++;
        }// end if
        n++;
    }// end while
//  Print results
    System.out.println("You won nothing "+loser+" time(s).");
    System.out.println("Your total winnings were: $"+winnings);
    System.out.println("You profited "+gain+" out of 1000 times.");
}// end main method
}// end class
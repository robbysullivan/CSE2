//  Robert Sullivan
//  cse02
//  11/20/14

//  import scanners
import java.util.Random;
import java.util.Scanner;
//  define class
public class PokerOdds{
  public static void main(String [] arg){
    showHands();
    //simulateOdds();
  }//   end main method
  
  public static void showHands(){
      
      int A[] = new int[52];
      int hand[] = new int[5];
      for(int j=0;j<A.length;j++){
          A[j] = j;
          
      }//   end for
      for(int k=0;k<hand.length;k++){
          hand[k] = -1;
      }//   end for
      for(int l=0;l<hand.length;l++){
          int target = (int)(A.length-l * Math.random());
            hand[l] = target;
            A[51-l] = -1;
        
        }//   end for
        for(int m=0;m<hand.length;m++){
            int suit = 0;
            if(hand[m] <13){
                System.out.println("Clubs: "+hand[m]);
                }
            
            else if(hand[m] > 12 && hand[m] < 26){
                System.out.println("Diamonds: "+hand[m]);
            }
            else if(hand[m] > 25 && hand[m] < 39){
                System.out.println("Hearts "+hand[m]);
            }
            else if(hand[m] > 38){
                System.out.println("Spades "+hand[m]);
            }
        }
        }
        
        
      
  }//   end method



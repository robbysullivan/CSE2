//  robert sullivan
//  cse2
//  12/4/14
//  import scanner
import java.util.Scanner;

//  declare class
public class PokerHands{
    
//  main method
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
        int card = 0;
        int hand[] = new int[52];
        char suit, num, answer;
        for(int j=0;j<5;j++){
        
        System.out.println("Enter the suit: 'c', 'd', 'h', or 's'");
        suit = scan.next().charAt(0);
        //  convert suit to number
        switch(suit){
            case 'c': card = 0; break;
            case 'd': card = 13; break;
            case 'h': card = 26; break;
            case 's': card = 39; break;
            default: System.out.println("You did not enter a valid response"); break;
        }
        
            System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'");
             if(scan.next() == "10"){
                 num = 't';
             }
             else{
             num = scan.next().charAt(0);}
            
        //  find number
         switch(num){
             case 'a': card = card + 0; break;
             case 'k': card = card + 1; break;
             case 'q': card = card + 2; break;
             case 'j': card = card + 3; break;
             case 't': card = card + 4; break;
             case '9': card = card + 5; break;
             case '8': card = card + 6; break;
             case '7': card = card + 7; break;
             case '6': card = card + 8; break;
             case '5': card = card + 9; break;
             case '4': card = card + 10; break;
             case '3': card = card + 11; break;
             case '2': card = card + 12; break;
             default: System.out.println("You did not enter a valid response"); break;
         }
         // save card
         hand[j] = card;
         
        }
        showOneHand(hand);
        findRank(hand);
        System.out.println("Enter 'y' or 'Y' to enter a(nother) hand-");
        answer = scan.next().charAt(0);
   
}
 
 public static void showOneHand(int hand[]){
    String suit[]={"Clubs:    ", "Diamonds: ", "Hearts:   ",              "Spades:   "};
    String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
      "4 ","3 ","2 "};
    String out="";
    for(int s=0;s<4;s++){
      out+=suit[s];
      for(int rank=0;rank<13;rank++)
        for(int card=0;card<5;card++)
         if(hand[card]/13==s && hand[card]%13==rank)
          out+=face[rank];
      out+='\n';
    }
    System.out.println(out);
  }//   end showOneHand
  public static void findRank(int hand[]){
      int flush = 0;
      int counter = 0;
      int pair = 0;
      int total = hand[0] + hand[1] + hand[2] + hand[3] + hand[4];
      for(int j=0;j<5;j++){
          for(int i=j+1;i<5;i++){
              if(hand[j%13] == hand[i%13]){
                  counter++;
                  }
              if(hand[j] < 13 && hand[i] < 13 && hand[j] > 0 && hand[i] > 0){
                  flush++;
              }
              if(hand[j] < 39 && hand[i] < 39 && hand[j] > 25 && hand[i] > 25){
                  flush++;
              }
              if(hand[j] < 26 && hand[i] < 26 && hand[j] > 12 && hand[i] > 12){
                  flush++;
              }
              if(hand[j] < 52 && hand[i] < 52 && hand[j] > 38 && hand[i] > 38){
                  flush++;
              }
          }
      }
      if(flush == 10){
          if(total == 50 || total == 115 || total == 180 || total == 245){
          System.out.println("This is a royal flush");
      }
      else{System.out.println("This is a flush");}
  }
      switch(counter){
          case 0: System.out.println("This is a high card"); break;
          case 1: System.out.println("This is a pair"); break;
          case 2: System.out.println("This is two pair"); break;
          case 3: System.out.println("This is three of a kind"); break;
          case 4: System.out.println("This is a full house"); break;
          case 6: System.out.println("This is four of a kind"); break;
          
      }
  }//   end find Rank
}// end class
//  Robert Sullivan
//  CSE02
//  11/3/14

//  import scanner
import java.util.Scanner;
public class BlockedAgain{
public static void main(String []s){
    
int m;

m = getInt();
// force user to enter int in range 1-9, inclusive.
int a = checkInt(m);
  if(a == 1){
       int b = checkRange(m); 
    if(b == 1){
    allBlocks(m);
    }//  end if
    else{
        System.out.println("You did not enter an int in [1,9]; try again");
    }// end else
    }// end if
    else{
      System.out.println("You did not enter an int; try again:");
    }// end else




}// end main method
//  get int
public static int getInt(){
    Scanner scan = new Scanner(System.in);
   System.out.print("Enter an int (1-9):");
   int m = scan.nextInt();
   return m;
}// end method
 //   check if its a number
   public static int checkInt(int a){
     
        if(a < 10000){
             
            return 1;
        }// end if
        else{
            return 0;
        }// end else
    }   //  end method
     //  check if its in range
    public static int checkRange(int b){
       
        //  return true
        if(b < 10 && b > 0){
            return 1;
        }// end if
        else{
            return 0;
        }// end else
    }   //  end method 

public static int allBlocks(int x){
    
    int i = 1;
    for(i=1;i<=x; i++){
                int columbs = 2*i-1;
                int rows = i;
                int k = 0;
                for(k=0;k<=rows;k++){
                    if(k == rows){
                      int j = 1;
                      for(j=1;j<=columbs; j++){
                          if(j == columbs){
                              System.out.println("-");
                          }//   end if
                          else{
                              System.out.print("-");
                          }//   end else
                      }//   end for 3
                    }// end if
                else{
                int j = 1;
                        for(j=1;j<=columbs; j++){
                        if(j == columbs){
                        System.out.println(i);
                        }// end if
                        else{
                        System.out.print(i);
                        }// end else
                        }// end for 3
                
                }// end else
                }// end for 2
                
            }// end for 1
    return 2;
}// end method


    
}// end class
//  Robert Sullivan
//  CSE2
//  10/20/14

//  replace loops

import java.util.Scanner;
//  define class
public class MoreLoops{
    public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0;

    do{
    System.out.print("Enter an int- ");
//  check int   
    if(!scan.hasNextInt()){
        scan.next(); //get rid of the junk entered by user
        System.out.print("You did not enter an int; try again- ");}
    }while(!scan.hasNextInt());
   //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
    //DO-WHILE LOOP
        n=scan.nextInt();
    int j = 1;
    while(j<=n){
        int k = 0;
        while(k<j){
        System.out.print('*');
        k++;
        }
        System.out.println();
        j++;
    }
    //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
    //WHILE STATEMENTS
      
    int k=4;

    while(k<=4){
        System.out.println("k="+k);
        k++;
    }
         
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
    //WITH A WHILE LOOP

        int count=0;
        for(count=0;count<10;count++){
        switch(n){
        default: System.out.println(n + " is > 5 or <1");
        break;
        case 1:
        case 2: System.out.print("Case 2 ");
        continue;
        case 3: break;
        case 4: System.out.println("Case 4");
        case 5: System.out.println("Case 5");
        break;
        }
        
        if(count>10)
        break;
    }
    //COMMENT OUT THE ABOVE 21 LINES AND REWRITE THE CODE USING
    // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
    //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
    //   -5, 1, 20, 5, ETC.
    //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
    //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }// end method
}// end class
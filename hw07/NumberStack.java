//  Robert Sullivan
//  CSE2
//  10/20/14

//  print out correct sequence

//  compile the program
//      javac NumberStack.java
//  run the program
//      java NumberStack

import java.util.Scanner;

//  define a class
public class NumberStack{
//  begin main method
public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
//  request the number 
System.out.print("Enter an int (1-9):");
    if(myScanner.hasNextInt()){
        int number = myScanner.nextInt();
        if(number > 0 && number <10){
            int i = 1;
            System.out.println("Using for loops:");
            for(i=1;i<=number; i++){
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
            System.out.println("Using while loops:");
            i = 1;
            while(i<=number){
                int j = 0;
                int rows = i;
                int columbs = 2*i-1;
                while(j<=rows){
                    int k = 1;
                    if(j == rows){
                        while(k<=columbs){
                            if(k==columbs){
                                System.out.println("-");
                            }// end if
                            else{
                                System.out.print("-");
                                
                            }// end else
                            k++;
                        }// end while 3
                    }// end if
                    else{    
                        while(k<=columbs){
                            if(k==columbs){
                                System.out.println(i);
                            }// end if
                            else{
                                System.out.print(i);
                            }// end else
                      k++;  
                    }// end while 3
                    }// end else
                    j++;
                }// end while 2
                i++;
            }// end while 1
            System.out.println("Using do while loops:");
            i = 1;
            do{
                int j = 0;
                int rows = i;
                int columbs = 2*i-1;
                do{
                    int k = 1;
                    if(j == rows){
                        do{
                            if(k==columbs){
                                System.out.println("-");
                            }// end if
                            else{
                                System.out.print("-");
                                
                            }// end else
                            k++;
                        }while(k<=columbs);// end do while 3
                    }// end if
                    else{    
                        do{
                            if(k==columbs){
                                System.out.println(i);
                            }// end if
                            else{
                                System.out.print(i);
                            }// end else
                      k++;  
                    }while(k<=columbs);// end do while 3
                    }// end else
                    j++;
                }while(j<=rows);// end do while 2
                i++;
            }while(i<=number);// end do while 1
        }// end if
        else{
            System.out.println("Wrong number!!");
            return;
        }// end else
        }// end if
    else{
        System.out.println("Not a number between 1 and 9");
        return;
    }// end else
}// end main method
}//  end class
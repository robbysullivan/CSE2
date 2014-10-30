//  Robert Sullivan
//  CSE2
//  10/20/14

//  import scanner
import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("Enter three ints");
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
    
    if(a>b){
    System.out.println("The larger of "+a+" and "+b+" is "+a);
      if(a>c){
         System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+a);
        if(b>c){
            System.out.println("It is "+c+b+a+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
        }
        else{
            System.out.println("It is "+b+c+a+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
        }
      }
      else{
          System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+c);
                       
        System.out.println("It is "+b+a+c+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");               
      }
    }
    
    else{
    System.out.println("The larger of "+a+" and "+b+" is "+b);
        if(b>c){
            System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+b);
            if(a>c){
            System.out.println("It is "+c+a+b+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
        }
        else{
            System.out.println("It is "+a+c+b+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
        }           
        }
        else{
            System.out.println("The larger of "+a+", "+b+", and "+c+
                       " is "+c);
           
            System.out.println("It is "+a+b+c+" that "+a+", "+b+
                       ", and "+c+" are in ascending order");
        
        }
    }
    
    
    
  }//   end method
  
  
}// end class
 
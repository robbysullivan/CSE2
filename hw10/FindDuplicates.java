//  Robert Sullivan
//  CSE02
//  11/18/14

//  import scanner
import java.util.Scanner;
//  define class
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    //  create array num
    int num[]=new int[10];
    //  create string answer
    String answer="";
    
    do{
      System.out.print("Enter 10 ints- ");
      //    save numbers in array
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }//   end string
  public static boolean hasDups(int num[]){
      int counter = 0;
      //    look for a match
      for(int j=0;j<9;j++){
          for(int k=j+1;k<=9;k++){
              if(num[j] == num[k] ){
              counter = counter + 1;
              }
              else{continue;}
          }
      }
              if(counter == 0){
                  return false;
              }
              else{
          return true;
      }
  }//   end boolean
  
  public static boolean exactlyOneDup(int num[]){
      //    count how many doubles
      int counter = 0;
      for(int j=0;j<=8;j++){
          for(int k=j+1;k<=9;k++){
              if(num[j] == num[k] ){
              counter = counter + 1;
              }
              else{continue;}
          }
      }
      if(counter > 1){
          return false;
          
      }
      else{
          return true;
      }
  }//   end boolean
}// end class

//  Robert Sullivan
//  cse2
import java.util.Scanner;

public class Arrays{

public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter 10 ints: ");
    int A[] = new int[10];
    for(int j=0;j<10;j++){
        A[j] = scan.nextInt();
    }
    
    int min = 10000;
    int max = -10000;
    for(int j=0;j<10;j++){
        if(A[j] < min){
            min = A[j];
        }
        if(A[j] > max){
            max = A[j];
        }
        
    }
    System.out.println("The lowest entry is: "+min);
    System.out.println("The highest entry is: "+max);
    int sum = 0;
    for(int j=0;j<10;j++){
        sum = sum + A[j];
    }
    System.out.println("The sum is: "+ sum);
    for(int j=0;j<10;j++){
        System.out.print(" "+A[j]+"  "+A[9-j]);
        System.out.println("");
    }
}
}
import java.util.Scanner;
public class WelcomeClass{
    
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int A[] = new int[10];
    for(int j=0;j<10;j++){
        System.out.println("Int:");
        A[j] = scan.nextInt();
    }
    int min = A[0];
    int max = A[0];
    for(int b: A){
        if(A[b] < min){
            min = A[b];
        }
        else{continue;}
        if(A[b] > max){
            max = A[b];
        }
        else{continue;}
    }
System.out.println("Min: "+min+" Max: "+max);
}

}

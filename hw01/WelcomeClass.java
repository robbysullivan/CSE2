public class WelcomeClass{
    
public static void main(String[] args){
int j = 1;
int counter = 1;
for(int i=1;i<=8;i++){
    
    if(i%j == 0){
        
        for(int k=1;k<=counter;k++){
           for(int l=1;l<=k;l++){
               if(k==l){
                   System.out.println(i);
               }
               else{
                   System.out.print(i);
               }
           } 
        }
    
        j = i;
        
        counter++;
    }
    else{continue;}
}

}

}

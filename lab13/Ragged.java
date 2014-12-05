//  Robby Sullivan

public class Ragged{
    
    public static void main(String[] args){
        
        int[][] myArray = new int[5][];
        
        for(int j = 0; j < myArray.length; j++){
            myArray[j] = new int[j*3+5];
        }
        
        for(int row = 0; row < myArray.length; row++){
            
            for(int column = 0; column < myArray[row].length; column++){
                
                myArray[row][column] = (int)(Math.random()*39);
            }
        }
        System.out.println("Array before sorting");
        
        for(int row = 0; row < myArray.length; row++){
            
            for(int column = 0; column < myArray[row].length; column++){
                
                System.out.print(myArray[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        for(int row = 0; row < myArray.length; row++){
            
            for(int m = 0; m < myArray[row].length-1; m++){
                int minValue = myArray[row][m];
                int minIndex = m;
                for(int n = m + 1; n < myArray[row].length; n++){
                    
                    if(minValue > myArray[row][n]){
                        minValue = myArray[row][n];
                        minIndex = n;
                    }
                }
                
                if(minIndex != m){
                    
                    myArray[row][minIndex] = myArray[row][m];
                    myArray[row][m] = minValue;
                }
                
            }
            
        }
        System.out.println("Array after sorting");
        
         for(int row = 0; row < myArray.length; row++){
            
            for(int column = 0; column < myArray[row].length; column++){
                
                System.out.print(myArray[row][column] + " ");
            }
            System.out.println();
        }
    }
}

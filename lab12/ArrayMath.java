//  Robby Sullivan

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14, 0, 0, 0},
      w[]={2.3, 13, 14, 12, 0, 0}, 
      v[],
      u[]={2.3, 12, 14, 0, 0, 0};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static boolean equals(double x[], double y[]){
      int counter = 0;
      for(int j=0; j<x.length;j++){
          if(x[j] == y[j]){
              counter++;
          }
      }
      if(counter == x.length){
          return true;
      }
      else{
          return false;
      }
  }
  public static double[] addArrays(double a[], double b[]){
      double v[] = new double[6];
      for(int j=0;j<a.length;j++){
          v[j] = a[j] + b[j];
      }
      return v;
  }
}

import java.util.Scanner;
public class QuadEqn{
  
  public static double root(int a, int b,int c ){
    double determinant=(int) Math.sqrt(b*b-4*a*c);
    double r=(-b+determinant)/(2.0*a);
    return r;
  }
  public static void main(String [] args){
    
Scanner sc=new Scanner(System.in);
 int a,b,c;
 a=sc.nextInt();
 b=sc.nextInt();
 c=sc.nextInt();
    
   String quadEq=a+"x^2+"+b+"x+"+c;
   System.out.println(quadEq);
   
   
   System.out.println(root(a,b,c));
   sc.close();
     
  }
}
import java.util.Scanner;
public class task5{
  public static void main(String [] args){
    
   System.out.println(power(6,3));//m^n
  }
  public static int power(int m,int n){
    if(n==0){
     return 1;
    }
    else{     
     return m*power(m,n-1);
    }
  }
}
import java.util.Scanner;
public class task4{
  public static void main(String [] args){
   bConverter(18);
  }
  public static void bConverter(int n){
    if(n==0){
   
    }else{
     bConverter(n/2);
     System.out.print(n%2);
    }
    
  }
}

import java.util.Scanner;
public class task2{
  public static void main(String [] args){
   System.out.println(fib(8));
  }
  public static int fib(int n){
    if(n>=3){
     return fib(n-1)+fib(n-2);
    }
    else{
      if(n==2){
      return 1;
       }
      else if(n==1){
       return 0;
      }
      else{
       return -5;//dummy return 
      }
    }
}
}

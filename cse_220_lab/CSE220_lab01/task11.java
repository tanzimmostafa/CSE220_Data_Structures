import java.util.Scanner;
public class task11{
  static boolean flag=false;//static variable
  public static boolean allDigitsOdd(int num){
    int remainder;
    while(num>0){
     remainder=num%10;
     if(remainder%2==0){
      flag=true;
     }
     else{
      flag=false;
     }
     if(flag==true){
      break;
     }
     num=num/10;   
    }
    if(flag==true){
     return false;
    }
    else{
     return true;
    }
  }
  public static void main(String [] args){
   System.out.println(allDigitsOdd(135319));
   System.out.println(allDigitsOdd(9145293)); 
   System.out.println(allDigitsOdd(614)); 
  }
}
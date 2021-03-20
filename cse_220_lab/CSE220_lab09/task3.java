import java.util.Scanner;
public class task3{
  public static void main(String [] args){
    int [] a={1,2,3,15,77,88,-2};
   printA(a,a.length-1);
  }
  public static void printA(int [] a,int r){
    if(r==0){
     System.out.println(a[r]);
    }
    else{     
     printA(a,r-1);
     System.out.println(a[r]);
    }
  }
}
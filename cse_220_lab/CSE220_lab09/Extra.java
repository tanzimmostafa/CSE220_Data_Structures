import java.util.Scanner;
public class Extra{
  public static void main(String [] args){
    int [] a={1,2,3};
   System.out.println(printA(a,0));
  }
  public static int printA(int [] a,int l){
    if(l<=a.length-2){
     return a[l]+ printA(a,l+1);
    }
    else{
     return a[l];
    }
  }
}
    
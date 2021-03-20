import java.util.Scanner;
public class task1{
  
  public static void firstLast6(int [] b){   
    for(int i=0;i<b.length-1;i++){
      if(b[0]==6 || b[b.length-1]==6){
       System.out.println("true");
       break;
      }
    }
  }  
   public static void main(String args[]){
     int a[]={6,1,2,3};
     firstLast6(a);
   }
}
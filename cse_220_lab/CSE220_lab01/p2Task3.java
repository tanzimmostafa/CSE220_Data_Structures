import java.util.Scanner;
public class p2Task3{
    public static void main(String[]args){
      try{  
      Scanner sc=new Scanner(System.in);
        int x,n=sc.nextInt();
        int a[]=new int[n];
        a[5]=99;
        x=n/0;
      }
      catch(ArithmeticException a){
       System.out.println("Don't divide by zero");
      }
      catch(ArrayIndexOutOfBoundsException b){
       System.out.println("Give length of array more than 5!! ");     
      }
      finally{
       System.out.println("THE END");
      }
    }
}

      
      
      
      
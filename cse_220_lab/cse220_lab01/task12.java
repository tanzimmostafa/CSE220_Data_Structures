import java.util.Scanner;
public class task12{
  public static boolean before(int m1,int d1,int m2,int d2){
    if(m1<m2){
    return true;
    }
    else if(m1==m2 && d1<d2){
     return true;
    }
    else{
     return false;
    }
  }
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  
  int a,b,c,d;
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  d=sc.nextInt();
  
 System.out.println(before(a,b,c,d));
  
  }
}
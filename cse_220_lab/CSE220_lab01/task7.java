import java.util.Scanner;
public class task7{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int [] a=new int[10];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Enter another number between 0-9");
    int input=sc.nextInt();
    
    for(int i=1;i<=a[input];i++){
      if(i==a[input]){
      System.out.println("*");
      }
      else{
      System.out.print("*");
      }
    }
  }
}
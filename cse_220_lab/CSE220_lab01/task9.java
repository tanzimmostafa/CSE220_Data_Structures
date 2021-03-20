import java.util.Scanner;
public class task9{
  public static void display(int [] arrayName,int size){
    for(int i=0;i<size;i++){
     System.out.println(arrayName[i]);
    }
  }
  public static void square(int [] arrayName,int size){
    for(int i=0;i<size;i++){
      arrayName[i]=arrayName[i]*arrayName[i];
    }
  }
  public static void main(String [] args){
   Scanner sc=new Scanner(System.in);
   int [] a=new int[10];
   for(int i=0;i<10;i++){
    a[i]=sc.nextInt();
   }
   display(a,10);
   square(a,10);
   display(a,10);
  }
  }

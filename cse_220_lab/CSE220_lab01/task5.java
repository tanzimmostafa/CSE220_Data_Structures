import java.util.Scanner;
public class task5{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int [] a=new int[10];
    for(int i=0;i<15;i++){
      a[sc.nextInt()]++;
    }
    System.out.println("0 was found "+a[0]+" times");
    System.out.println("1 was found "+a[1]+" times");
    System.out.println("2 was found "+a[2]+" times");
    System.out.println("3 was found "+a[3]+" times");
    System.out.println("4 was found "+a[4]+" times");
    System.out.println("5 was found "+a[5]+" times");
    System.out.println("6 was found "+a[6]+" times");
    System.out.println("7 was found "+a[7]+" times");
    System.out.println("8 was found "+a[8]+" times");
    System.out.println("9 was found "+a[9]+" times");
  }
}
    
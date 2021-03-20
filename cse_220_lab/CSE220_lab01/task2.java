import java.util.Scanner;
public class task2{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int [] a=new int[10];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    int min=a[0];
    int minpos=0;//minimum position
    for(int i=0;i<a.length;i++){     
      if(a[i]<min){
        min=a[i];
        minpos=i;
      }
    }
    int max=a[0];
    int maxpos=0;
    for(int i=0;i<a.length;i++){    
      if(a[i]>max){
        max=a[i];
        maxpos=i;
      }
    }
    int temp=0;
    temp=a[minpos];
    a[minpos]=a[maxpos];
    a[maxpos]=temp;
    
    
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}

    
import java.util.Scanner;
public class task3{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int [] a=new int[5];
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
      int maxIndex=i;
      for(int j=i+1;j<a.length;j++){
        if(a[j]>a[maxIndex]){
          maxIndex=j;
        }
      }
      if(maxIndex!=i){
        int temp;
        temp=a[i];
        a[i]=a[maxIndex];
        a[maxIndex]=temp;
      }
    }
    for(int i=0;i<a.length;i++){
     System.out.println(a[i]);
    }
    for(int i=0;i<a.length;i++){
      if(a[i]%2==0){
      System.out.println(a[i]);
      }
    }
      
  }
}
        
           
      
  
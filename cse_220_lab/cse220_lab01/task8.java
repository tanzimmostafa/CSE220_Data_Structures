import java.util.Scanner;
public class task8{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of 2 matrices");
    int input=sc.nextInt();
    
    int [] a=new int[input];
    int [] b=new int[input];
    
    for(int i=0;i<a.length;i++){
     a[i]=sc.nextInt();
    }
    for(int j=0;j<b.length;j++){
     b[j]=sc.nextInt();
    }
    int [] c=new int[input];
    for(int i=0;i<c.length;i++){
     c[i]=5*a[i]-b[i];
    }
    for(int i=0;i<c.length;i++){
      System.out.println(c[i]);
    }
  }
}
    
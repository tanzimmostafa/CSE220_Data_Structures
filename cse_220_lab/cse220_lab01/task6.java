import java.util.Scanner;
public class task6{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int [] a={5,4,3,2,3,4,5};
    
    boolean flag=true;
    for(int i=0;i<a.length;i++){
      
      if(a[i]!=a[a.length-1-i]){
       flag=false;
      }
    }
    if(flag==true){
     System.out.println("array is a palindrome");
    }
    else{
     System.out.println("array is not a palindrome");
    }
  }
}
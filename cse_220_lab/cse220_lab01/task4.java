import java.util.Scanner;
public class task4{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int [] a=new int[10];
    a[0]=sc.nextInt();
   
    for(int i=1;i<a.length;i++){
      int b=0;
      boolean flag=true;
      b=sc.nextInt();
      for(int j=0;j<a.length;j++){
        
        if(a[j]==b){
        flag=false;
        break;
        }
      }
      if(flag==false){
      System.out.println(b+" has already been entered!Enter new number");
      i--;
      }
      else{
      a[i]=b;
      }
      
    }
  }
}
    
    
    
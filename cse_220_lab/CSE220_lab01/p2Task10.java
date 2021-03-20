import java.util.Scanner;
public class p2Task10{
  public static int[] arrayLeftR(int [] a,int num){
    int index=num-1;
    int [] array1=new int[num];//array to be shifted
    for(int i=0;i<num;i++){
      array1[i]=a[i];
    }
    int count=0;
    int [] array2=new int[a.length-num];//rest of the array
    for(int i=num;i<a.length;i++){
      array2[count]=a[i];
      count++;
    }
    int [] array3=new int[a.length];//rotated array
    for(int i=0;i<array2.length;i++){
      array3[i]=array2[i];
    }
    int count2=0;
    for(int i=a.length-num;i<array3.length;i++){
      array3[i]=array1[count2];
      count2++;
    }
    return array3;
    
  }
  /////////////////////////
  public static int[] arrayRightR(int [] a,int num){
    int index=num-1;
    int [] array1=new int[num];//array to be shifted
    int count1=0;
    for(int i=a.length-num;i<=a.length-1;i++){
      array1[count1]=a[i];
      count1++;
    }
   
    int [] array2=new int[a.length-num];//rest of the array
    for(int i=0;i<a.length-num;i++){
      array2[i]=a[i];
     
    }
    int [] array3=new int[a.length];//rotated array
    for(int i=0;i<array1.length;i++){//1st part
      array3[i]=array1[i];
    }
    int count2=0;
    for(int i=num;i<array3.length;i++){//second part
      array3[i]=array2[count2];
      count2++;
    }
    return array3;
    
  }
 /////////////////// 
  
  
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int [] a={1,4,8,16,25,36,49,64,81,100}; 
    int input=sc.nextInt();
    a=arrayLeftR(a,input);
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
//      int [] b={1,2,3,4,5,6,7,8,9,10};
//      int input=sc.nextInt();
//    b=arrayLeftR(b,input);
//    for(int i=0;i<b.length;i++){
//      System.out.print(b[i]+" ");
//      System.out.println();
//    }
    ///////
     int [] c={1,4,8,16,25,36,49,64,81,100}; 
    int input2=sc.nextInt();
    c=arrayRightR(c,input2);
    for(int i=0;i<c.length;i++){
      System.out.print(c[i]+" ");
    }   
  System.out.println();  
    
//    int [] c={1,2,3,4,5,6,7,8,9,10}; 
//    int input2=sc.nextInt();
//    c=arrayRightR(c,input2);
//    for(int i=0;i<c.length;i++){
//      System.out.print(c[i]+" ");
//    }   
//  System.out.println();  
//    
    
    
    
  }
}

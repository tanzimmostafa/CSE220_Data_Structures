import java.util.Scanner;
public class tester1{
  public static void main(String [] args){
  Scanner sc=new Scanner(System.in);
  BookRecords1 b=new BookRecords1();
  String a="";
 
  int x=0;
  
  while (x!=5){
    System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record");   
      x = sc.nextInt();
      switch(x){
        
        case 1 :  
          b.AddRecord();
          System.out.println("Do you want to continue the program?");
          System.out.println("Press y for yes or anthing else for no");
          a=sc.next();
          if(!a.equals("y")){
          x=5;
          }
          break;
          
        case 2 : 
          b.PrintRecord();
          System.out.println("Do you want to continue the program?");
          System.out.println("Press y for yes or anthing else for no");
          a=sc.next();
          if(!a.equals("y")){
          x=5;
          }
          break;
          
        case 3:
          b.DeleteRecord();
          System.out.println("Do you want to continue the program?");
          System.out.println("Press y for yes or anthing else for no");
          a=sc.next();
          if(!a.equals("y")){
          x=5;
          }
          break;
          
        case 4:
          b.EditRecord();
          System.out.println("Do you want to continue the program?");
          System.out.println("Press y for yes or anthing else for no");
          a=sc.next();
          if(!a.equals("y")){
          x=5;
          }
          break;
              
        default :
          System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record");
          
      }
  }
  
  }
}

  
  


  

  

  
import java.util.Scanner;
public class Testerr{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    MyOrderList a=new MyOrderList();
    
    System.out.println("Enter 1 to use insert(Node newElement)\n 2 to retrieve(int searchKey)\n"+
                        " 3 to remove()\n 4 to remove(int deleteKey)\n"+
                         " 5 to  clear()\n 6 to boolean isEmpty()\n"+
                          " 7 to gotoBeginning()\n 8 to gotoEnd()\n"+
                          " 9 to gotoNext()\n 10 to gotoPrior()\n"+
                          " 11 getCursor()\n 12 to showList()\n"+" 13 to exit"); 
    Boolean flag=false;
    for(;;){   
              
         int choice=sc.nextInt();
         switch(choice){
           case 1:
             System.out.println("Enter element to be inserted");
             int temp=sc.nextInt();
             Node mn=new Node(temp,null);
             a.insert(mn);
             break;
             
           case 2:
             System.out.println("Enter searchKey");
             int temp2=sc.nextInt();
             System.out.println(a.retrieve(temp2));
             break;
                                
           case 3:
             System.out.println(a.remove());
             break;
           
           case 4:
             System.out.println("Enter deleteKey");
             int temp1=sc.nextInt();
             System.out.println(a.remove(temp1));
             break;
             
           case 5:
             a.clear();
             break;
             
           case 6:
             System.out.println(a.isEmpty());
             break;
             
           case 7:
             System.out.println(a.gotoBeginning());
             break;     
             
           case 8:
             System.out.println(a.gotoEnd());
             break;
             
           case 9:
             System.out.println(a.gotoNext());
             break;
             
           case 10:
             System.out.println(a.gotoPrior());
             break;
             
           case 11:
             System.out.println(a.getCursor());
             break;
             
           case 12:
             a.showList();
             break; 
             
           case 13:
             flag=true; 
  }
         if(flag==true){
          break;
         }
         System.out.println("Enter choice again");
    }
    
  }
}
    

  
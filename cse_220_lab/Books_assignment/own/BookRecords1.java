import java.util.Scanner;
public class BookRecords1{
  Scanner sc=new Scanner(System.in);
  
  Book1 [] arr=new Book1[5];
  
  public static int id=0;
  public int size=0;
  
  public void AddRecord(){
  System.out.println("Give name of book");
  String n=sc.nextLine();
  
  System.out.println("Give Author");
  String a=sc.nextLine();
  
  System.out.println("Give name of Publisher");
  String p=sc.nextLine();
  
  id=++id;
  Book1 b=new Book1(n,a,p,id);
  
  if(size<arr.length){
  arr[size++]=b;
  }
  else{
  resize();
  arr[size++]=b;
  }
  System.out.println("Added");
  }
  ///
  public void resize(){
    Book1 [] newArr=new Book1[arr.length+1];
   
    for(int i=0;i<arr.length;i++){
    newArr[i]=arr[i];
   }
    arr=newArr; 
  }
  ///////////////////////
  public void PrintRecord(){
   Book1 [] nA=new Book1[size];//newArray
  
   for(int i=0;i<size;i++){
   nA[i]=arr[i];
  }
   
   if(size>=2){
    
  for(int i=0;i<nA.length-1;i++){
    for(int j=0;j<nA.length-1-i;j++){
      Book1 a=nA[j];
      Book1 b=nA[j+1];
      if(a.Name.compareTo(b.Name)>0){
      Book1 swap=nA[j];
      nA[j]=nA[j+1];
      nA[j+1]=swap;
      }
    }
  }
    for(int i=0;i<nA.length-1;i++){//if name equal sort
      //acc to id
      for(int j=0;j<nA.length-1-i;j++){
      Book1 a=nA[j];
      Book1 b=nA[j+1];
      if(a.Name.compareTo(b.Name)==0){
        if(a.id>b.id){
         Book1 swap=nA[j];
         nA[j]=nA[j+1];
         nA[j+1]=swap;
        }     
      }
    }
  }
    }
  //now just print
    for(int i=0;i<nA.length;i++){
    System.out.println(nA[i]);
    System.out.println("--------");
    }
  
  }
  
  ///////////////////
  
  public void DeleteRecord(){
   System.out.println("Enter id of book to be deleted");
   int IDD=sc.nextInt();
   
   int index=-1;
   for(int i=0;i<size;i++){
     if(arr[i].id==IDD){
      index=i;
     }
   }
   
   if(index!=-1){ 
    System.out.println("ID "+arr[index].id+" has been deleted");
    arr[index]=null;//not needed
    
    for(int i=index;i<size-1;i++){
     arr[index]=arr[index+1];
    }
    arr[size-1]=null;
    size--;
      
   }else{
    System.out.println("ID "+IDD+" doesnot exist");
   }
  }
  //////////////
  
  public void EditRecord(){
   System.out.println("Enter id of book to be edited");
   int ID=sc.nextInt();
   int check=-1;
   for(int i=0;i<size;i++){
     if(arr[i].id==ID){
      check=i;
     }
   }
   
   if(check!=-1){
     System.out.println("What do you want to change?");
     System.out.println("Enter: 1-Name/2-Author/3-Publisher/4-Exit"); 
     
     int x=0;
     while(x!=4){
       x=sc.nextInt();
       
       switch(x){
         case 1:
           System.out.println("Enter new name");
           String y=sc.nextLine();
           arr[check].Name=y;
           
         case 2:  
          System.out.println("Change Author:");
          arr[check].Author = sc.nextLine();
          System.out.println("Change again: \n1.Name 2.Author 3.Publisher 4.Exit");
          break;
          
        case 3:
          System.out.println("Change Publisher:");
          arr[check].Publisher = sc.nextLine();
          System.out.println("Change Again: \n1.Name 2.Author 3.Publisher 4.Exit");
          break; 
        
         case 4:
           break;
          
         default:
           System.out.println("Try Again");
           System.out.println("Enter: 1-Name/2-Author/3-Publisher/4-Exit"); 
       }
       
     }
   }
    else{
    System.out.println("ID "+ID+" doesnot exist");
   }
  }
  /////////////
}
  
  
  
  
  
  
  
  
  
  
  
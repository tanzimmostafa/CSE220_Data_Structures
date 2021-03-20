import java.util.Scanner;
public class WRM1{
  Scanner sc=new Scanner(System.in);
  ArrayQueue q;
  int id=0;
  public WRM1(){
   q=new ArrayQueue();
  }
  
  public void RegisterPatient(){
   id=++id;
   System.out.println("name?");
   String n=sc.next();
   System.out.println("age?");
   int a=sc.nextInt();
   System.out.println("blood group?");
   String bl=sc.next();
   Patient1 p=new Patient1(n,a,bl,id);
   try{
   q.enqueue(p);
   System.out.println("success");
   }
   catch(QueueOverflowException o){
     System.out.println("failed/No Space"+o);
   } 
  }
  ////////////////
  
  public void ServePatient(){
    try{
      Patient1 ab=(Patient1) q.dequeue();
      System.out.println(ab.name +"is served");
    }catch(QueueUnderflowException o){
     System.out.println("failed/no patient left"+o);
    }
  }
  /////////
  
  public void CancelAll(){
    if(q.isEmpty()){
     System.out.println("Already empty");
    }
    else{
    System.out.println("Success");
    }
    for(int i=0;i<q.size();i++){
      try{
      q.dequeue();
      }
      catch(QueueUnderflowException o){
     System.out.println("failed"+o);
    }
    }
  }
  /////////////
  
  public void CanDoctorGoHome(){
      if(q.isEmpty()){
     System.out.println("yes!!!");
      }else{
     System.out.println("NO!");
     }
  }
  ////////
  public void ShowAllPatient(){
   Object [] temp=q.toArray();
   
   for(int i=0;i<temp.length-1;i++){
     for(int j=0;j<temp.length-1-i;j++){
       Patient1 a=(Patient1) temp[j];
       Patient1 b=(Patient1) temp[j+1];
       
       if(a.name.compareTo(b.name)>0){
        Object swap=temp[j];
        temp[j]=temp[j+1];
        temp[j+1]=swap;       
       }
     }
   }
   if(q.isEmpty()){
    System.out.println("No patient is here");
   }
   else{
   for(int i=0;i<temp.length;i++){
   System.out.println(temp[i]);
   }
  }
  }
  /////////////
     
   
  
  
  }
  
    
  
  
  
  
  
  
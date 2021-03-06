import java.util.Scanner;
public class WRM{
  Scanner sc=new Scanner(System.in);
  Queue q;
  public static int id=99;
  public WRM(){
    q=new ListQueue();
  }
  
  public void RegisterPatient(){
    id++;
    System.out.println("enter name");
    String n = sc.next();
    System.out.println("enter age");
    int a = sc.nextInt();
    System.out.println("enter blood group");
    String b = sc.next();
    Patient p = new Patient (n , a, b, id); 
    try{
      q.enqueue(p);
      System.out.println(p.name+" Success");
    }
    catch(QueueOverflowException e){
      System.out.println("Not Successful\n"+e);
    }   
  }
 ///// 
  
  public void ServePatient(){
    try{
      Patient x = (Patient) q.dequeue();
      System.out.println(x.name+" has been served");
    }
    catch(QueueUnderflowException e){
      System.out.println("No Appointment");
    }
  }
 /////
  
  public void CancelAll(){
    if(q.size()>0){
      System.out.println("Success");
    }
    for(int i = 0 ; i<=q.size() ; i++){
      try{
        q.dequeue();
      }
      
      catch (QueueUnderflowException e){
        System.out.println("No Appointment");
      }
      
  }
  }
/////
  
  public void CanDoctorGoHome(){
    if(q.isEmpty()){
      System.out.println("Yes!");
    }
    else{
      System.out.println("No!");
    }
  }
 /////
  
  public void ShowAllPatient(){
    Object [] temp = q.toArray();
    
    for(int i = 0 ; i<q.size() ; i++){
      for(int j = i+1 ; j<q.size() ; j++){
        Patient a = (Patient) temp[i];
        Patient b = (Patient) temp[j];
        if(a.name.compareTo(b.name)>0){
          Object swap = temp[i];
          temp[i] = temp[j];
          temp[j] = swap;
        }
      }
    }
    if(q.size()==0){
      System.out.println("No Appointment");
    }
    else{
      for(int i = 0 ; i<temp.length ; i++){
        System.out.println(temp[i]);
      }
    }
  }
  /////
}
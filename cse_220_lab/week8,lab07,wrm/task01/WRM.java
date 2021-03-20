import java.util.Scanner;
public class WRM{
  Scanner sc = new Scanner (System.in);
  ArrayQueue q;
  public static int id = 15;
  public WRM(){
    q = new ArrayQueue();
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
      System.out.println("No patient left");
    }
  }
  /////
  public void CancelAll() throws QueueUnderflowException{
    if(q.size()>0){
      System.out.println("Success");
    }
   else if(q.size()==0){//bo
    System.out.println("Already No Appointment ");
    }//
    for(int i = 0 ; i<q.size() ; i++){
    //  try{
        q.dequeue();
   //   }
      
    //  catch (QueueUnderflowException e){
    //    System.out.println("No Appointment0");
     //}   
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
    
    for(int i = 0 ; i<q.size()-1 ; i++){
      for(int j = 0 ; j<q.size()-1-i ; j++){
        Patient a = (Patient) temp[i];
        Patient b = (Patient) temp[j+1];
        if(a.name.compareTo(b.name)>0){
          Object swap = temp[i];
          temp[i] = temp[j+1];
          temp[j+1] = swap;
        }
      }
    }
    if(q.size()==0){
      System.out.println("No Appointment");
    }
    else{
      for(int i = 0 ; i<temp.length ; i++){
        //Patient x=(Patient)temp[i];
       // System.out.println(x.id);
        System.out.println(temp[i]);
      }
    }
  }
/////
}    
 

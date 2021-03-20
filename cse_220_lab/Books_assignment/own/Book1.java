public class Book1{
  String Name;
  String Author;
  String Publisher;
  int id;
  
  public Book1(String n,String a,String p,int i){
  Name=n;
  Author=a;
  Publisher=p;
  id=i;
  }
  public String toString(){
  return "Name: "+Name+"\nId: "+id+"\n Author: "+Author+"\nPublisher: "+Publisher;
  }
  
  }
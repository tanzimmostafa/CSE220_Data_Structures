public class Patient1{
  String name;
  int age;
  String blood;
  int id;
  
  public Patient1(String n,int a,String b,int i){
   name=n;
   age=a;
   blood=b;
   id=i;
  }
  
  public String toString(){
   return "name: "+name+"\nage: "+age+"\n blood: "+blood+"\n id:"+id+"\n";
  }
}
  
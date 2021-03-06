public class Task05{
  public static void main (String[]args){
    
    int[] arr = {6,99,2,39,5,-5,33};
    Node2 head=new Node2 (arr[0],null,null);
    Node2 tail=head;
    
    for(int i=1;i<arr.length;i++){
      Node2 temp=new Node2 (arr[i],null,null);
      tail.next=temp;
      temp.prev=tail;
      tail=tail.next;
    }
    
    for(Node2 i=head;i!=null;i=i.next){
      int temp=i.element;    
      Node2 j = i;
      
      while(j.prev!=null && j.prev.element>temp){
        j.element=j.prev.element;
        j=j.prev;
      }
      j.element=temp;
    }
   
    
    for(Node2 b=head;b!=null;b=b.next){
      System.out.print(b.element+",");
    }
    
  }
}
public class Task03{
  public static void main (String [] args){
    
    int[] arr = {6,99,2,39,5,-5,33};
    
    Node head = new Node(arr[0] ,null);
    Node tail = head;
    
    for(int i=1;i<arr.length;i++){
      Node temp = new Node (arr[i], null);
      tail.next = temp;
      tail = tail.next;
    }
    
    for(Node a=head;a!=null;a=a.next){
      for(Node b=head;b.next!=null;b=b.next){
        
        if(b.val>b.next.val){
          int t = b.val;
          b.val = b.next.val;
          b.next.val = t;
        }
      }//
        
    }
   
    
    for(Node c=head;c!=null;c=c.next){
      System.out.print(c.val+",");
    }
    
  }}
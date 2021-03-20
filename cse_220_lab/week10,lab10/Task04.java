public class Task04{
  public static void main (String[]args){
     int[] arr = {6,99,2,39,5,-5,33};
    
    Node head = new Node (arr[0],null);
    Node tail = head;
    
    for(int i=1 ;i<arr.length;i++){
      Node temp = new Node (arr[i] , null);
      tail.next = temp;
      tail = tail.next;
    }
       
    for(Node a=head;a.next!=null;a=a.next){
      Node minIndex = a;
      for(Node b=a.next;b!=null;b=b.next){
        if(b.val<minIndex.val){
        minIndex = b;
        }
      }
      int temp = minIndex.val;
      minIndex.val = a.val;
      a.val = temp;
    }
    
    
    for(Node c=head;c!=null;c=c.next){
      System.out.print(c.val+",");
    }
  }
}
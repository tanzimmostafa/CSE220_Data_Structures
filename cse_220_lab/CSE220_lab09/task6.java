import java.util.Scanner;
public class task6{
  public static void main(String [] args){
    Node head=new Node(5,null);
    Node tail=head;
    for(int i=5;i<=8;i++){
     Node mn=new Node(i,null);
     tail.next=mn;
     tail=mn;
    }
    System.out.println(addL(head));
    
  }
  public static int addL(Node head){
    if(head.next==null){
     return head.val;
    }else{
     return head.val+addL(head.next);
    }
  }
}
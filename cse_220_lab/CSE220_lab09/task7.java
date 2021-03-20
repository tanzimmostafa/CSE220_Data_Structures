import java.util.Scanner;
public class task7{
  public static void main(String [] args){
    Node head=new Node(5,null);
    Node tail=head;
    for(int i=5;i<=8;i++){
     Node mn=new Node(i,null);
     tail.next=mn;
     tail=mn;
    }
    printRL(head);
    
  }
  public static void printRL(Node head){
    if(head.next==null){
     System.out.println(head.val);
    }else{
     printRL(head.next);
     System.out.println(head.val);
    }
  }
}
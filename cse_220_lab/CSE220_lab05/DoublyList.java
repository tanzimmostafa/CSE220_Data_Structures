import java.util.*;

public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        Node x=head.next;
        int count=0;
        while(x.element!=null){
         count+=1;
         x=x.next;
        }
        return count;
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        Node x=head.next;
        
        while(x.element!=null){
          if(x.next.element==null){
           System.out.println(x.element+".");
           break;
          } 
          else{
         System.out.print(x.element+",");
         x=x.next;
          }
        }
    }
       
   
    public void backwardprint(){
        Node x=head.prev;
        
        while(x.element!=null){
          if(x.prev.element==null){
           System.out.println(x.element+".");
           break;
          } 
          else{
         System.out.print(x.element+",");
         x=x.prev;
          }
        }
             
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
       Node x=head.next;
        int count=0;
        while(x.element!=null){
          if(count==idx){
           return x;
          }           
         count+=1;
         x=x.next;
        }
        return null;
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        Node x=head.next; 
        int count=0;
        while(x.element!=null){
          if(x.element==elem){
           return count;
          }           
         count+=1;
         x=x.next;
        }
        return -1;
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        Node z=new Node(elem,null,null);//z=new Node
        Node x=head.next;
        int count=0;
        while(x.element!=null || count<=idx){
          if(count==idx){
           z.next=x;
           z.prev=x.prev;
           x.prev.next=z;
           x.prev=z;
          } 
          
         count+=1;
         x=x.next;
        }
        
    }
    

    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        Object temp;//contains element of the removed node.
        Node x=head.next;
        int count=0;
        while(x.element!=null){
          if(count==index){
           temp=x.element;
           x.prev.next=x.next;
           x.next.prev=x.prev;
           return temp;
          } 
          
         count+=1;
         x=x.next;
        }
        return null;
    }
    
    
    
}
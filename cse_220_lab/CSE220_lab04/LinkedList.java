public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++ ){
     Node n=new Node(a[i],null);
     tail.next=n;
     tail=n;//tail=tail.next;
     
    }    
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    Node x=head;
    int count=0;
    while(x!=null){
     count+=1;
     x=x.next;
    }
    return count;   
  }
  
  /* prints the elements in the list */
  public void printList(){
       Node x=head;
       while(x!=null){
         if(x.next!=null){
           System.out.print(x.element+", ");
         }
         else{
         System.out.println(x.element+".");
         }
       x = x.next;
       }
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    if(idx<0){ 
      return null;
     }
    
    int count=0;
    Node x=head;
    while(x!=null){
      if(count==idx){
       return x;
      }
     count+=1;
     x=x.next;;
    }
    return null;//if idx is greater than number of nodes
    
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
     if(idx<0){ 
      return null;
     }
     
    int count=0;
    Node x=head;
    while(x!=null){
      if(count==idx){
       return x.element;
      }
     count+=1;
     x=x.next;;
    }
    return null;//if idx is greater than number of nodes
    
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
      if(idx<0){ 
      return null;
     }
    Object temp;//contains old element of the node
    int count=0;
    Node x=head;
    while(x!=null){
      if(count==idx){
       temp=x.element; 
       x.element=elem;
       return temp;
      }
     count+=1;
     x=x.next;;
    }
    return null;
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    
    int count=0;//index number
    Node x=head;
    while(x!=null){
      if(x.element==elem){
       return count; 
      }
     count+=1;
     x=x.next;;
    }
    return -1;
  }
  
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){ 
    Node x=head;
    while(x!=null){
      if(x.element==elem){
       return true; 
      }
     x=x.next;;
    }
    return false;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node head2=new Node(head.element,null);//new node's head
    Node tail2=head2;
    Node temp=head.next;
    while(temp!=null){
     Node n=new Node(temp.element,null);
     tail2.next=n;
     tail2=n;
     temp=temp.next;
  }
    return head2;
  }
  
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node head2=new Node(head.element,null);//new head
    
    for(Node x=head.next;x!=null;x=x.next){
     Node n=new Node(x.element,head2);
     head2=n;   
    }
    return head2;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    int p=countNode();
    
    if(idx==0){
     Node z=new Node(elem,head);
     head=z;
    }
      
    if(idx>0 && idx<=p){       //works for idx atleast 1

      Node z=new Node(elem,null);//z=new Node
      int count=0;
      for(Node i=head;i!=null;i=i.next){
      if(count==idx-1){
       z.next=i.next;
       i.next=z;
       break;
      }
      count++;
    }  
    }
   
  }

  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    int p=countNode();
    Object temp;//holds removed element
    if(index==0){
     temp=head.element;
     head=head.next;
     return temp;
    }
      
    if(index>0 && index<=p){       //works for idx atleast 1
      
      int count=0;
      for(Node i=head;i!=null;i=i.next){
      if(count==index-1){
      temp=i.next.element;  
      i.next=i.next.next;
      return temp;
      }
      count++;
    }  
    }
    return null;
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    Node x=head;
    while(x!=null){
      if(x.next==null){
       x.next=head;
       break;
      }
      x=x.next;
    }
    head=head.next;
    x.next.next=null;
     
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
     Node x=head;
    while(x!=null){
      if(x.next.next==null){
       x.next.next=head;
       head=x.next;
       x.next=null;
       break;
      }
      x=x.next;
    }
     
  }
  
}
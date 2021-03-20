public class ListQueue implements Queue{
  int size;
  Node front;
  Node rear;
  
  
  public ListQueue(){
    size = 0;
    front = null;
    rear = null;
  }
  public int size(){
   return size;
  }
  public boolean isEmpty(){
   if(size==0)
     return true;
   else
     return false;
  }
  public void enqueue(Object o) throws QueueOverflowException{
    if(size==0){
     Node mn=new Node(o,null);
     front =mn;
     rear=mn;
     size++;
    }
    else{
     Node mn=new Node(o,null);
     rear.next=mn;
     rear=mn;
     size++;
    }
  }
  public Object dequeue() throws QueueUnderflowException{
    if(size==0){
     throw new QueueUnderflowException();
    }
    else{
     Object temp=front.val;
     front=front.next;
     size--;
     return temp; 
    }  
  }
  public Object peek() throws QueueUnderflowException{
   if(size==0){
     throw new QueueUnderflowException();
    }
   else{
     return front.val;
  }
  }
  public String toString(){
    if(size==0){
     return "Empty Queue";
    }
    else{
   String a="[ ";
   for(Node i=front;i!=null;i=i.next){
    a=a+i.val+" ";
   }
   a=a+"]";
   return a;
    }
  }
  
  public Object[] toArray(){
    Object [] nA=new Object[size];
    int count=0;
   for(Node i=front;i!=null;i=i.next){
    nA[count++]=i.val;
   }
   return nA;
  }
  public int search(Object o){
    int c=0;//c=count
    for(Node i=front;i!=null;i=i.next){
      if(i.val==o){
       return c;
      }
      c++;
   }
    return -1;
  
  }
}
  
  
  
  
  
  
  
  

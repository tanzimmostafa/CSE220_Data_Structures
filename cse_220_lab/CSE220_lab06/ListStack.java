public class ListStack implements Stack{
    int size;
    Node top;
  
    
    public ListStack(){
        size = 0;
        top = null;
    }
      public int size(){
     return size;
    }
    public boolean isEmpty(){
      if(size==0) {
       return true;
      }
      else 
        return false;
    }
    public void push(Object e) throws StackOverflowException{
      
        Node n =new Node(e,top);
        top=n;
        size++;
      }

  
   public Object pop() throws StackUnderflowException{
      if(size==0){
       throw new StackUnderflowException();
      }
      else{
       Object temp=top.val;
       top=top.next;
       size--;
       return temp;
      }
     
      }
   public Object peek() throws StackUnderflowException{
      if(size==0){
       throw new StackUnderflowException();
      }else{
      return top.val;
    }
    }
  public String toString(){
    if(size<=0) return "Empty Stack";
    Node start = top;
    String sum ="";
    while(start!=null){
      sum+=start.val;
      sum+=" ";
      start=start.next;
    }
    return sum;
  }
  public Object[] toArray(){
    Object[] nA = new Object[size];
    Node start =top;
    int i =0;
    while(start!=null){
      nA[i] = start.val;
      start = start.next;
      i++;
    }
    return nA;
  }
  public int search(Object e){
    boolean flag = false;
    int count =0;
    Node start =top;
    for(start = top; start!=null; start=start.next){
      if(start.val==e){
        flag = true;
        break;
      }
      count++;
    }
    if(flag) {
      return count;
    }
    else {
      return -1;
    }
  }
}
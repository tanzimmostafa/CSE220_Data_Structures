public class ArrayQueue implements Queue{
  int size;
  int front;
  int rear;
  Object [] data;
  
  public ArrayQueue(){
    size=0;
    front = -1;
    rear = -1;
    data = new Object[5];
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
    if(size==data.length){
      throw new QueueOverflowException();
    }
    else if(size==0 && front==-1){//only for very first case->entry into 0 index
     data[size]=o;
     size++;
     front++;
     rear++;
    }
    else{
      rear=(rear+1)%data.length;
      data[rear]=o;
      size++;
    }
  }
  public Object dequeue() throws QueueUnderflowException{
    if(size==0){
     throw new QueueUnderflowException();
    }
    else{
      Object temp=data[front];
      data[front]=null;
      front=(front+1)%data.length;
      size--;
      return temp;
    }
   }
  public Object peek() throws QueueUnderflowException{
    if(size==0){
     throw new QueueUnderflowException();
    }
    else{
     return data[front];
    } 
   }
  public String toString(){
    if(size==0){
     return "Empty Queue";
    }
    else{
    String a="[ ";
    for(int i=0,j=front;i<size;i++){  
       a=a+data[j]+" ";
      j=(j+1)%data.length;
    }
    a=a+"]";
    return a; 
    }
  }
  
  public Object[] toArray(){
    Object [] nA=new Object[size];//nA=new Array
    for(int i=0,j=front;i<size;i++){
     nA[i]=data[j];
     j=(j+1)%data.length;
    }
    return nA;
  }
  public int search(Object o){
    for(int i=0,j=front;i<size;i++){
      if(data[j]==o){
       return i;
      }    
    }
    return -1;
  }
}
  
  
  
  
  
    
                       
    
    
    
    
    
    
    
    
    
    
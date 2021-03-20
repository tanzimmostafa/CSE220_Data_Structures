public class ArrayStack implements Stack{
    int size;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        data = new Object[5];
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
      if(size==data.length){
       throw new StackOverflowException();
      }
      else{
        data[size]=e;
        size++;
      }
    }
    public Object pop() throws StackUnderflowException{
      if(size==0){
       throw new StackUnderflowException();
      }
      else{
       Object temp=data[size-1];
       data[size-1]=null;
       size--;
       return temp;
      }
     
      }
    
    public Object peek() throws StackUnderflowException{
      if(size==0){
       throw new StackUnderflowException();
      }
      
      return data[size-1];
     
    }
    
  public String toString(){
    if(size==0) return "Empty Stack";
    int len = size-1;
    String sum ="";
    while(len>=0){
      sum+=data[len];
      sum+=" ";
      len--;
    }
    return sum;
  }
  public Object[] toArray(){
    Object[] nA = new Object [size];
    int j = 0;
    for(int i = size-1 ; i >=0 ; i--){
      nA[j] = data[i];
      j++;
    }
    return nA;
  }
   public int search(Object e){
    int count = 0;

    for(int i = size-1 ; i>=0 ; i--){
      if(data[i]==e){
        return count;
    }
      count++;
    }
    
    return -1;
  }
  

}
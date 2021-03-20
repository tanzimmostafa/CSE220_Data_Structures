public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    start=st;
    size=sz;
    cir=new Object [lin.length];
    for(int i=0;i<lin.length;i++){
    cir[st]=lin[i];
    st=(st+1)%lin.length;
    }
   }
  
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
    for(int i=0;i<cir.length;i++){
      if(i==cir.length-1){
       System.out.println(cir[i]+".");
      }else{
      System.out.print(cir[i]+", ");
      }
    }
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    int count=start;
    for(int i=0;i<size;i++){
      if(i==size-1){
       System.out.println(cir[count]+".");
      }else{ 
      System.out.print(cir[count]+", ");
      count=(count+1)%cir.length;
      }
    }}
  
  
  public void printBackward(){
   int a=(start+size-1)%cir.length;//last index
//   int j=a;
   for(int i=0;i<size;i++){//loop runs for 4times
     
     if(a<0){
      a=a+cir.length;
     }
     
      if(i==size-1){
       System.out.println(cir[a]+".");
      }else{  
      System.out.print(cir[a]+", ");     
      }
      a--;
   }
   
  }
  
  // With no null cells
  public void linearize(){
    Object [] newArray =new Object[size];
    for(int i=0;i<newArray.length;i++){
     newArray[i]=cir[start];
     start=(start+1)%cir.length;
    }
    cir=newArray;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object [] newArray =new Object[newcapacity];
    
    int count=start;
    for(int i=0;i<cir.length;i++){//loop runs 5times
     newArray[count]=cir[start];
    start=(start+1)%cir.length; 
    count=(count+1)%newArray.length;
    }
    cir=newArray;   
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object [] newArray =new Object[newcapacity];
    for(int i=0;i<newArray.length;i++){
     newArray[i]=null;
    }
    int count=0;
    for(int i=0;i<cir.length;i++){//loop runs 5times
     newArray[count++]=cir[start];
    start=(start+1)%cir.length; 
    }
    cir=newArray;
  }
       
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    Object[] newArray = new Object[cir.length];
    if(size==cir.length){
      resizeStartUnchanged(cir.length+3);//circulararray lengthwill become8 if condition true 
    }
    int index=(start+pos)%cir.length;//index to be inserted in
    int shifts=size-pos;//number of shifts
    
    int i=(start+size-1)%cir.length;//index of Last Value
    int j=(start+size)%cir.length;//index of next available pos
    
    for(int k=0;k<shifts;k++){
      cir[j] = cir[i];
      if(i<0){
        i=i+cir.length;
      }
      if(j<0){
        j=j+cir.length;
      }
      i--;
      j--;
    }
    cir[index] = elem;
    size++;//size will increase by 1 due to insertion
  }
     
  public void insertByLeftShift(Object elem, int pos){
     Object[] newArray = new Object[cir.length];
    if(size==cir.length){
      resizeStartUnchanged(cir.length+3);//circulararray lengthwill become8 if condition true 
    }
    int index=(start+pos)%cir.length;//index to be inserted in
    int shifts=pos;//number of shifts-0 to pos 
    
    int i=(start-1);
    int j=start;
    
    for(int k=0;k<=shifts;k++){
      cir[i] = cir[j];
     
      i=(i+1)%cir.length;
      j=(j+1)%cir.length;
    }
    cir[index] = elem;
    size++;
    start--;
  }
  
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    int index=(start+pos)%cir.length;
    int i=index;
    int j=(index+1)%cir.length;
    for(int k=pos;k<cir.length-1;k++){
     cir[i]=cir[j];
     i=(i+1)%cir.length;
     j=(j+1)%cir.length;
    }
    size--;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    int index=(start+pos)%cir.length;
//    int shifts=size-pos;
    int shifts=pos;
    int p=index;
    int q=index-1;
    for(int i=0;i<shifts;i++){
     cir[p]=cir[q];
     if(p<0){
     p=p+cir.length;
     }
     if(q<0){
     q=q+cir.length;
     }
     
     p--;
     q--;
    }
    cir[start]=null;
    start++;
    size--;
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
    int i=start;//3
    int j=(start+size-1)%cir.length;//last element's index/0
    boolean flag=false;
    for(int c=0;c<size/2;c++){//loop runs 2 times
      
      if(j<0){//if goes negative while checking from lastindex
       j=cir.length-1;
      }
      
      if(cir[i]!=cir[j]){
       flag=true;
      }
      
    i=(i+1)%cir.length;
    j--;
    
    }//for loop ends
    if(flag==false){
     System.out.println("This array is a palindrome.");
    }else{
      System.out.println("This array is NOT a palindrome.");
     }
  
  }
  
  
  
  //This method will sort the values by keeping the start unchanged
  public void sort(){
    
    
    
    for(int i=0;i<size-1;i++){
      int x=start;
      for(int j=0;j<size-1-i;j++){
        
        if((Integer)cir[x%cir.length] > (Integer)cir[(x+1)%cir.length]){
         int temp=(Integer) cir[x%cir.length];
         cir[x%cir.length]=cir[(x+1)%cir.length];
         cir[(x+1)%cir.length]=temp;
        }
        x=(x+1)%cir.length;
      }
    }
        
   }
 

  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
     
    if(size==k.size){
      //c=count
      for(int i=start, j=k.start, c=0;c<size;c++,i=(i+1)%cir.length,j=((j+1)%(k.cir.length))){
      
        if(cir[i]!=k.cir[j]){
         return false;         
        }
      }//for loop ends
      return true;
   
    }else{ 
         
       return false;
       }
  }
  
  }

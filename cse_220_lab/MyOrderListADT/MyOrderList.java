public class MyOrderList{
  Node cursor;
  
  MyOrderList(){
   cursor=null;
  }
  
  void insert(Node newElement){
   if(cursor==null){////case-1
         cursor=newElement;
         cursor.next=cursor;
        }
   
    else{
     
    boolean flag=false;
    Node i=cursor;
    do{//checks whether newElement already exists ornot
      if(i.key==newElement.key){
       flag=true;
      }
    i=i.next;
    }while( i!=cursor);
      
      if(flag==true){
      System.out.println("key already exists");
    }//ends
      
      else{
         //finding smallest key
         Node x=cursor;
         Node y=cursor.next;
         Node head;
         Node tail;
       for(;;){

           if((x.key>y.key)||(x.key==y.key)){            
           head=y;
           tail=y.next;
           break;
           }
        
           x=x.next;
           y=y.next;
          
          }//ends
                  
          for(;;){
           if( (newElement.key>head.key && newElement.key<tail.key) ||(head.key>tail.key) ||(head==tail)){
            head.next=newElement;
            newElement.next=tail;
            break;
           }
//           else if(newElement.key==head.key){
//            System.out.println("key already exists");
//            break;
//           }
           head=head.next;
           tail=tail.next;
          
          }
        } 
      }
  }
        
      
  
  Node retrieve(int searchKey){
    if(cursor==null){
     System.out.println("List is Empty");
     return null;
    }
    else{
      Node x=cursor;
      do{
        if(searchKey==x.key){
         cursor=x;
         return x;
        }
        x=x.next;
      }while(x!=cursor);
      
      return null;//if not found
  
  }
  }
  Node remove(){
   if(cursor==null){
     System.out.println("List is Empty");
     return null;
    }
   
   else{
     int count=0;
     Node x=cursor;
     do{
     x=x.next;
     count++;
     }while(x.next!=cursor);//finding node before cursor
     
     if(count==1){//if there is one node
      Node temp=cursor;
      cursor=null;
      return temp;
     }
     else{
     x.next=cursor.next;
     Node temp=cursor;
     cursor=x.next;
     return temp;
     }
    }
  }
  
   Node remove(int deleteKey){
   if(cursor==null){
     System.out.println("List is Empty");
     return null;
   }else{
   Node x=cursor;
      do{
        if(deleteKey==x.key){
          ///like remove
     int count=0;
     Node y=x;
     do{
     y=y.next;
     count++;
     }while(y.next!=x);//finding node before node  to be removed
     
     if(count==1){//if there is one node
      Node temp=x;
      cursor=null;
      return temp;
     }
     else{
     y.next=x.next;
     Node temp=x;
     cursor=y.next;
     return temp;
     }
     ///
        }    
        x=x.next;
      }while(x!=cursor);
      
      return null;//if not found
   }
   }
   
   void clear(){
     if(cursor==null){
      System.out.println("List is already empty");
     }
     else{
      cursor=null;
     }
   }
   
   boolean isEmpty(){
     if(cursor==null){
      return true;
     }
     else{
      return false;
     }
   }
   
   Node gotoBeginning(){
     if(cursor==null){
      return null;
     }
     else{
         Node head=cursor;
         Node tail=cursor.next;
       for(;;){

           if((head.key>tail.key)||(head.key==tail.key)){
            cursor=tail;
            return cursor;
           }
        
           head=head.next;
           tail=tail.next;
          
          }
     }
   }
   Node gotoEnd(){  
    if(cursor==null){
      return null;
     }
     else{
        Node head=cursor;
        Node tail=cursor.next;
       for(;;){
         
           if((head.key>tail.key)||(head.key==tail.key)){
            cursor=head;
            return cursor;
           }
        
           head=head.next;
           tail=tail.next;
          
          }
     }
   }
   
   Node gotoNext(){
    if(cursor==null){
      return null;
     }
    else{
     cursor=cursor.next;
     return cursor;
    }
   }
   
   Node gotoPrior(){
    if(cursor==null){
      return null;
     }
    else{
    Node i=cursor;
    while(i.next!=cursor){
      i=i.next; 
    } 
    cursor=i;
    return cursor;
    }
   }
   Node getCursor(){
    if(cursor==null){
      return null;
     }
    else{
     return cursor;
    }
   
   }
   
   void showList (){
     if(cursor==null){
      System.out.println("Empty list");
     }
     else{    
    Node x=cursor;
       do{
       System.out.println(x.key);
       x=x.next;
       } while(x!=cursor);
       
       }
   }

   
   
  
}
        
        
      
      
      
        
      
  
  
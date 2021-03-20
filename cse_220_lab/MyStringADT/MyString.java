public class MyString{//replaceFirst
  private char[] array;
  private char[] array2;
  private char[] array3;
  public char p;
  public char q;
  
  
  
  MyString(){
  
  } 
  MyString(char[] o){
  array=o;
  }
  
  
  MyString(String z){
    array =z.toCharArray();
  }
  
    
  public int length(){
  return array.length;
  }
/////////
    
  public char charAt(int n){
    return array[n];
  }
  //////////////   
   
    public boolean startsWith(String a){
    array2=a.toCharArray();
    boolean flag=false;
    if(array2.length<=array.length){
     
      for(int i=0;i<array2.length;i++){
        if(array2[i]==array[i]){
          flag=true;
        }
        
        else{
         flag= false;
         break;
        }
      }
      if(flag==true){
        return true;
      }else{ return false; }
          
    }
    
    else {
      return false;
    }
  }
//////////////
     public boolean startsWith(MyString a){
    array2=a.array;
    boolean flag=false;
    if(array2.length<=array.length){
     
      for(int i=0;i<array2.length;i++){
        if(array2[i]==array[i]){
          flag=true;
        }
        
        else{
         flag= false;
         break;
        }
      }
      if(flag==true){
        return true;
      }else{ return false; }
          
    }
    
    else {
      return false;
    }
  }
//////////////
   public boolean endsWith(String a){
    array2=a.toCharArray();
   
     char[] revarray=new char[array.length];//reversearray
     char[] revarray2=new char[array2.length];
    
    
    int t=0;
    int d=0;
    
    for(int z=array.length-1;z>=0;z--){//arrays stored in reverse order
      revarray[t]=array[z];
     t++;
    }
    for(int w=array2.length-1;w>=0;w--){
     revarray2[d]=array2[w];
     d++;
    }      
    //ends
    
    boolean flag=false;
    if(revarray2.length<=revarray.length){
     
      for(int i=0;i<revarray2.length;i++){
        if(revarray2[i]==revarray[i]){
          flag=true;
        }
        
        else{
         flag= false;
         break;
        }
      }
      if(flag==true){
        return true;
      }else{ return false; }
          
    }
    
    else {
      return false;
    }
  }
////////////
   public boolean endsWith(MyString a){
    array2=a.array;
   
     char[] revarray=new char[array.length];//reversearray
     char[] revarray2=new char[array2.length];
    
    
    int t=0;
    int d=0;
    
    for(int z=array.length-1;z>=0;z--){//arrays stored in reverse order
      revarray[t]=array[z];
     t++;
    }
    for(int w=array2.length-1;w>=0;w--){
     revarray2[d]=array2[w];
     d++;
    }      
    //ends
    
    boolean flag=false;
    if(revarray2.length<=revarray.length){
     
      for(int i=0;i<revarray2.length;i++){
        if(revarray2[i]==revarray[i]){
          flag=true;
        }
        
        else{
         flag= false;
         break;
        }
      }
      if(flag==true){
        return true;
      }else{ return false; }
          
    }
    
    else {
      return false;
    }
  }
////////////
public boolean equals(String a){
    array2=a.toCharArray();
   
    boolean flag=false;
    if(array2.length==array.length){
     
      for(int i=0;i<array2.length;i++){
        
        
        if(array2[i]==array[i]){
          flag=true;
        }
        
        else{
         flag= false;
         break;
        }
      }
      if(flag==true){
        return true;
      }else{ return false; }
          
    }
    
    else {
      return false;
    }
  }
/////////
public boolean equals(MyString a){
    array2=a.array;
   
    boolean flag=false;
    if(array2.length==array.length){
     
      for(int i=0;i<array2.length;i++){
        
        
        if(array2[i]==array[i]){
          flag=true;
        }
        
        else{
         flag= false;
         break;
        }
      }
      if(flag==true){
        return true;
      }else{ return false; }
          
    }
    
    else {
      return false;
    }
  }
/////////
   
  
///////// 
  public String replaceFirst(char a, char b){
    
   
    String f="";
    for(int i=0;i<array.length;i++){
      
      if(array[i]==a){
        array[i]=b;
        break;
      }
    }
    for(int j=0;j<array.length;j++){
      f+=array[j];
    }
    return f;
  }
///////////

public String replaceLast(char a, char b){
 
    String f="";
    for(int i=array.length-1;i>=0;i--){
      
      if(array[i]==a){
        array[i]=b;
        break;
      }
    }
    for(int j=0;j<array.length;j++){
      f+=array[j];
    }
    return f;
  }
///////////

public String replaceAll(char a, char b){
    String f="";
   
    
    for(int i=0;i<array.length;i++){
      
      if(array[i]==a){
        array[i]=b;
        
      }
    }
    for(int j=0;j<array.length;j++){
      f+=array[j];
    }
    return f;
  }

///////////
public String toLowerCase(){
  String f="";
  int[] arrayA=new int[array.length];
  char[] arrayB=new char[array.length];
  
  for(int i=0;i<array.length;i++){
    if(array[i]>=65 && array[i]<=90){
     arrayA[i]=((int)array[i])+32;
    }
    else{
    arrayA[i]=(int)array[i];
    }
  }
  for(int j=0;j<array.length;j++){
   arrayB[j]=(char)arrayA[j];
  }
   for(int k=0;k<array.length;k++){
      f+=arrayB[k];
    }
    return f;
  }

/////////////
public String toUpperCase(){
  String f="";
  int[] arrayA=new int[array.length];
  char[] arrayB=new char[array.length];
  
  for(int i=0;i<array.length;i++){
    if(array[i]>=97 && array[i]<=122){
     arrayA[i]=((int)array[i])-32;
    }
    else{
    arrayA[i]=(int)array[i];
    }
  }
  for(int j=0;j<array.length;j++){
   arrayB[j]=(char)arrayA[j];
  }
   for(int k=0;k<array.length;k++){
      f+=arrayB[k];
    }
    return f;
  }
/////////////
public boolean equalsIgnoreCase(String a){
  String c=a.toUpperCase(); 
  array2=c.toCharArray();
  
  String d="";
  for(int x=0;x<array.length;x++){
  d+=array[x];
  }
  String e=d.toUpperCase();
 array=e.toCharArray();
  
  
   
    boolean flag=false;
    if(array2.length==array.length){
     
      for(int i=0;i<array2.length;i++){
        
        
        if(array2[i]==array[i]){
          flag=true;
        }
        
        else{
         flag= false;
         break;
        }
      }
      if(flag==true){
        return true;
      }else{ return false; }
          
    }
    
    else {
      return false;
    }
  }
////////////
public boolean equalsIgnoreCase(MyString a){
  String c=a.toUpperCase(); 
  array2=c.toCharArray();
  
  String d="";
  for(int x=0;x<array.length;x++){
  d+=array[x];
  }
  String e=d.toUpperCase();
 array=e.toCharArray();
  
  
   
    boolean flag=false;
    if(array2.length==array.length){
     
      for(int i=0;i<array2.length;i++){
        
        
        if(array2[i]==array[i]){
          flag=true;
        }
        
        else{
         flag= false;
         break;
        }
      }
      if(flag==true){
        return true;
      }else{ return false; }
          
    }
    
    else {
      return false;
    }
  }
////////////
public int indexOf(char a){
 int b=-2;
  for(int i=0;i<array.length;i++){
    if(array[i]==a){
       b=i;
      break;
    }else{b=-1;}
}
  return b;
}
//////////
public int lastIndexOf(char a){
 int b=-2;
  for(int i=array.length-1;i>=0;i--){
    if(array[i]==a){
       b=i;
      break;
    }else{b=-1;}
}
  return b;
}
////////
public int indexOf( char a, int start ){
 int b=-2;
  for(int i=start;i<array.length;i++){
    if(array[i]==a){
       b=i;
      break;
    }else{b=-1;}
}
   return b;
}
/////////
  public int lastIndexOf( char a, int start ){
 int b=-2;
  for(int i=start;i>=0;i--){
    if(array[i]==a){
       b=i;
      break;
    }else{b=-1;}
}
   return b;
}
////////
 public int indexOf(String a){
 int b=-2;
 array2=a.toCharArray();
 int index=-2;
 boolean flag=false;
 
  for(int i=0;i<array.length;i++){
    int counter=0;
    if(array[i]==array2[0]){
      index=i;
      for(int j=0;j<array2.length;j++){
        int q=i+j;
        if(i+j<=array.length-1){
        if(array2[j]==array[q]){
         counter=counter;
        }else{counter++;}
        }else{counter++;}
      }
      if(counter==0){ 
        flag=true;
        break;
      }
      }
    
  } 
  if(index==-2||flag==false){return -1;}
  if(index!=-2&&flag==true){return index;}
  return 0;//dummy return
  
}
/////////////
  public int lastIndexOf(String a){
 
 array2=a.toCharArray();
 char[] revarray2=new char[array2.length];

 for(int s=array2.length-1;s>=0;s--){
 revarray2[s]=array2[s]; 
 }

     
 int b=-2;    
 int index=-2;
 boolean flag=false;
 
  for(int i=array.length-1;i>=0;i--){
    int counter=0;
    if(array[i]==revarray2[0]){
      index=i;
      for(int j=0;j<revarray2.length;j++){
        int q=i-j;
        if(i-j>=0){
        if(revarray2[j]==array[q]){
         counter=counter;
        }else{counter++;}
        }else{counter++;}
      }
      if(counter==0){ 
        flag=true;
        break;
      }
      }
    
  } 
  if(index==-2||flag==false){return -1;}
  if(index!=-2&&flag==true){return index;}
  return 0;//dummy return
 } 

 
 //////////////
  public String concat (String a){
    if(a!=null){
    
    array2 = a.toCharArray();
    String ab="";
    
    for(int i=0;i<array.length;i++){
    ab+=array[i];
    }
    
   
    
    for(int j = 0;j<array2.length;j++){
      ab+=array2[j];
    }
    
    return ab;
    }
    else 
      return "enter a valid string";
    
  }

/////////////////
    public String concat (MyString a){
    if(a!=null){
    
    array2 = a.array;
    String ab="";
    
    for(int i=0;i<array.length;i++){
    ab+=array[i];
    }
    
   
    
    for(int j = 0;j<array2.length;j++){
      ab+=array2[j];
    }
    
    return ab;
    }
    else 
      return "enter a valid string";
    
  }

/////////////////
  public String concat (char[] a ){
    
    String ab="";
    
    for(int i=0;i<array.length;i++){
    ab+=array[i];
    } 
    for(int j = 0;j<a.length;j++){
      ab+=a[j];
    }    
    return ab;
  }

//////////////////
public String substring(int start){
  char[] arrayA=new char[array.length-start];
  for(int i=start;i<array.length;i++){
   arrayA[i-start]=array[i]; 
  }
   String ab="";
    
    for(int j=0;j<arrayA.length;j++){
    ab+=arrayA[j];
    } 
    return ab;
}
//////////////
public String substring(int start,int end){
  char[] arrayA=new char[array.length-(start-end)];
  for(int i=start;i<end;i++){
   arrayA[i-start]=array[i]; 
  }
   String ab="";
    
    for(int j=0;j<arrayA.length;j++){
    ab+=arrayA[j];
    } 
    return ab;
}
     
//////////////

public int compareTo(String b){ 
  array2=b.toCharArray();
  
  
        for (int i = 0; i < array.length &&  i < array2.length; i++) { 
            if ((int)array[i] == (int)array2[i]) { 
                continue; 
            }  
            else { 
                return ((int)array[i] - (int)array2[i]); 
            } 
        } 
        if (array.length < array2.length) { 
            return (array.length-array2.length); 
        }  
        else if (array.length > array2.length) { 
            return (array.length-array2.length); 
        } 
        else { 
            return 0; 
        } 
    }


/////////////  
public int compareTo(MyString b){ 
  array2=b.array;
  
  
        for (int i = 0; i < array.length &&  i < array2.length; i++) { 
            if ((int)array[i] == (int)array2[i]) { 
                continue; 
            }  
            else { 
                return ((int)array[i] - (int)array2[i]); 
            } 
        } 
        if (array.length < array2.length) { 
            return (array.length-array2.length); 
        }  
        else if (array.length > array2.length) { 
            return (array.length-array2.length); 
        } 
        else { 
            return 0; 
        } 
    }


/////////////  
public int compareToIgnoreCase(String b){ 
 
  String a=toLowerCase();
  MyString tttqqqq=new MyString (b);
  String y=tttqqqq.toLowerCase(); 
 array2=y.toCharArray();///String b in lower case
 array3=a.toCharArray();//input in lower case
         
 for (int i = 0; i < array.length &&  i < array2.length; i++) { 
            if ((int)array3[i] == (int)array2[i]) { 
                continue; 
            }  
            else { 
                return ((int)array3[i] - (int)array2[i]); 
            } 
 }
        
        if (array3.length < array2.length) { 
            return (array3.length-array2.length); 
        }  
        else if (array3.length > array2.length) { 
            return (array3.length-array2.length); 
        } 
        else { 
            return 0; 
        } 
    }

//////////
public int compareToIgnoreCase(MyString b){ 
 
  String a=toLowerCase();
 
  String y=b.toLowerCase(); 
 array2=y.toCharArray();///String b in lower case
 array3=a.toCharArray();//input in lower case
         
 for (int i = 0; i < array.length &&  i < array2.length; i++) { 
            if ((int)array3[i] == (int)array2[i]) { 
                continue; 
            }  
            else { 
                return ((int)array3[i] - (int)array2[i]); 
            } 
 }
        
        if (array3.length < array2.length) { 
            return (array3.length-array2.length); 
        }  
        else if (array3.length > array2.length) { 
            return (array3.length-array2.length); 
        } 
        else { 
            return 0; 
        } 
    }

/////
public int indexOf(MyString a){
 int b=-2;
 array2=a.array;
 int index=-2;
 boolean flag=false;
 
  for(int i=0;i<array.length;i++){
    int counter=0;
    if(array[i]==array2[0]){
      index=i;
      for(int j=0;j<array2.length;j++){
        int q=i+j;
        if(i+j<=array.length-1){
        if(array2[j]==array[q]){
         counter=counter;
        }else{counter++;}
        }else{counter++;}
      }
      if(counter==0){ 
        flag=true;
        break;
      }
      }
    
  } 
  if(index==-2||flag==false){return -1;}
  if(index!=-2&&flag==true){return index;}
  return 0;//dummy return
  
}

/////////////
 public int lastIndexOf(MyString a){
 
 array2=a.array;
 char[] revarray2=new char[array2.length];

 for(int s=array2.length-1;s>=0;s--){
 revarray2[s]=array2[s]; 
 }

     
 int b=-2;    
 int index=-2;
 boolean flag=false;
 
  for(int i=array.length-1;i>=0;i--){
    int counter=0;
    if(array[i]==revarray2[0]){
      index=i;
      for(int j=0;j<revarray2.length;j++){
        int q=i-j;
        if(i-j>=0){
        if(revarray2[j]==array[q]){
         counter=counter;
        }else{counter++;}
        }else{counter++;}
      }
      if(counter==0){ 
        flag=true;
        break;
      }
      }
    
  } 
  if(index==-2||flag==false){return -1;}
  if(index!=-2&&flag==true){return index;}
  return 0;//dummy return
 } 
}
 
 //////////////

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  


import java.util.*;
public class MyReader{
    //modify following line so that this method can throw Exception
    int readInteger() throws EitaIntegerNoiException {
        Scanner k = new Scanner(System.in);
        
        int answer;
       
        String s;
        s=k.nextLine();
   
        if (s.contains(".")==true){
         EitaIntegerNoiException ab=new EitaIntegerNoiException(); 
          throw ab;        
        }else{    
          answer=Integer.parseInt(s);
          return answer;        
        }
          
}
}
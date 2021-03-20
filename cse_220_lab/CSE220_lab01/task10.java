import java.util.Scanner;
public class task10{
  public static String season(int m,int d){//m=month,d=day
      if((m==12 && d>=16) || (m==1||m==2) || (m==3 && d<=15)){
       return "Winter";
      }
       
      if((m==3 && d>=16) || (m==4||m==5) || (m==6 && d<=15)){
       return"Spring";
      }
     
      if((m==6 && d>=16) || (m==7||m==8) || (m==9 && d<=15)){
       return"Summer";
      }
       if((m==9 && d>=16) || (m==10||m==11) || (m==12 && d<=15)){
       return"Fall";
      }
       else{              ////
         return "error";
       }
  }
  
  public static void main(String [] args){
    
    System.out.println(season(1,31));
    System.out.println(season(6,15));
    System.out.println(season(6,16));
    System.out.println(season(7,21));
    System.out.println(season(11,15));
    
    
  }
}
       
       
       
       
   
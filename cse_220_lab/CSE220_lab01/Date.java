public class Date{
  public int month;
  public int day;
  public int year;
  
  public Date(int m,int d, int y){
   month=m;
   day=d;
   year=y; 
  }
  
  public void setMonth(int a){
   month=a;
  }
  public int getMonth(){
   return month;
  }
  public void setDay(int b){
   day=b;
  }
  public int getDay(){
   return day;
  }
  public void setYear(int c){
   year=c;  
  }
  public int getYear(){
   return year;
  }
  public String displayDate(){
    return month+"/"+day+"/"+year+"\n";  
  }
}
  
  
    
    
    
    
public class DateTest{
 public static void main(String[] args){
   
   Date ab=new Date(5,14,2002);
   System.out.printf(ab.displayDate());
   
   ab.setMonth(2);
   ab.setDay(9);
   ab.setYear(2051);
   
System.out.printf(ab.getMonth()+"%n"+ab.getDay()+"%n"+ab.year+"\n");
 
 }
}
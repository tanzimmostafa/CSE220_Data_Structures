public class ComplexNumber extends RealNumber{
  public double imaginaryValue=1.0;
 
  boolean flag=false;
  public ComplexNumber(){
    super(1.0);
    flag=true;
   
  }
   public ComplexNumber(int a,int b){
    super(a);
    imaginaryValue=b;
    flag=true; 
  }
  public String toString(){
   return super.toString()+"\n"+"ImaginaryPart: "+imaginaryValue; 
  } 
  public void check(){
    if(flag==true){
     System.out.println("I'm in ComplexNumber class");
    }
    super.ping();
    System.out.println("Checking ended");
  }
}
  
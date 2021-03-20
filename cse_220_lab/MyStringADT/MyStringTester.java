public class MyStringTester{
  public static void main(String [] args){
    //DID not inlcude  test cases for all methods
     
    MyString ab= new MyString("Venice");
    MyString bc= new MyString("Venice");
    MyString cd= new MyString("Venice");
    MyString de= new MyString("VeNICe");
    MyString ef= new MyString("VeNICe");
    MyString fg= new MyString("VeNICe");
    MyString gh= new MyString("VceNIce");
    MyString hi= new MyString("VceNIce");
    MyString ij= new MyString("VcccIce");
    MyString jk= new MyString("VeccIce");
    MyString kl= new MyString("Venice beach is");
    char[] q={'n','o','t',' ','g','o','o','d'};
    MyString lm= new MyString("Venice beach is");
    MyString mn= new MyString("Venice beach is");
     MyString mt= new MyString("VcI cc cIce");
     
    System.out.println(ab.replaceFirst('e','q'));
    System.out.println(bc.replaceLast('c','z'));
    System.out.println(cd.replaceAll('e','z'));
    System.out.println(de.toLowerCase());
    System.out.println(ef.toUpperCase());
    System.out.println(fg.indexOf('I'));
    System.out.println(gh.lastIndexOf('c'));
    System.out.println(ij.lastIndexOf('c',3));
   System.out.println(jk.indexOf("cI"));
   System.out.println(mt.lastIndexOf("cI"));
   
   System.out.println(kl.concat(" awesome"));
   System.out.println(lm.concat(q));
   System.out.println(mn.equalsIgnoreCase("venice beaCh Is"));
   
   
     MyString qc=new MyString("Venice");
   System.out.println(qc.length());
     MyString tc=new MyString("Venice");
   System.out.println(tc.charAt(0));
     MyString st=new MyString("Venice beach is awe");
  System.out.println(st.startsWith("Venc"));
  
    System.out.println("      ");
   MyString ii=new MyString("Venice beach is awe");
  System.out.println(st.startsWith(ii));
  MyString sqtr = new MyString("Venice"); 
   MyString sqt = new MyString("Venice"); 
     System.out.println(sqt.compareTo(sqtr));  
  
   System.out.println("      ");
  
    MyString tv=new MyString("Venice beach is awe");
  System.out.println(tv.equals("Venice beach is awe"));
  
    System.out.println("///////");
       MyString ssa=new MyString("Venice beach is awe");
      System.out.println(tv.equals(ssa));
      System.out.println("////");
  
    MyString qp=new MyString("Venice beach is awe");
  System.out.println(qp.endsWith("we"));
  MyString pn=new MyString("Venice beach is awe");
  System.out.println(pn.substring(4));
  MyString sn=new MyString("Venice beach is awe");
  System.out.println(sn.substring(4,11));
 MyString sq = new MyString("Venice"); 
     System.out.println(sq.compareTo("Venice"));  
     
      MyString qq = new MyString("VeNiCe"); 
     System.out.println(qq.compareToIgnoreCase("vEniCe"));  
     
     MyString qs = new MyString("VeNiCe"); 
     System.out.println(qq.compareToIgnoreCase(qs));
     
      MyString tyt = new MyString("Venice"); 
        System.out.println(kl.concat(tyt));
  }
}
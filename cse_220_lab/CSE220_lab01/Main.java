public class Main{
 public static void main(String[] args){
   BankAccount acc1=new BankAccount();
   BankAccount acc2=new BankAccount();
   BankAccount acc3=new BankAccount();
   
acc1.setName("Tanzim");
acc1.setAccountID("182");
acc1.setAddress("anfield");
acc1.setBalance(500000.50); 
 
acc2.setName("Sartaj");
acc2.setAccountID("183");
acc2.setAddress("banani");
acc2.setBalance(700000.50); 

acc3.setName("Tandip");
acc3.setAccountID("paris");
acc3.setAddress("anfield");
acc3.setBalance(600000.10); 
 
 acc1.addInterest();
 acc3.addInterest();
 
 System.out.println(acc1.getName());
 System.out.println(acc1.getAccountID());
 System.out.println(acc1.getAddress());
 System.out.println(acc1.getBalance());
 
 System.out.println("--------------");
 
 System.out.println(acc2.getName());
 System.out.println(acc2.getAccountID());
 System.out.println(acc2.getAddress());
 System.out.println(acc2.getBalance());
 
 
 System.out.println("--------------");
 
 System.out.println(acc3.getName());
 System.out.println(acc3.getAccountID());
 System.out.println(acc3.getAddress());
 System.out.println(acc3.getBalance());
  
 System.out.println("--------------");
 
 BankAccount acc4=new BankAccount("Ari","gulshan","171",860000);
 System.out.println(acc4.getName());
 System.out.println(acc4.getAccountID());
 System.out.println(acc4.getAddress());
 System.out.println(acc4.balance);

 } 
}
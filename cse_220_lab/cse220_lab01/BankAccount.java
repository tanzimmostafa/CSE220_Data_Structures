public class BankAccount{
    public String name;
    public String address;
    public String accountID; 
    public  double balance;
    
    BankAccount(){
    
    }
    
    BankAccount( String n,String add,String id,double ba){
    name=n;
    address=add;
    accountID=id;
    balance=ba;
    }
      
  public String getName(){
   return name; 
    }
    public void setName(String n){
     name=n;
    }
    public String getAccountID(){
     return accountID;
    }
    public void setAccountID(String i){
     accountID=i;
    }
    public String getAddress(){
     return address;
    }
    public void setAddress(String a){
     address=a;
    }
    public double getBalance(){
     return balance;
    }
    public void setBalance(double c){
     balance=c;
    }
    public void addInterest(){
     balance=balance+(0.07*balance);
    }     
}
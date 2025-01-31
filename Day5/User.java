package Day5;

public class User {
    String name;
    String phnNo;
    String accNo;
    double balance;
    String PIN;
    public User(String name,String phnNo,double balance,String PIN,String accNo){
        this.name = name;
        this.phnNo = phnNo;
        this.balance = balance;
        this.PIN = PIN;
        this.accNo = accNo;
    }

    // getter methods
    public String getUserName(){
        return name;
    }
    public String getUserPhnNo(){
        return phnNo;
    }
    public String getAcctNo(){
        return accNo;
    }
    public double getBalance(){
        return balance;
    }
    public String getPin(){
        return PIN;
    }
    // setter methods
    public void setName(String n){
        name = n;
    }
    public void updatePhnNo(String str){
        phnNo = str;
    }
    public void setAccNo(String no){
        accNo = no;
    }
    public void updateBalance(double b){
        balance = b;
    }
    public void updatePin(String PIN){
        this.PIN = PIN;
    }

}
